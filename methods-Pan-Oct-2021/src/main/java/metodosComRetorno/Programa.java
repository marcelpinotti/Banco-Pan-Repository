package metodosComRetorno;

public class Programa {

    public static void main(String[] args) {

        System.out.println("Criando um objeto");
        MetodoRetorno teste = new MetodoRetorno();

        teste.atributo1 = 30;
        System.out.println(teste.atributo1);
        System.out.println(teste.metodo1());

        teste.atributo1 = -1;

        System.out.println(teste.atributo1);
        System.out.println(teste.metodo1());

    }
}
