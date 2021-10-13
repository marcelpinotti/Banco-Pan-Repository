package Pacote;

public class Pessoa {
	
	private String name = "Marcel";

    private String pegarNome(String visitanteNome){
        System.out.println("Quem é??.." + visitanteNome);
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
