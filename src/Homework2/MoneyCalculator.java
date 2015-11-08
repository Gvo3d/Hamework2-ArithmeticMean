package Homework2;
/**
 * Made by Yakimov Denis, 08/11/2015 for Hillel Java course       Homework 2
 */

import java.util.Scanner;

public class MoneyCalculator {
    public static void main(String[] args) {

        System.out.println("Money Calculator");
        System.out.println("For Hillel Java Courses by Yakimov Denis");
        System.out.println("Enter cash sum, one-year-percentage and number of years.");
        double CashSum = 0;
        byte Percentage = 0;
        byte Years = 0;
        double Aliments = 0;

        for (int i = 0; i <= 3; i++) {
            Scanner InputScanner = new Scanner(System.in);
            switch (i) {
                case 0:
                    if (InputScanner.hasNextDouble()) {
                        CashSum = InputScanner.nextDouble();
                    } else Ending();
                    break;
                case 1:
                    if (InputScanner.hasNextByte()) {
                        Percentage = InputScanner.nextByte();
                    } else Ending();
                    break;
                case 2:
                    if (InputScanner.hasNextByte()) {
                        Years = InputScanner.nextByte();
                    } else Ending();
                    break;
            }
        }

        int i;
        for (i = 0; i < Years; i++) {
            Aliments = CashSum * Percentage / 100;
            CashSum = CashSum + Aliments;
            System.out.println("Year " + (i+1));
            System.out.print("Cash sum is ");
            System.out.format("%.2f%n",  CashSum);
            System.out.print("Percentage value for a year is ");
            System.out.format("%.2f%n", Aliments);
            System.out.println();
        }
        System.exit(0);
    }

    public static void Ending() {
        System.out.println("ERROR IN STATEMENT!");
        System.exit(0);
    }


}
