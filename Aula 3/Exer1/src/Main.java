public class Main {
    public static void main(String[] args) {

        //numero de lanches consumidos por hora
        int total;
        int media;
        int primeirahr = 10;
        int segundahr = 4;
        int terceirahr = 2;

        //total de lanches consumidos
        total = primeirahr + segundahr + terceirahr;

        //media de lanches consumidos
        media = total/3;

        System.out.println("Total de lanches consumidos: " + total);
        System.out.println("Media de lanches consumidos: " + media);
    }
}