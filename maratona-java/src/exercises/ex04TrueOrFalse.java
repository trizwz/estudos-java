package exercises;

import java.util.Scanner;

public class ex04TrueOrFalse {
    public static void main(String[] args) {
        //variavel (nome da variavel) = condição ? true : false
        Scanner sc = new Scanner(System.in);
        int salary;
        String msgTrue = "you can buy a PS5.";
        String msgFalse = "you can't buy a PS5.";

        System.out.println("Saldo da sua conta bancária: ");
        salary = sc.nextInt();
        String result = salary >= 3750 ? msgTrue : msgFalse;
        System.out.println(result);
    }
}
