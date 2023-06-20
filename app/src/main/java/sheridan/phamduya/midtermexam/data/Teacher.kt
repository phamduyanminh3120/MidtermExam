package sheridan.phamduya.midtermexam.data

data class Teacher(
    val name: String,
    val hour: Int,
    val employementStatus: EmployementStatus,
    val certification: Boolean
)

val teachers = listOf(
    Teacher("Alexander", 30, EmployementStatus.FULL_TIME, true),
    Teacher("Minh", 30, EmployementStatus.FULL_TIME, true),
    Teacher("Pham", 30, EmployementStatus.PART_TIME, true),
    Teacher("Martin", 30, EmployementStatus.PART_TIME, false),
    Teacher("Mike", 30, EmployementStatus.SESSIONAL, false),
    Teacher("Tylor", 30, EmployementStatus.SESSIONAL, true),
    Teacher("Louis", 30, EmployementStatus.FULL_TIME, false),
    Teacher("Wright", 30, EmployementStatus.PART_TIME, false),
)