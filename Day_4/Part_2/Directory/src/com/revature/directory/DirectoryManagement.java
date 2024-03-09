package com.revature.directory;



import java.util.ArrayList;
import java.util.Scanner;

public class DirectoryManagement {
    static ArrayList<Directory>directory=new ArrayList<>();
    static  Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    createEntry();
                    break;
                case 2:
                    editEntry();
                    break;
                case 3:
                    searchByKeyword();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");

                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice !");
            }
        }
    }

    private static void createEntry() {
        System.out.println("\nEnter the details for the new entry:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Telephone Number (with STD code, if available): ");
        String telephoneNumber = sc.nextLine();

        System.out.print("Mobile Number (if available): ");
        String mobileNumber = sc.nextLine();

        System.out.print("Head of Family: ");
        String headOfFamily = sc.nextLine();

        System.out.print("Unique ID: ");
        String uniqueID = sc.nextLine();

        for (Directory entry : directory) {
            if (entry.getUniqueId().equalsIgnoreCase(uniqueID)) {
                System.out.println("Error: Unique ID already exists. Please choose a different one.");
                return;
            }
        }


        if (telephoneNumber != null && !telephoneNumber.isEmpty()) {
            for (Directory entry : directory) {
                if (headOfFamily.equalsIgnoreCase(entry.headOfFamily) && telephoneNumber.equals(entry.telephoneNumber)) {
                    System.out.println("Error: Two persons cannot have the same telephone number unless they are in the same family.");
                    return;
                }
            }
        }

        directory.add(new Directory(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID));
        System.out.println("Entry added successfully.");
    }

    private  static void editEntry() {
        System.out.print("Enter the Unique ID of the entry to edit: ");
        String uniqueID = sc.nextLine();

        for (Directory entry : directory) {
            if (entry.getUniqueId().equalsIgnoreCase(uniqueID)) {
                System.out.println("Current Information:\n" + entry);
                System.out.println("Enter the new details:");

                System.out.print("Name: ");
                entry.setName(sc.nextLine());

                System.out.print("Address: ");
                entry.setAddress(sc.nextLine());

                System.out.print("Telephone Number (with STD code, if available): ");
                entry.telephoneNumber = sc.nextLine();

                System.out.print("Mobile Number (if available): ");
                entry.setMobNumber(sc.nextLine());

                System.out.print("Head of Family: ");
                entry.headOfFamily = sc.nextLine();

                System.out.println("Entry edited successfully.");
                return;
            }
        }

        System.out.println("Error: Entry with Unique ID " + uniqueID + " not found.");
    }

    private static void searchByKeyword() {
        System.out.print("Enter the keyword to search: ");
        String keyword = sc.nextLine();

        System.out.println("\nSearch Results:");

        for (Directory entry : directory) {
            if (entry.matchKeyWord(keyword)) {
                System.out.println(entry);
            }
        }
    }


}
