package exercises;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        //10 pessoas
        int gender;
        int qtHomens = 0;
        int qtMulheres = 0;
        float height = 0F;
        float mediaHomens = 0;
        float maior = 0;
        float menor = 0;
        float somaH = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira seu gênero:\n1 - Feminino\n2 - Masculino");
            gender = sc.nextInt();
            System.out.println("Insira sua altura: ");
            height = sc.nextFloat();

            if (gender == 1) {
                qtMulheres++;
            } else if (gender == 2) {
                qtHomens++;
                somaH = somaH + qtHomens;
            } else {
                System.out.println("Gênero inválido!!!");
            }
            if (height > maior) {
                maior = height;
            } else if (height < menor) {
                menor = height;
            }
        }

            mediaHomens = somaH / qtHomens;
            System.out.println("A maior altura do grupo é " + maior + "m, e a menor é de " + menor + "m");
            System.out.println("A média de altura dos homens é " + mediaHomens + "m");
            System.out.println("O número de mulheres é " + qtMulheres);
            sc.close();
    }
}
 /*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
        Fazer um algoritmo que calcule e escreva:
         a. a maior e a menor altura do grupo;
        b. média de altura dos homens;
        c. o número de mulheres*/