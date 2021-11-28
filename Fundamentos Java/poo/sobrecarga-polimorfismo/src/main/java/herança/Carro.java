package herança;

public class Carro extends Veiculo{

    @Override
    public void iniciar() {
        System.out.println("Ligando carro");
    }

    @Override
    public void frear() {
        System.out.println("Freando carro");
    }

}
