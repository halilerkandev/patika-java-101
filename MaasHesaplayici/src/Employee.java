public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        return salary < 1000 ? 0 : salary * 0.03;
    }

    public double bonus() {
        return workHours <= 40 ? 0 : (workHours - 40) * 30;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int workYears = currentYear - hireYear;
        return salary * (workYears < 10 ? 0.05 : workYears < 20 ? 0.1 : 0.15);
    }

    public String toString() {
        String desc = "Adı : " + name +
                "\nMaaşı : " + salary +
                "\nÇalışma Saati : " + workHours +
                "\nBaşlangıç Yılı : " + hireYear +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş Artışı : " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : " + (salary + bonus() - tax()) +
                "\nToplam Maaş : " + (salary + raiseSalary());
        System.out.println(desc);
        return desc;
    }
}
