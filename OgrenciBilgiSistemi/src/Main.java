// Öğrenci Not Sistemi

//Ödev
//Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
// Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.
//
//Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
//
//Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
//
//Fizik Ortalaması : (90 * 0.20) + (60* 0.80);

public class Main {
    public static void main(String[] args) throws Exception {
        // Öğrenciler
        Student kemalStudent = new Student("Kemal Öğrenci", 1, 4);
        kemalStudent.print();
        Student pelinStudent = new Student("Pelin Öğrenci", 2, 3);
        pelinStudent.print();
        Student bahadirStudent = new Student("Bahadır Öğrenci", 3, 2);
        bahadirStudent.print();

        // Öğretmenler
        Teacher ayseTeacher = new Teacher("Ayşe Öğretmen", 1, "Science Studies");
        ayseTeacher.print();
        Teacher fatmaTeacher = new Teacher("Fatma Öğretmen", 2, "Science Studies");
        fatmaTeacher.print();
        Teacher tahirTeacher = new Teacher("Tahir Öğretmen", 3, "Social Studies");
        tahirTeacher.print();

        // Dersler
        Course physicCourse = new Course("Fizik", "PHY","Science Studies");
        physicCourse.print();
        Course economicsCourse = new Course("Ekonomi", "ECO","Social Studies");
        economicsCourse.print();

        // Derslere Öğretmenler Atama
        TeacherCourse aysePhysicCourse = new TeacherCourse("teacherCourse1", ayseTeacher, physicCourse);
        TeacherCourse fatmaPhysicCourse = new TeacherCourse("teacherCourse2", fatmaTeacher, physicCourse);
        TeacherCourse tahirEconomicsCourse = new TeacherCourse("teacherCourse3", tahirTeacher, economicsCourse);

        // Öğretmenlerin açtığı derslere öğrencileri atama
        StudentTeacherCourse kemalAysePhysicCourse = new StudentTeacherCourse("studentTeacherCourse1", kemalStudent, aysePhysicCourse);
        StudentTeacherCourse pelinFatmaPhysicCourse = new StudentTeacherCourse("studentTeacherCourse2", pelinStudent, fatmaPhysicCourse);
        StudentTeacherCourse bahadirTahirEconomicsCourse = new StudentTeacherCourse("studentTeacherCourse3", bahadirStudent, tahirEconomicsCourse);

        // Öğrencilere notlar verelim
        kemalAysePhysicCourse.addPaperExamNote(60);
        kemalAysePhysicCourse.addVerbalExamNote(90);
        kemalAysePhysicCourse.printNotes();

        pelinFatmaPhysicCourse.addPaperExamNote(82);
        // pelinFatmaPhysicCourse.addVerbalExamNote(50);
        pelinFatmaPhysicCourse.printNotes(); // Throws an exception

        bahadirTahirEconomicsCourse.addPaperExamNote(45);
        bahadirTahirEconomicsCourse.addVerbalExamNote(50);
        bahadirTahirEconomicsCourse.printNotes();
    }
}
