public class Main {
    public static void main(String[] args){
        //obj1
        uzumaki naruto = new uzumaki();
        naruto.setNome("Naruto Uzumaki");
        naruto.getNome();
        System.out.println(naruto.getNome());
        naruto.temBiju = true;
        naruto.ataqueBase();

        //obj2
        uchiha sasuke = new uchiha();
        sasuke.setNome("Sasuke Uchiha");
        sasuke.getNome();
        System.out.println(sasuke.getNome());
        sasuke.nivelDoSharingan = "Sharingan 2";
        sasuke.ataqueBase(3);
    }
}