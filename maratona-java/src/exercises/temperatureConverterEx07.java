package exercises;

import java.util.Scanner;

public class temperatureConverterEx07 {
    public static void main(String[] args) {
        // conversor de temperatura
        System.out.println("Escolha um tipo de temperatura: ");
        System.out.println("1 - Fahrenheit\n2 - Réaumur\n3 - Rankine\n4 - Kelvin");
        Scanner typeTemperature = new Scanner(System.in);
        int typeTemp = typeTemperature.nextInt();

        System.out.println("Coloque o valor da temperatura: ");
        int c = typeTemperature.nextInt();

        switch (typeTemp) {
            default:
                System.out.println("Temperatura: " + c);
                break;
            case 1:
                double farenheit = Math.round(c * 1.8 + 32);
                System.out.println("Temperatura em Fahrenheit: " + farenheit);
                break;
            case 2:
                double reaumur = Math.round(c * 0.8);
                System.out.println("Temperatura em Réaumur: " + reaumur);
                break;
            case 3:
                double rankine = Math.round((c + 273.15) * 9 / 5);
                System.out.println("Temperatura em Rankine: " + rankine);
                break;
            case 4:
                double kelvin = Math.round(c + 273.1);
                System.out.println("Temperatura em Kelvin: " + kelvin);
                break;

        }
        typeTemperature.close();

    }
}
