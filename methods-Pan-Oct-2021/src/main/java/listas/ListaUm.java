package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaUm {

    public static void main(String[] args) {


        List<String> lista1 = new ArrayList<String>();

        lista1.add("Marcel Pinotti");
        lista1.add("Julio Farias");
        lista1.add("João Pedro");
        lista1.add("Valdir Magalhães");

        System.out.println(lista1.size());
        lista1.forEach(System.out::println);

        lista1.remove("João Pedro");
        System.out.println(lista1);

        List<Integer> itens = Arrays.asList(11,10,16,5,85);
        itens.stream().filter(i -> i > 16).forEach(System.out::println);
    }
}