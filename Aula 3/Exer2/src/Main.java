
   import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner entrada1 = new Scanner(System.in);
            Scanner entrada2 = new Scanner(System.in);
            Scanner entrada3 = new Scanner(System.in);

            System.out.println("Entrar com o numero de lanches consumidos na 1 hr:");
            int primeirahr = entrada1.nextInt();

            System.out.println("Entrar com o numero de lanches consumidos na 2 hr:");
            int segundahr = entrada2.nextInt();

            System.out.println("Entrar com o numero de lanches consumidosna 3 hr:");
            int terceirar = entrada3.nextInt();

            int resultado = primeirahr + segundahr + terceirar;
            int media = resultado / 3;


            System.out.println("lanche consumidos:" + resultado);
            System.out.println("media de lanches consumidos:" + media);

        }
    }
