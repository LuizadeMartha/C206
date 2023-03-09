public class Main {

    public static void main(String[] args) {


        //criando karts, o motos é criado junto, pois é composição
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        //criando nomes
        kart1.nome = "Kart1";
        kart2.nome = "Kart2";

        //colocando os valores das cilindradas para o motor do kart
        kart1.motor.cilindradas = "150";
        kart2.motor.cilindradas = "50";

        //colocando os valores da velocidade maxima para o kart
        kart1.motor.velocidadeMaxima = 90;
        kart2.motor.velocidadeMaxima =50;

        //criando os pilotos
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        //nome do piloto
        piloto1.nome="Luiza";
        piloto2.nome="Lucas";

        //associando piloto aos karts
        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        //executando piloto
        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        //executando acao do kart1
        kart1.fazerDrift();
        kart1.motor.mostrando();

        //executando acao kart2
        kart2.soltarTurbo();
        kart2.motor.mostrando();

    }
}
