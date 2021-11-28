package com.classes;

import com.classes.tabelas.Produtos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class}) --> quando o banco de dados não estiver configurado.
public class ClassesApplication {

	public static void main(String[] args) {

		SpringApplication.run(ClassesApplication.class, args);


		Produtos produto1 = new Produtos();
		produto1.setDescrição("Luva");
		produto1.setValor(20.5);

		System.out.println(produto1);
		System.out.println(produto1.getDescrição());
		System.out.println(produto1.getValor());
	}

}
