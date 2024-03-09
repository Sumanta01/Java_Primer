package com.sumanta.revature;

import  java.util.Scanner;
public class Students {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int numStudents = 8;
            int numSubjects = 3;

            int[] rollNumbers = new int[numStudents];
            int[][] marks = new int[numStudents][numSubjects];

            for (int i = 0; i < numStudents; i++) {
                System.out.println("Enter Roll Number for Student " + (i + 1) + ": ");
                rollNumbers[i] = scanner.nextInt();

                System.out.println("Enter Marks for Student " + (i + 1) + " in Three Subjects (out of 100): ");
                for (int j = 0; j < numSubjects; j++) {
                    System.out.println("Enter Marks for Subject " + (j + 1) + ": ");
                    marks[i][j] = scanner.nextInt();
                }
            }


            for (int i = 0; i < numStudents; i++) {
                int totalMarks = 0;
                for (int j = 0; j < numSubjects; j++) {
                    totalMarks += marks[i][j];
                }
                double averageMarks = (double) totalMarks / numSubjects;

                System.out.println("Roll Number: " + rollNumbers[i] + ", Average Marks: " + averageMarks);
            }


        }
    }


