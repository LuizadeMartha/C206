
public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel";

        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome = "Coxinha";
        salgado2.nome = "Enroladinho de pizza";
        salgado3.nome = "Esfirra de Frango";

        cantina.addSalgados(salgado1);
        cantina.addSalgados(salgado2);
        cantina.addSalgados(salgado3);

        cantina.mostraInfo();
    }

}
