public class uchiha extends ninja {
    String nivelDoSharingan = "Sharingan 2";

    public void sharinganAtivado() {
        System.out.println("Sharingan Ativado");
    }

    @Override
    public void ataqueBase(){
        System.out.println("Ataque de Kunai com o elemento de fogo.");
    }

    public void ataqueBase(int nivelDeChacra){
        if(nivelDeChacra > 2){
            System.out.println("Susano Ativado");
        }
        else if(nivelDeChacra < 1){
            System.out.println("Sharingan Ativado");
        }
        else{
            System.out.println("Eu não tenho Chacra");
        }
    }
}
