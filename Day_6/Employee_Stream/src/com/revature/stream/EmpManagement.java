package com.revature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpManagement {
    public static void main(String[] args) {
        List<Employee> emp= Arrays.asList(
                new Employee(199,"Sumanta",500000),
                new Employee(108,"Siri",340000),
                new Employee(139,"Alice",200000),
                new Employee(179,"Bob",150000),
                new Employee(132,"Harry",450000)
        );


        System.out.println("Employee with salary >400000");
        List<Employee>res= emp.stream().filter(i->i.getSalary()>400000).collect(Collectors.toList());
        System.out.println(res);

        System.out.println("Updating employee salary by 25%:");
        List<Double>res2=emp.stream().map(e->e.getSalary()*1.25).collect(Collectors.toList());
        System.out.println(res2);

       List<String>res3= emp.stream().map(i->i.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println(res3);

    }
}
