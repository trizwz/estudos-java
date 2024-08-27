package academy.devdojo.maratonajava.introducao;

public class aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 12;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (idade >= 20) {
            System.out.print("Autorizado a comprar bebida.");
        }
        else if (isAutorizadoComprarBebida == false){
            System.out.println("Não autorizado a comprar bebida.");
        }
    }
}
