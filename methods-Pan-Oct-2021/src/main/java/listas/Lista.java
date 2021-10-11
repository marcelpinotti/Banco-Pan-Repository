package listas;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {


        List lista = new ArrayList<>();

        lista.add(77);
        lista.add("Julio Farias");
        lista.add(3003.32);
        lista.add(80);

        System.out.println("Lista com todos os elementos diferentes: " + lista);
        lista.remove(3);


        System.out.println("Lista com elementos diferentes menos do index 3: " + lista);
        System.out.println("Lista com nome: " + lista.get(1));
        System.out.println("Lista com salário: " + lista.get(2));

        lista.clear();
        System.out.println("Lista esvaziada: " + lista);

        System.out.println("-x-x-x-x-x-x-x-v");

        List<String> lista1 = new ArrayList<String>();

        lista1.add("Marcel Pinotti");
        lista1.add("Julio Farias");
        lista1.add("João Pedro");
        lista1.add("Valdir Magalhães");

        System.out.println("Lista com todos os elementos: " + lista1);

        lista1.remove("João Pedro");
        System.out.println("Lista com elementos, menos o João Pedro: " + lista1);

    }
}