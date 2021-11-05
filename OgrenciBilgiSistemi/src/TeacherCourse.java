public class TeacherCourse {
    String teacherCourseId;
    Teacher teacher;
    Course course;

    TeacherCourse(String teacherCourseId, Teacher teacher, Course course) throws Exception {
        if(!course.prefix.equals(teacher.branch)) {
            throw new Exception(teacher.name + " adlı akademisyen bu dersi veremez!");
        }
        this.teacherCourseId = teacherCourseId;
        this.teacher = teacher;
        this.course = course;
    }
}
