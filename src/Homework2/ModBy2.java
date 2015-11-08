package Homework2;

import java.util.Scanner;

/**
 * Made by Yakimov Denis, 08/11/2015 for Hillel Java course       Homework 2
 */
public class ModBy2 {
    public static void main(String[] args) {
        System.out.println("ModBy2");
        System.out.println("Made by Yakimov Denis for Hillel Java Courses.");
        int number = 0;

        while (number == 0) {
            System.out.println("Input an integer value number!");
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
                number = in.nextByte();
            } else System.out.println("Error in data input, reinput number!");
        }

        switch (number % 2) {
            case 0:
                System.out.println("The number has a parity!");
                break;
            default:
                System.out.println("The number is odd!");
                break;
        }
    }
}
