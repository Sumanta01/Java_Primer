package com.sumanta.revature;

import java.util.Arrays;

public class Employee {

    private String name;
    private double salary;
    private String dob;

    public Employee(String name, double salary, String dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dob='" + dob + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee []emp= {new Employee("Sumanta", 45000, "10-4-2023"),
                new Employee("Jane Smith", 60000, "2022-02-20"),
                new Employee("Bob Johnson", 55000, "2022-03-10"),
                new Employee("Alice Williams", 70000, "2022-04-05"),
                new Employee("Charlie Brown", 45000, "2022-05-12"),
                new Employee("Eva Davis", 52000, "2022-06-18"),
                new Employee("Frank Wilson", 62000, "2022-07-25"),
                new Employee("Grace Taylor", 58000, "2022-08-30"),
                new Employee("Henry Miller", 48000, "2022-09-08"),
                new Employee("Ivy Martin", 53000, "2022-10-14"),
        };
        System.out.println(Arrays.toString(emp));
    }
}
