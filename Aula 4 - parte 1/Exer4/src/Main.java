public class Main {
    public static void main(String[] args) {

        Zumbi cris = new Zumbi();
        Zumbi ana = new Zumbi();

        cris.vida = 100;
        ana.vida = 200;

        System.out.println("Vida do zumbi Z1: "+ cris.vida);
        System.out.println("Vida do zumbi Z2: "+ana.vida);

        if(cris.transfereVida(ana,50))
        {
            System.out.println("Fazendo cris tranferir 50 para Ana");
            System.out.println("Vida do Zumbi Cris: " + cris.vida);
            System.out.println("Vida do Zumbi Cris: " + ana.vida);

        }

        if(cris.transfereVida(ana,150))
        {
            System.out.println("Fazendo cris tranferir 150 para Ana");
            System.out.println("Vida do Zumbi Cris: " + cris.vida);
            System.out.println("Vida do Zumbi Cris: " + ana.vida);

        }
        else
        {
            System.out.println("A vida não foi alterada");
        }

    }
}
