public class Course {
    String name;
    String code;
    String prefix;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    public void print() {
        System.out.println("Course(name: " + this.name + ", code: " + code + ", prefix: " + prefix + ")");
    }
}
