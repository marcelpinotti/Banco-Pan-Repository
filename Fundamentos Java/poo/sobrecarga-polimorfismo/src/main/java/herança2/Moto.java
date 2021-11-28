package herança2;

public class Moto extends Veiculo {

    @Override
    public void iniciar() {
        System.out.println("Ligando moto");
    }

    @Override
    public void frear() {
        System.out.println("Freando moto");
    }

    public void andar(){
        System.out.println("Acelerando moto");
    }
}
