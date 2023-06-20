package sheridan.phamduya.midtermexam

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import sheridan.phamduya.midtermexam.data.Teacher
import sheridan.phamduya.midtermexam.data.teachers

class MainViewModel: ViewModel() {
    private val _uiState: MutableState<List<Teacher>> = mutableStateOf(teachers)
    val uiState: State<List<Teacher>> = _uiState
}