public class Computador {
    String marca;
    float preco;
    MemoriaUSB memoriaUSB;
    HardwareBasico hardwareBasico;
    SistemaOperacional sistemaOperacional;


     Computador(String marca, float preco, MemoriaUSB memoriaUSB, String nomehardware, float capacidadehardware, String nomesistemaoperacional, int tiposistemaoperacional) {
        this.marca = marca;
        this.preco = preco;
        this.memoriaUSB = memoriaUSB;
        hardwareBasico = new HardwareBasico(nomehardware, capacidadehardware);
        sistemaOperacional = new SistemaOperacional(nomesistemaoperacional, tiposistemaoperacional);
    }

    void mostraPCConfigs(){
        System.out.println("Marca do Computador: "+marca);
        System.out.println("Preço do computador: "+preco);
        System.out.println("Informações do Hardware basico");
        System.out.println("Nome:"+ hardwareBasico.nome);
        System.out.println("Capacidade: "+ hardwareBasico.capacidade);
        System.out.println("Informações do Sistema Operacional");
        System.out.println("Nome:"+ sistemaOperacional.nome);
        System.out.println("Capacidade: "+ hardwareBasico.capacidade);
        System.out.println("Informações da MemoriaUSB");
        addMemoriaUSB(this.memoriaUSB);

    }

     void addMemoriaUSB(MemoriaUSB memoriaUSB){
         System.out.println("O Computador acompanha um " + memoriaUSB.nome + " de capacidade " + memoriaUSB.capacidade);

    }
}
