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
    }
}
