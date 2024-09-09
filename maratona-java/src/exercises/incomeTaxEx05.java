package exercises;

import java.util.Scanner;

/*insira o valor do seu salário, e, de acordo com o valor dele,
 * vc terá que pagar uma certa quantia de imposto.*/

public class incomeTaxEx05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tax1 = 9.70 / 100;
        double tax2 = 37.35 / 100;
        double tax3 = 49.50 / 100;
        double salary;
        double taxValue = 0;

        System.out.print("Informe seu salário: ");
        salary = sc.nextDouble();

        if (salary <= 34712) {
            taxValue = salary * tax1;
        } else if (salary >= 34712 && salary <= 68508) {
            taxValue = salary * tax2;
        } else {
            taxValue = salary * tax3;
        }

        System.out.println("Você terá que pagar: " + taxValue);
        sc.close();
    }
}
