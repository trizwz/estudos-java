package exercises;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        //conversor de temperatura
        System.out.println("Escolha um tipo de temperatura: ");
        System.out.println("1 - Fahrenheit\n2 - Réaumur\n3 - Rankine\n4 - Kelvin");
        Scanner typeTemperature = new Scanner(System.in);
        int typeTemp = typeTemperature.nextInt();

        System.out.println("Coloque o valor da temperatura: ");
        Scanner celsius = new Scanner(System.in);
        int c = celsius.nextInt();

        //using switch
        switch (typeTemp){
            default:
                System.out.println("Temperatura"+c);
                break;
            case 1:
                System.out.println("Temperatura em Fahrenheit: "+c * 1.8 + 32);
                break;
            case 2:
                System.out.println("Temperatura em Réaumur: "+c * 0.8);
                break;
            case 3:
                System.out.println("Temperatura em Rankine: "+typeTemp * 1.8 + 32 + 459.67);
                break;
            case 4:
                System.out.println("Temperatura em Kelvin: "+c + 273.1);
                break;
        }



    }
}
