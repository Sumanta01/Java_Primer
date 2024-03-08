public class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
    public void display(){
        System.out.printf("%-10s%-20s%-20s%-20s%n", name, yearOfJoining, salary, address);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Robert", 1994, 50000.0, "64C- WallsStreet");
        Employee e2 = new Employee("Sam", 2000, 60000.0, "68D- WallsStreet");
        Employee e3 = new Employee("John", 1999, 55000.0, "26B- WallsStreet");
        System.out.printf("%-10s%-20s%-20s%-20s%n", "Name", "Year of Joining", "Salary", "Address");

        e1.display();
        e2.display();
        e3.display();

    }
}
