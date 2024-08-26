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
        boolean isTenBiggerThanTwenty= 10>20;
        boolean isTenLessThanTwenty = 10<20;
        boolean isTenLessOrEqualThanTwenty= 10<=20;
        boolean isTenBiggerOrEqualThanTwenty= 10>=20;
        boolean isTenEqualTen = 10==10;
        boolean isTenDifferentOf20 = 10!=20;

        System.out.println(isTenBiggerThanTwenty);
        System.out.println(isTenLessThanTwenty);
        System.out.println(isTenBiggerOrEqualThanTwenty);
        System.out.println(isTenLessOrEqualThanTwenty);
        System.out.println(isTenEqualTen);
        System.out.println(isTenDifferentOf20);
    }
}
