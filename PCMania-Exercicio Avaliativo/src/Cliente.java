public class Cliente {
    String nome;
    long cpf;
    float computador0 =0;
    float computador1=0;
    float computador2=0;
    Computador[] computadores = new Computador[10];

    MemoriaUSB memoriaUSB0 = new MemoriaUSB("Acompanha Pen-drive", 16);
    MemoriaUSB memoriaUSB1 = new MemoriaUSB("Acompanha Pen-drive", 32);
    MemoriaUSB memoriaUSB2 = new MemoriaUSB("Acompanha HD externo", 1);

    Computador pc0 = new Computador("Positivo", 2300,memoriaUSB0,"Pentium Core i3, Memoria RAM", 500, "Linux", 16);
    Computador pc1 = new Computador("Acer", 5800,memoriaUSB1,"Pentium Core i5, Memoria RAM", 1, "Windows", 64);
    Computador pc2 = new Computador("Vaio", 1800,memoriaUSB2,"Pentium Core i7, Memoria RAM", 2, "Windows", 64);


    Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

     float calculaTotalCompra(){
         float total;
         total = computador0 * pc0.preco + computador1 * pc1.preco + computador2 * pc2.preco;
         return total;

     }

}
