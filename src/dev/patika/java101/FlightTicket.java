package dev.patika.java101;

import java.util.Scanner;

public class FlightTicket {

	public static void main(String[] args) {
		
        int distance;
        int age;
        int ticketType;
        double perKm = 0.1;

        Scanner input = new Scanner(System.in);
        System.out.print("please enter the distance: ");
        distance = input.nextInt();
        System.out.print("please enter your age: ");
        age = input.nextInt();
        System.out.println("1-OneWay Ticket\n2-Return Ticket");
        System.out.print("please select the type of ticket:");
        ticketType = input.nextInt();
        input.close();

        double totalCost = distance * perKm;
        double age12Discount = (totalCost / 2);
        double age24Discount = totalCost - (totalCost * 0.1);
        double age65discount = totalCost - (totalCost * 0.3);

        if (age > 0 && distance > 0 && ticketType > 0 && ticketType < 3) {

            System.out.println("the price:" + totalCost);

            if (age < 12) {
                totalCost = age12Discount;
            } else if (12 <= age && age <= 24) {
                totalCost = age24Discount;
            } else if (age > 65) {
                totalCost = age65discount;
            }
            if (ticketType == 2) {
                totalCost = (totalCost - (totalCost * 0.2)) * 2;
            }
            System.out.println("discounted price:" + totalCost);

        } else {
            System.out.println("wrong selection, please try again!");
        }
    }
}
