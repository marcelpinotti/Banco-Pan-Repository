<h1>CRIAÇÃO E LEITURA DE UM ARQUIVO JSON</h1>



<h2>1. Classe de Criação</h2>



```
public class JsonCriandoArquivo {

    @SuppressWarnings("unchecked") // ***Faz o compilador não emitir warnings.*** //
    public static void main(String[] args) {
		
		// ***Instanciando primeiro objeto Json, inserindo chaves e valores através do método put.*** //
        JSONObject pessoaDetalhesUm = new JSONObject();
        pessoaDetalhesUm.put("nome", "Marcel");
        pessoaDetalhesUm.put("sobrenome", "Pinotti");
        pessoaDetalhesUm.put("website", "marcelpinotti.com");

		// ***Instanciando segundo objeto Json, e através do método put inserindo chave pessoa e o primeiro objeto Json como valor.*** //
        JSONObject pessoaUm  = new JSONObject();
        pessoaUm.put("pessoa", pessoaDetalhesUm);

		// ***Instanciando terceiro objeto Json, inserindo chaves e valores através do método put.*** //
        JSONObject pessoaDetalhesDois = new JSONObject();
        pessoaDetalhesDois.put("nome", "Viviane");
        pessoaDetalhesDois.put("sobrenome", "Pinotti");
        pessoaDetalhesDois.put("website", "vivianepinotti.com");
		
		// ***Instanciando quarto objeto Json, e através do método put inserindo chave pessoa e o terceiro objeto Json como valor.*** //
        JSONObject pessoaDois = new JSONObject();
        pessoaDois.put("pessoa", pessoaDetalhesDois);

		// ***Instanciando objeto JsonArray, e através do método add insere segundo e quarto objetos Json dentro do Array.*** //
        JSONArray jsonArrayLista = new JSONArray();
        jsonArrayLista.add(pessoaUm);
        jsonArrayLista.add(pessoaDois);

		// *** Bloco try e catch - usado quando o comandos e invocações de métodos podem gerar excessões.
		// FileWriter -  Classe para escrever arquivos de caracteres.
		// método write - método escritor.
		//toJSONString() - transforma o arquivo em uma String.
		// método flush - gravar qualquer saída armazenada. *** //
        try (FileWriter file = new FileWriter("pessoas.json")) {
            file.write(jsonArrayLista.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```



<h2> 2. Classe de Leitura</h2>



```
public class JsonLendoArquivo {

    @SuppressWarnings("unchecked") // ***Faz o compilador não emitir warnings.*** //
    public static void main(String[] args)
    {
		// ***JSONParser - Fornece acesso direto e somente leitura aos dados JSON. Esta é a maneira mais eficiente de ler dados JSON.
		// Instanciado um objeto JSONParser.*** //
        JSONParser jsonParser = new JSONParser();

		// *** Bloco try e catch - usado quando o comandos e invocações de métodos podem gerar excessões.
		// FileReader -  Classe para leitura arquivos de caracteres.*** //
        try (FileReader reader = new FileReader("pessoas.json"))
        {
			
			// ***metódo parse - converte strings em vários tipos de dados, neste caso convertendo em um Object.*** //
            Object objeto = jsonParser.parse(reader);
			
			// ***Usando um Casting em um Objeto instancia um objeto JsonArray.*** //
            JSONArray pessoasLista = (JSONArray) objeto;
            
            // ***Imprime o JSONArray.*** //
            System.out.println(pessoasLista);
	
			// ***Percorre o JSONArray usando o .forEach e o método de impressão criado.*** //
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
    	// ***Instancia um objeto Json através da chave pessoa criada na classe de criação.*** //
        JSONObject pessoaObjeto = (JSONObject) pessoas.get("pessoa");

		// ***Instancia uma String e usando um Casting imprime o valor da chave nome.*** //
        String nome = (String) pessoaObjeto.get("nome");
        System.out.println(nome);
        
		// ***Instancia uma String e usando um Casting imprime o valor da chave sobrenome.*** //
        String sobrenome = (String) pessoaObjeto.get("sobrenome");
        System.out.println(sobrenome);

		// ***Instancia uma String e usando um Casting imprime o valor da chave website.*** //
        String website = (String) pessoaObjeto.get("website");
        System.out.println(website);
    }

}
```



***Dependência:***

<dependency>

​	<groupId>com.googlecode.json-simple</groupId>

​	<artifactId>json-simple</artifactId>

​	<version>1.1.1</version>

</dependency>



***Imports:***

**Classe de Criação:**

import java.io .*;

import org.json.simple.*;



**Classe de Leitura:**

import java.io .*;

import org.json.simple.*;

import org.json.simple.parser.*;



***Fonte:*** https://howtodoinjava.com/java/library/json-simple-read-write-json-examples/