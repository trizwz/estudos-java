package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class aula05EstruturasCondicioais05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insert your gender: ");
        char gender = sc.next().charAt(0);

        switch (gender) {
            default:
                System.out.println("insert your gender.");
                break;
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            case 'D':
                System.out.println("any.");
                break;
        }


        Scanner sc2 = new Scanner(System.in);

        System.out.println("Tell me a day in a week");
        byte day = sc2.nextByte();

        switch (day) {
            default:
                System.out.println("Invalid option.");
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }

    }
}
