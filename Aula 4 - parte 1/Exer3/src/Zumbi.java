public class Zumbi{


    double vida;
    String nome;


    //METODOS
    double mostraVida(){
    System.out.println("A vida do zumbi é "+vida);

        return 0;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        vida-= quantia;
        zumbiAlvo.vida += quantia;
    }


}