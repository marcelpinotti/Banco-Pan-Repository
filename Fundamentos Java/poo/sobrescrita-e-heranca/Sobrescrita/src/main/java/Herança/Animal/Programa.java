package Herança.Animal;

public class Programa {

    public static void main(String[] args) {

        Gato gato = new Gato();
        gato.dormir();
        gato.peso = 7;
        gato.raca = "Siameses";

        System.out.println("--------Sobre o gato--------");
        System.out.println(gato.peso);

        Cachorro cachorro = new Cachorro();
        cachorro.dormir();
        cachorro.raca = "Labrador";

        System.out.println("--------Sobre o cachorro--------");
        System.out.println(cachorro.raca);
    }
}
