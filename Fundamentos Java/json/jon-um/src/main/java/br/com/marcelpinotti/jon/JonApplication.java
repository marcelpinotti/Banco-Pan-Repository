package br.com.marcelpinotti.jon;

import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SpringBootApplication
public class JonApplication  {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(JonApplication.class, args);

		JSONObject jsonzinho = new JSONObject();

		jsonzinho.put("Nome", "Julio");
		jsonzinho.put("Sobrenome", "Smith");
		jsonzinho.put("idade", 25);
		jsonzinho.put("Nome", "Julio");
		jsonzinho.put("Sobrenome", "Smith");
		jsonzinho.put("idade", 25);
		jsonzinho.put("Nome", "Julio");

		System.out.println(jsonzinho);

		PrintWriter salvar = new PrintWriter("./src/main/java/teste2.json");
		salvar.write(jsonzinho.toJSONString());

		salvar.flush();
		salvar.close();

	}

}
