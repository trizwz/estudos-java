package academy.devdojo.maratonajava.introducao;

public class aula06EstruturasdeRepeticao01 {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        count = 0;
        do {
            System.out.println("numbers " + ++count);
        } while (count < 10);


        for (int i=0; i < 10; i++) {
            System.out.println("Numbers again " + i);
        }
    }
}