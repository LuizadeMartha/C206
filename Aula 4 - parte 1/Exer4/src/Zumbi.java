public class Zumbi {

    double vida;
    String nome;


    //METODOS
    double mostraVida(){
        System.out.println("A vida do zumbi é "+vida);

        return 0;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        if(this.vida >= quantia){
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
        else
        {
            System.out.println("não posso tranferir a quantidade: "+ this.vida );
            return false;
        }
    }
}
