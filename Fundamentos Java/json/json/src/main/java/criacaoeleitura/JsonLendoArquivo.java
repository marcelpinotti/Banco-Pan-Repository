package criacaoeleitura;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonLendoArquivo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("pessoas.json"))
        {

            Object objeto = jsonParser.parse(reader);

            JSONArray pessoasLista = (JSONArray) objeto;
            System.out.println(pessoasLista);

            pessoasLista.forEach( pessoas -> parsePessoasObject( (JSONObject) pessoas ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parsePessoasObject(JSONObject pessoas)
    {
        JSONObject pessoaObjeto = (JSONObject) pessoas.get("pessoa");

        String nome = (String) pessoaObjeto.get("nome");
        System.out.println(nome);

        String sobrenome = (String) pessoaObjeto.get("sobrenome");
        System.out.println(sobrenome);

        String website = (String) pessoaObjeto.get("website");
        System.out.println(website);
    }

}
