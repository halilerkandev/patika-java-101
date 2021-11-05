public class Student {
    String name;
    int stuNo;
    int classes;

    Student(String name, int stuNo, int classes) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
    }

    public void print() {
        System.out.println("Student(name: " + this.name + ", stuNo: " + stuNo + ", classes: " + classes + ")");
    }
}
