import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //criando um objeto do tipo scanner, para ler do teclado
        Scanner entrada = new Scanner(System.in);

        int matriculados;

        System.out.println("Entrando com a quantidade de alunos matriculados");
        matriculados = entrada.nextInt();

        switch (matriculados){
            case 10:
            case 20:
                System.out.println("Sala matriculada I-26");
                break;

            case 30:
                System.out.println("Sala matriculada I-25");
                break;
            default:
                System.out.println("Numero incorreto");

        }

        //Para fechar o Scanner, após seu uso
        entrada.close();
    }

}