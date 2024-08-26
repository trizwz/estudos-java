package exercises.ifElseifElse;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num;

        System.out.println("Insert a number: ");
        num = number.nextInt();

        if (num < 0) {
            System.out.println("This is a negative number.");
        } else if (num > 0) {
            System.out.println("This is a positive number.");
        } else {
            System.out.println("Is a zero.");
        }
    }
}
