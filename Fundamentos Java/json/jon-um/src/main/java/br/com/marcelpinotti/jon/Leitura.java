package br.com.marcelpinotti.jon;


import java.io.FileNotFoundException;

// Java program to read JSON from a file


import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Leitura {

    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

        Object obj = new JSONParser().parse(new FileReader("./src/main/java/teste2.json"));

        JSONObject jsonzinho = (JSONObject) obj;

        // get nome
        String nominho = (String) jsonzinho.get("Nome");
        String sobrenominho = (String) jsonzinho.get("Sobrenome");
        long idade = (long) jsonzinho.get("idade");

        System.out.println(nominho);
        System.out.println(sobrenominho);
        System.out.println(idade);


    }
}
