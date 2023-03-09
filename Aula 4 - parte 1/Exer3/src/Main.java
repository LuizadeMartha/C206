public class Main {

    public static void main(String[] args) {

        Zumbi cris = new Zumbi();
        Zumbi ana = new Zumbi();

        cris.vida = 50;
        ana.vida = 100;

        System.out.println("Vida do zumbi Z1: "+ cris.vida);
        System.out.println("Vida do zumbi Z2: "+ana.vida);

        //igualando o Zumbi
        cris = ana;


        System.out.println("vida do Zumbi cris:");
        cris.mostraVida();
        System.out.println("vida do Zumbi ana:");
        ana.mostraVida();



    }

}