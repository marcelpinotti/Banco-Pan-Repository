package criacaoeleitura;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonCriandoArquivo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        JSONObject pessoaDetalhesUm = new JSONObject();
        pessoaDetalhesUm.put("nome", "Marcel");
        pessoaDetalhesUm.put("sobrenome", "Pinotti");
        pessoaDetalhesUm.put("website", "marcelpinotti.com");

        JSONObject pessoaUm  = new JSONObject();
        pessoaUm.put("pessoa", pessoaDetalhesUm);

        JSONObject pessoaDetalhesDois = new JSONObject();
        pessoaDetalhesDois.put("nome", "Viviane");
        pessoaDetalhesDois.put("sobrenome", "Pinotti");
        pessoaDetalhesDois.put("website", "vivianepinotti.com");

        JSONObject pessoaDois = new JSONObject();
        pessoaDois.put("pessoa", pessoaDetalhesDois);


        JSONArray jsonArrayLista = new JSONArray();
        jsonArrayLista.add(pessoaUm);
        jsonArrayLista.add(pessoaDois);


        try (FileWriter file = new FileWriter("pessoas.json")) {
            file.write(jsonArrayLista.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
