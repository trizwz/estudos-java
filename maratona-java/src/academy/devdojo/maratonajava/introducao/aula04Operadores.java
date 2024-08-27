package academy.devdojo.maratonajava.introducao;

public class aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number1 = 10;
        double number2 = 20;
        double result = number1 / number2;
        System.out.println(result);

        //%
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenLessOrEqualThanTwenty = 10 <= 20;
        boolean isTenBiggerOrEqualThanTwenty = 10 >= 20;
        boolean isTenEqualTen = 10 == 10;
        boolean isTenDifferentOf20 = 10 != 20;

        System.out.println(isTenBiggerThanTwenty);
        System.out.println(isTenLessThanTwenty);
        System.out.println(isTenBiggerOrEqualThanTwenty);
        System.out.println(isTenLessOrEqualThanTwenty);
        System.out.println(isTenEqualTen);
        System.out.println(isTenDifferentOf20);

        // && (AND)
        int age = 29;
        float salary = 3500.0F;
        boolean isInsideOfTheLawOlderThanThirty = age >= 30 && salary > 4512;
        boolean isInsideOfTheLawYoungerThanThirty = age < 30 && salary > 3381;
        System.out.println("older: " + isInsideOfTheLawOlderThanThirty);
        System.out.println("younger: " + isInsideOfTheLawYoungerThanThirty);

        //|| (or)
        double bankAccountBalance1 = 200;
        double bankAccountBalance2 = 10000;
        float psFiveValue = 5000F;
        boolean iCanBuyAnPlaystationFive = bankAccountBalance1 > psFiveValue || bankAccountBalance2 > psFiveValue;
        System.out.println("i Can Buy an PS5? " + iCanBuyAnPlaystationFive);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //i++
        int counter = 0;
        counter += 1;
        counter++;
        counter--;
        ++counter;
        --counter;
        System.out.println(counter);
    }
}
