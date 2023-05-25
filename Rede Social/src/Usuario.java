public class Usuario {

    private String nome;
    private String email;

    RedeSocial [] redeSocial = new RedeSocial[50];

    public void Usuario(RedeSocial redeSociais) {
        for (int i = 0; i < redeSocial.length; i++) {
            if (redeSocial[i] == null) {
                redeSocial[i] = redeSociais;
                if (redeSocial[i] instanceof Facebook) {
                    System.out.println("ADD Facebook ao usuario.");
                    break;
                } else if (redeSocial[i] instanceof GooglePlus) {
                    System.out.println("ADD Google Plus ao usuario.");
                    break;
                } else if (redeSocial[i] instanceof Twitter) {
                    System.out.println("ADD Twitter ao usuario.");
                    break;
                } else if (redeSocial[i] instanceof Instagram) {
                    System.out.println("ADD Instagram ao usuario.");
                    break;
                }
                break;
            }
        }

    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
