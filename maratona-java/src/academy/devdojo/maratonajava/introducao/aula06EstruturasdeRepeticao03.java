package academy.devdojo.maratonajava.introducao;

public class aula06EstruturasdeRepeticao03 {
    public static void main(String[] args) {
        //imprima 100 numeros, porem quando chegar no n 25, pare.
        for (int y = 0; y < 100; y++){
            if (y > 25){
                break;
            }
            System.out.println(y);
        }
    }
}
