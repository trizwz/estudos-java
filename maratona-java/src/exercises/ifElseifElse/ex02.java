package exercises.ifElseifElse;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        //programa onde o sistema vê se o usuário pode beber bebida alcoólica.
        Scanner number = new Scanner(System.in);
        int age;
        System.out.print("Insert your age:");
        age = number.nextInt();

        if (age >= 18){
            System.out.println("Você pode beber alcool.");
        } else if (age < 18) {
            System.out.println("Você não pode beber alcool");
        } else {
            System.out.println("Insira a sua idade novamente.");
        }
    }
}
