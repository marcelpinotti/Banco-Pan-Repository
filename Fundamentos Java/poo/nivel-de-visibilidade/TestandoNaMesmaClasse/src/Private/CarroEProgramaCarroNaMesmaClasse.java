package Private;

public class Carro {
	
    private String nome;

    private void exibeVelocidade(){

        System.out.println("A velocidade de uma " + nome +" é de 380 km/h");
    }

    public static void main(String[] args) {

    	Carro carro1 = new Carro();
    	carro1.nome = "Ferrari";

    	carro1.exibeVelocidade();
    }

}
