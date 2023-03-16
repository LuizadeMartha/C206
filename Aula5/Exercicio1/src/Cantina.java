public class Cantina {

    String nome;
    Salgado salgado;
    Salgado[] salgados = new Salgado[3];
    int i;

    void addSalgados(Salgado novoSalgado) {
        for (i = 0; i < salgados.length; i++) ;//percorrendo o Arrays de salgados
        {
            if (salgados[i] == null) {//verifica se n tem salgado
                salgados[i] = novoSalgado;//add salgado
                break;

            }
        }
    }

    void mostraInfo() {
        System.out.println("A " + this.nome + " possui os seguintes salgados:");
        for (i = 0; i < salgados.length; i++) {
            ;//peppercorn o Arrays de salgados
            if (salgados[i] != null) {//verifica se tem salgado

                System.out.println(salgado.nome);

            }

        }
    }
}
