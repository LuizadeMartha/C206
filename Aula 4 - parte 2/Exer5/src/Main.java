public class Main {
    public static void main(String[] args) {
        Personagem miguel = new Personagem();

        miguel.nome = "Miguel";
        miguel.pontos = 100;

        Arma arma_miguel = new Arma();
        arma_miguel.descricao = "arma do miguel";
        arma_miguel.resistencia = 100;
        arma_miguel.poder = 1000;

        miguel.arma = arma_miguel;

        System.out.println("Mostrando vida do perdonagem"+ miguel.pontos);

        //perdendo vida
        miguel.tomarDano();
        System.out.println("Mostrando vida do perdonagem"+ miguel.pontos);

        //resistencia arma
        System.out.println("informação da arma");
        arma_miguel.mostraInfoArma();
        miguel.usarArma();
        arma_miguel.mostraInfoArma();
    }
}
