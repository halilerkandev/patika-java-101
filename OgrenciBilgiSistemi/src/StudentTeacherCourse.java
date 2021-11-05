public class StudentTeacherCourse {
    String studentTeacherCourseId;
    Student student;
    TeacherCourse teacherCourse;
    double paperExamNote = -1;
    double verbalExamNote = -1;

    StudentTeacherCourse(String studentTeacherCourseId, Student student, TeacherCourse teacherCourse) {
        this.studentTeacherCourseId = studentTeacherCourseId;
        this.student = student;
        this.teacherCourse = teacherCourse;
    }

    public void addPaperExamNote(double paperExamNote) throws Exception {
        if(paperExamNote < 0 || paperExamNote > 100) {
            throw new Exception("Sözlü notu 0'dan küçük, 100'den büyük olamaz!");
        }
        this.paperExamNote = paperExamNote;
    }

    public void addVerbalExamNote(double verbalExamNote) throws Exception {
        if(verbalExamNote < 0 || verbalExamNote > 100) {
            throw new Exception("Sözlü notu 0'dan küçük, 100'den büyük olamaz!");
        }
        this.verbalExamNote = verbalExamNote;
    }

    public void printNotes() throws Exception {
        System.out.println(
                "\nStudent: " + student.name +
                        "\nTeacher: " + teacherCourse.teacher.name +
                        "\nCourse: " + teacherCourse.course.name +
                        "\nPaper Exam Note: " +
                        (this.paperExamNote == -1 ? "Açıklanmadı!\n" : this.paperExamNote) +
                        "\nVerbal Exam Note: " +
                        (this.verbalExamNote == -1 ? "Açıklanmadı!\n" : this.verbalExamNote) +
                        "\navarage: " + avarage() +
                        "\nisPass: " + isPass()
        );
    }

    public double avarage() throws Exception {
        if(this.paperExamNote == -1 || this.verbalExamNote == -1) {
            throw new Exception("Eksik not varsa ortalama hesaplanamaz!");
        }
        return this.paperExamNote * 0.8 + this.verbalExamNote * 0.2;
    }

    public boolean isPass() {
        try {
            return avarage() > 55;
        }
        catch (Exception e) {
            System.out.println("isPass methodunda hata yakalandı: " + e.getMessage());
            return false;
        }
    }
}
