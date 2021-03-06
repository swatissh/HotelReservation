package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("1. Enter a new guest's details: ");
        System.out.println("2. Update a guest's details: ");
        System.out.println("3. Search a guest's details: ");
        System.out.println("4. Create a reservation");


        do {
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            if(choice==10) {
                break;
            }
            switch(choice) {
                case 1:
                    long num = 1234567890;
                    System.out.println("Create/Update/Search guests detail (Search by name using keyword/s) ");
                    break;
                case 2:
                    System.out.println("Create/Update/Remove/Print reservation");
                    break;
                case 3:
                    System.out.println("Create/Update rooms details (include setting status like ‘Under Maintenance");
                    break;
                case 4:
                    System.out.println("Entering room service orders - list menu items for selection \n");
                    break;
                case 5:
                    System.out.println("Create/Update/Remove room service menu items.");
                    break;
                case 6:
                    System.out.println("Room availability");
                    break;
                case 7:
                    System.out.println("Room Check-in (for walk-in or reservation)");
                    break;
                case 8:
                    System.out.println("Room Check-out and print bill invoice (with breakdowns on days of stay, room service order items\n" +
                            "and its total, tax and total amount) ");
                    break;
                case 9:
                    System.out.println("Print Room Status statistic report by ");
                    break;
                default:
                    System.out.println("only choose between ");

            }
        }while(choice!=10);




        sc.close();
    }
}
