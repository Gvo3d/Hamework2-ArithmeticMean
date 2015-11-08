package Homework2;
/**
 * Made by Yakimov Denis, 08/11/2015 for Hillel Java course       Homework 2
 */

import java.util.Scanner;

public class TextGraphic {
    public static void main(String[] args) {
        System.out.println("Text Graphic");
        System.out.println("Made by Yakimov Denis for Hillel Java Courses.");
        System.out.println("Input number of lines and number of columns.");
        byte lenght = 0;
        byte height = 0;

        while (lenght == 0) {
            System.out.println("Input number of LINES");
            Scanner in = new Scanner(System.in);
            if (in.hasNextByte()) {
                lenght = in.nextByte();
            } else System.out.println("Error in data input, reinput number of lines!");
        }

        while (height == 0) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input number of COLUMNS");
            if (in.hasNextByte()) {
                height = in.nextByte();
            } else System.out.println("Error in data input, reinput number of columns!");
        }

        Square(lenght, height);
        Letter(lenght);
        Checkmate(lenght, height);
    }


    public static void star() {
        System.out.print("*");
    }

    public static void space() {
        System.out.print(" ");
    }

    public static void enter() {
        System.out.println();
    }

    public static void Square(byte lines, byte columns) {
        enter();
        enter();
        for (byte i = 1; i <= columns; i++) star();
        enter();

        for (byte i = 1; i < (lines - 1); i++) {
            star();
            for (byte j = 1; j < (columns - 1); j++) space();
            star();
            enter();
        }

        for (byte i = 1; i <= columns; i++) star();
        enter();
    }

    public static void Letter(byte lines) {
        enter();
        enter();
        byte backdoorcolumns;
        for (byte i = 1; i <= lines; i++) star();
        enter();

        for (byte i = 1; i < (lines - 1); i++) {
            star();
            backdoorcolumns = (byte) (lines - i);
            for (byte j = 1; j < (lines - 1); j++) {
                if ((j == i) || (j == (backdoorcolumns - 1))) star();
                else space();
            }
            star();
            enter();
        }

        for (byte i = 1; i <= lines; i++) star();
        enter();
    }

    public static void Checkmate(byte lines, byte columns) {
        enter();
        enter();
        for (byte i = 1; i <= lines; i++) {
            for (byte j = 1; j <= columns; j++) {
                if ((i % 2 == 0) && (j % 2 == 0)) star();
                else if (!(i % 2 == 0) && !(j % 2 == 0)) star();
                else space();
            }
            enter();
        }
    }

}
