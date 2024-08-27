package exercises.ifElseifElse;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.print("Insira sua idade: ");
        idade = sc.nextInt();

        if (idade < 18) {
            System.out.println("Você NÃO tem a idade apropiada para jogar MKT.X");
        } else if (idade >= 18) {
            System.out.println("Você pode jogar MKT.X");
        } else {
            System.out.println("Insira sua idade corretamente.");
        }
    }
}
