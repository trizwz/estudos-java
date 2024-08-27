package academy.devdojo.maratonajava.introducao;

public class aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        /* if age < 15 = minor
         * if age >= 15 && age < 18 = teenager
         * if age > 18 = adult */
        int age = 16;

        if (age < 15) {
            System.out.println("You're a minor.");
        } else if(age >= 15 && age < 18){
            System.out.println("You're a teenager.");
        } else {
            System.out.println("You're an adult.");
        }
    }
}
