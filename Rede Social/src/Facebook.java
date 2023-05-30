public class Facebook extends RedeSocial implements  VideoConferencia, Compartilhamento{

    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicação no Facebook !!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma Streaming no Facebook !!");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println(" facebook !!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook !!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Facebook !!");
    }

    @Override
    public void Comentario() {
        System.out.println("Postou um comentario no Facebook !!");
    }
}
