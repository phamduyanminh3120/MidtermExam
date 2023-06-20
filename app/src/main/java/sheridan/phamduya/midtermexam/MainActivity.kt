package sheridan.phamduya.midtermexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import sheridan.phamduya.midtermexam.data.Teacher
import sheridan.phamduya.midtermexam.ui.theme.MidtermExamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MidtermExamTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MidtermExamApp()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MidtermExamTheme {

    }
}

@Composable
fun MidtermExamApp(){
    val viewModel: MainViewModel = viewModel()
    val teacherList: List<Teacher> by viewModel.uiState

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(horizontal = 15.dp, vertical = 8.dp)
    ){
        items(teacherList) { teacher ->
            TeacherList(teacher)
        }
    }
}

@Composable
fun TeacherList(teacher: Teacher){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color.LightGray),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ) {
        Text("Name: ${teacher.name}", style = MaterialTheme.typography.headlineLarge)
        Text("Weekly Hours: ${teacher.hour}", style = MaterialTheme.typography.bodyLarge)
        Text("Employment Status: ${teacher.employementStatus}", style = MaterialTheme.typography.bodyLarge)
        Text("Certification: ${if (teacher.certification) "Yes" else "No"}", style = MaterialTheme.typography.bodyLarge)
    }
}