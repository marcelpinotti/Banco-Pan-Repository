package Pacote;

import java.lang.reflect.Method;

public class Programa {

    public static void main(String[] args) {
        try {
            //Chama a classe e coloca ela no objetinho
            Object objetinho = Class.forName("Pacote.Pessoa").newInstance();
            //Chama o método e coloca ele no metodinho
            Method metodinho = objetinho.getClass().getDeclaredMethod("pegarNome", String.class);
            //metodinho pode ser visto
            metodinho.setAccessible(true);

            String nome = (String) metodinho.invoke(objetinho, "");
            System.out.println(nome);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}