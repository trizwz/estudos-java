package academy.devdojo.maratonajava.introducao;

public class aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        String msgDoar = "eu irei doar 400 para o devdojo.";
        String msgNaoDoar = "ainda não tenho condições.";
        double salario = 3000;
        //condicao ? verdadeiro : falso
        String resultado = salario > 5000 ? msgDoar : msgNaoDoar;

        System.out.println(resultado);
    }
}
