package academy.devdojo.maratonajava.introducao;

public class aula03TiposPrimitivosExercicios {
    /*create variables for the describes spaces below between <> and print the message:
    * I'm <name>, living in the address <your address>,
    * confirm that I receive a salary of <salary>, on day <date>*/
    public static void main(String[] args) {
        String name ="Triz";
        String address ="Canada";
        double salary = 5350.00;
        String date = "15.03.2025";
        /*System.out.println("I'm "+name+", living in the address: "+address+". Confirm that I " +
        *        "receive a salary of: "+salary+", on this day: "+date);*/

        //or
        String anwser = "I'm "+name+", living in the address: "+address+". Confirm that I " +
                "receive a salary of: "+salary+", on this day: "+date;
        System.out.println(anwser);
    }


}
