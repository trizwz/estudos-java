package exercises;

import java.util.Scanner;

public class salaryEx06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Me informe o seu salário: ");
        int salary = sc.nextInt();
        System.out.println("Me informe a quantos anos você está na empresa: ");
        int years = sc.nextInt();
        int aumento1 = 500;
        int aumento2 = 250;
        int newSalary1 = salary + aumento1;
        int newSalary2 = salary + aumento2;

        if (salary <= 1400 && years > 1) {
            System.out.println("Você receberá um aumento de 500 reais.");
            System.out.println("Seu novo salário: " + newSalary1);
        } else if (salary == 1400 && years > 1) {
            System.out.println("Você receberá um aumento de 250 reais");
            System.out.println("Seu novo salário: " + newSalary2);
        } else {
            System.out.println("Você não receberá nenhum aumento.");
            System.out.println("Seu novo salário: " + salary);
        }
    }
}
