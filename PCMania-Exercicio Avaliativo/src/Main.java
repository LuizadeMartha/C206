import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Computador[] computadores = new Computador[10];
        Scanner input = new Scanner(System.in);
        Cliente cl = new Cliente("Luiza", 12267986);


        System.out.println("Menu: ");
        MemoriaUSB memoriaUSB0 = new MemoriaUSB("Acompanha Pen-drive", 16);
        MemoriaUSB memoriaUSB1 = new MemoriaUSB("Acompanha Pen-drive", 32);
        MemoriaUSB memoriaUSB2 = new MemoriaUSB("Acompanha HD externo", 1);

        Computador pc0 = new Computador("Positivo", 2300,memoriaUSB0,"Pentium Core i3, Memoria RAM", 500, "Linux", 16);
        Computador pc1 = new Computador("Acer", 5800,memoriaUSB1,"Pentium Core i5, Memoria RAM", 1, "Windows", 64);
        Computador pc2 = new Computador("Vaio", 1800,memoriaUSB2,"Pentium Core i7, Memoria RAM", 2, "Windows", 64);

        //mostrando infor dos computadores..
        pc0.mostraPCConfigs();
        pc1.mostraPCConfigs();
        pc2.mostraPCConfigs();

        pc0 = computadores[0];//PC0 corresponde ao computador 0
        pc1 = computadores[1];//PC0 corresponde ao computador 0
        pc2 = computadores[2];//PC0 corresponde ao computador 0

        boolean flag = true;

        while (flag) {
            System.out.println("Escolha uma opção: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            int op = input.nextInt();

            switch (op) {

                case 1:
                    cl.computador0++;
                    break;
                case 2:
                    cl.computador1++;
                    break;
                case 3:
                    cl.computador2++;
                    break;
                case 0:
                    flag = false;
                    System.out.println("Voce saiu do menu!");
                    break;
                default:
                    System.out.println("Valor invalido!!!");
                    break;
            }

        }

        //infotmações do cliente
        System.out.println("Nome do cliente: " + cl.nome);
        System.out.println("cpf do cliente: " + cl.cpf);
        //calculando o total da compra do cliente
        float total = cl.calculaTotalCompra();
        System.out.println("Total da compra R$ " +total);

        input.close();

    }
}
