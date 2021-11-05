public class Teacher {
    String name;
    int mpno;
    String branch;

    Teacher(String name, int mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void print() {
        System.out.println("Teacher(name: " + this.name + ", mpno: " + mpno + ", branch: " + branch + ")");
    }
}
