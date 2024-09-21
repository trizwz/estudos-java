package exercises;

public class ex10 {
    public static void main(String[] args) {
        /*Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp
        (largura da parede) precisa ser coberta por azulejos também retangulares. O azulejo retangular
        tem dimensões ha (altura do azulejo) e la (largura do azulejo). Escreva um programa que leia as
        quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são
         necessários para cobrir a parede dada.*/

        //altura da parede: ap, largura da parede: lp, ha: altura do azulejo, largura do azulejo: la
    double  ap, lp, aa, la, qtd;
    ap = 2.6;
        lp = 1.6;
        aa = 0.35;
        la = 0.3;
        qtd = (ap * lp) / (aa * la);
        long rounded =Math.round(qtd);

        System.out.println("A quantidade necessaária de azulejos para cobrir totalmente a parede é de: "+rounded);
    }
}
