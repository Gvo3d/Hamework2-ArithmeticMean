package Homework2;
/**
 Made by Yakimov Denis, 08/11/2015 for Hillel Java course       Homework 2
 */
import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        System.out.println("Arithetic mean");
        System.out.println("For Hillel Java Courses by Yakimov Denis");
        System.out.println("Enter any count of numbers. After that - input \"e\" for result and program end.");
        long SumOfAllNumbers = 0;
        int NumberCount = 0;
        String EndFlag;

        //Main while-loop without break
        while (true) {
            Scanner InputScanner = new Scanner(System.in);
            EndFlag = InputScanner.nextLine();
            EndFlag = EndFlag.toUpperCase();
            if (InputScanner.hasNextLong()) {
                SumOfAllNumbers = SumOfAllNumbers + InputScanner.nextLong();
                NumberCount++;
            }
            if (EndFlag.equals("E")) {
                System.out.println("The sum is: " + SumOfAllNumbers);
                System.out.println("The number of all summands is: " + NumberCount);
                System.out.println("The arithmetic mean is: " + SumOfAllNumbers / NumberCount);
                System.exit(0);
            }
        }

    }
}
