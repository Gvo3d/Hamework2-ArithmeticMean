package Arithmetic_mean;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Arithetic mean");
        System.out.println("For Hillel Java Courses by Yakimov Denis");
        System.out.println("Enter any count of numbers. After that - input \"e\" for result and program end.");
        long SumOfAllNumbers = 0;
        int NumberCount = 0;
        String EndFlag;

        while (true) {
            Scanner InputScanner = new Scanner(System.in);
            EndFlag = InputScanner.nextLine();
            EndFlag=EndFlag.toUpperCase();
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
