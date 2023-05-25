public class Twitter extends RedeSocial implements Compartilhamento{

    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicação no Twitter !!");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("no Twitter !!");

    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter !!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Twitter !!");
    }

    @Override
    public void Comentario() {
        System.out.println("Postou um comentario no Twitter !!");
    }
}
