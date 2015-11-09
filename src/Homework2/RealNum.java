package Homework2;

import java.util.Scanner;

/**
 * Created by ITHILLEL7 on 09.11.2015.
 */
public class RealNum {
    public static void main(String[] args) {
        System.out.println("RealNumber");
        System.out.println("Made by Yakimov Denis for Hillel Java Courses.");
        int number = 0;

        while (number == 0) {
            System.out.println("Input an integer value number!");
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
                number = in.nextByte();
            } else System.out.println("Error in data input, reinput number!");
        }

        for (int i = 2; i<=number; i++){
            if (!(number % i==0)) {
                System.out.println("Number is not real!");
                System.exit(0);}
        }
        System.out.println("Number is real!");
    }
}
