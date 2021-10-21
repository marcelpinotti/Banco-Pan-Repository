<h3> CONSTRUÇÃO DE UMA API - IMPLEMENTAÇÃO DE UMA CLASSE SERVICE, SIMULAÇÃO DE UM BANCO DE DADOS "MOKANDO OBJETOS" E CRIAÇÃO DE DOCUMENTAÇÃO NO SWAGGER</h3>




<h2>1. Classe Service</h2>

O objetivo da Classe Service é implementar toda a regra de negócio (lógica de programação), deixando a Classe Controller responsável apenas pela comunicação entre as requisições (resquest) e as respostas (response), ou seja, comunicação entre as camadas View e Model.



<h2>2. Simulação do Banco de Dados - MOCK</h2>

O Mock serve para realizarmos testes de dados de um banco de dados antes de criarmos um banco de dados. Os Mocks são objetos criados dentro da aplicação para simular objetos reais dentro de um banco de dados.



<h2>3. Swagger</h2>

O Swagger SpringFox é uma biblioteca do Spring que, de forma simples, gera a documentação de uma API REST.

Documentação: https://tjf.totvs.com.br/docs/swagger-springfox



***DEPENDÊNCIAS***

```
<!-- Documenta a API Rest -->

<dependency>
   <groupId>io.springfox</groupId>
   <artifactId>springfox-swagger2</artifactId>
   <version>2.9.2</version>
</dependency>

<!-- Gera a interface gráfica para a documentação -->

<dependency>
   <groupId>io.springfox</groupId>
   <artifactId>springfox-swagger-ui</artifactId>
   <version>2.9.2</version>
</dependency>
```



***CLASSE DE CONFIGURAÇÃO***

Nome: SwaggerConfig

- Corpo da Classe, Lógica da Classe e Anotações.

```
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
```

***BAIXAR A DOCUMENTAÇÃO***

*Base Url:* http://localhost:<porta>/swagger-ui.html

*Documentação:* http://localhost:<porta>/v2/api-docs

