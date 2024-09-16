package exercises;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        /*Criar um programa que calcule a média de salários
         de uma empresa, pedindo ao usuário a grade de funcionários
         e os salários, e devolvendo a média salarial.
         número de funcionarios : 4*/
        Scanner sc = new Scanner(System.in);
        double f1, f2, f3, f4, media;

        System.out.println("Insira o salário dos quatro funcionários:");
        f1 = sc.nextDouble();
        f3 = sc.nextDouble();
        f2 = sc.nextDouble();
        f4 = sc.nextDouble();
        media = f1 + f2 + f3 + f4 / 4;

        System.out.println("A média salarial da empresa é:" + media +"\nSalário dos funcionários:\nFuncionário 1: "+f1
                +"\nFuncionário 2: " +f2+ "\nFuncionário 3: "+f3+"\nFuncionário 4: "+f4);

    }
}
