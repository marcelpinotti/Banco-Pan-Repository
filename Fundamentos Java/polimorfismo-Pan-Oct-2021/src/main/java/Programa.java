public class Programa {

    public void fazendoAnimalComer(Animal animal){
        animal.comer();
    }

    public static void main(String[] args) {

        Programa t = new Programa();

        t.fazendoAnimalComer(new Animal());
        t.fazendoAnimalComer(new Cao());
        t.fazendoAnimalComer(new Leao());
    }
}
