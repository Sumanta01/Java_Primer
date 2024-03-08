public class Student {

    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    public static void main(String[] args) {
        Student st1=new Student("Sumanta",199);
        System.out.println(st1);
        Student st2=new Student("Tener",433);
        System.out.println(st2);




    }
}
