package academy.devdojo.maratonajava.introducao;

public class aula06EstruturasdeRepeticao04 {
    public static void main(String[] args) {
        //dado o valor do carro, descubra quantas vezes ele pode ser parcelado;
        //condição valorParcela >= 1000;
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela >= 1000)  {
                System.out.println("Parcela "+parcela+" R$ "+valorParcela);
            }else{
                break;
            }

        }
    }
}
