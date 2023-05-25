public class Main {
    public static void main(String[] args) {

        //criando objetos
        Usuario usuario = new Usuario("Luiza", "lu@inatel.br");
        Facebook facebook = new Facebook("12", 78);
        GooglePlus googlePlus= new GooglePlus("11", 107);
        Twitter twitter= new Twitter("10", 46);
        Instagram instagram = new Instagram("09", 90);

        //Entrando com nome e email do usuario:
        System.out.println("-------------------------INFOS USUARIO--------------------------");

        System.out.println("Nome do usuario: " + usuario.getNome());
        System.out.println("Email do usuario: "+ usuario.getEmail());

        System.out.println("-------------------------ADD REDES--------------------------");


        usuario.Usuario(facebook);
        usuario.Usuario(googlePlus);
        usuario.Usuario(twitter);
        usuario.Usuario(instagram);
        System.out.println("-----------------------iNFOS DO FACE-----------------------------");

        for(int i = 0; i < usuario.redeSocial.length; i++){
            if(usuario.redeSocial[i] instanceof  Facebook){
                Facebook face = (Facebook) usuario.redeSocial[i];
                face.curtirPublicacao();
                face.fazStreaming();
                face.compartilhar();
                System.out.println("-----------------------INFOS DO GOOGLE pLUS--------------------");
            }
            else if(usuario.redeSocial[i] instanceof  GooglePlus){
                GooglePlus goo = (GooglePlus) usuario.redeSocial[i];
                goo.Comentario();
                goo.fazStreaming();
                goo.compartilhar();
                System.out.println("-------------------INFOS TWITTER------------------------");
            }
            else if(usuario.redeSocial[i] instanceof  Twitter){
                Twitter tw= (Twitter) usuario.redeSocial[i];
                tw.postarFoto();
                tw.compartilhar();
                System.out.println("-------------------iNFOS INSTA ----------------------");
            }
            else if(usuario.redeSocial[i] instanceof  Instagram){
                Instagram insta = (Instagram) usuario.redeSocial[i];
                insta.postarVideo();
                System.out.println("--------------------FIM -----------------------");
            }
        }

    }
}