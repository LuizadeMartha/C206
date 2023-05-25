public abstract class  RedeSocial {

    protected String senha;
    protected int numAmigos;

    public void curtirPublicacao(){

        System.out.println("Curtiu uma publicação ");
    }

    abstract public void postarFoto();
    abstract public void postarVideo();
    abstract public void Comentario();

    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }
}
