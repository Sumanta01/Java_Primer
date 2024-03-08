public class EmployeeInfo {
    private double salary;
    private int hours;


    public void getInfo(double salary, int hours) {
        this.salary = salary;
        this.hours= hours;
    }


    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork() {
        if (hours > 6) {
            salary += 5;
        }
    }


    public void printFinalSalary() {
        System.out.println("Final Salary: $" + salary);
    }
}
