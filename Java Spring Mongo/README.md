<h1>Banco de Dados NoSQL</h1>

<h3>Banco de Dados NoSQL significa ausência de estrutura.</h3>

- A ausência de estrutura contém algumas composições e/ou ramificações;
- No Relacional Database (Banco de Dados Não Relacional) NoSQL, possui diferentes tipos de armazenamento:
  - ​	Chave-valor, colunas, grafos e documentos;
    - ***NoSQL Key-Value*** : muito similar a um dicionário, sua modelagem indexa os dados a uma chave;
      - Muito utilizada em sistemas de análise de câmbio, IoT apps, gestão de conteúdo;
      - Um dos bancos para essa ramificação é o Redis;
    - ***NoSQL Columnar***: uma grande tabela contendo uma família de colunas;
      - Consiste em uma linha, coluna, timestramp (versões de dados);
      - Muito utilizado em mídias sociais;
      - Um dos bancos para essa ramificação é o Cassandra;
    - ***NoSQL Graph***:  os dados (grafos) são conectados por ligações (arestas), que também pode ser definida como um conjunto de linhas conectadas por vértices. 
      - Consiste em uma linha, coluna, timestramp (versões de dados);
      - Muito utilizado em pesquisas complexas;
      - Um dos bancos para essa ramificação é o Neo4i;
    - ***NOSQL Documents***: É uma estrutura baseada em coleção de documentos, sendo um documento um objeto que contém um código único.
      - Semelhante com o modelo chave-valor com um id;
      - Convenção para estrutura Json;
      - Utilizado quando necessita de estrutura dinâmica de dados;
      - Um dos bancos para essa ramificação é o MongoDB;
- Quando utilizar:
  - Muito utilizado para grande quantidades de dados que estão em constante mudança;
  - Modelos de dados flexíveis;
  - Pode ser utilizados em Games, Redes Sociais, IoT, Web,  Mobile, Enterprise.



<h3>MongoDB</h3>

***MongoDB*** é um banco de dados **não relacional (noSQL)**;

- O MongoDB é orientado a **documentos no formato JSON**;

- Os documentos que consistem de **pares chave-valor** com identificador id;

- É opensource e possui alta performance, disponibilidade, escalabilidade e flexibilidade ;

- O documento pode representar toda a informação necessária, com
  todos os dados que você queira. 

- **Os documentos são agrupados em coleções , que em conjunto, formam
  um banco de dados**

  

<img src="../imagens/MongoDB-documentos.jpg?raw=true { width= 100px }" alt="Coleções - Agrupamento de Documentos" style="zoom:50%;" /><img src="../imagens/MongoDB-colecao.jpg?raw=true { width= 100px }" alt="Coleções - Agrupamento de Documentos" style="zoom:50%;" />



- Links para Download:
  - Linux: https://docs.mongodb.com/manual/administration/install-on-linux/
  - MacOS: https://docs.mongodb.com/manual/tutorial/install-mongodb-on-os-x/
  - Windows: https://www.mongodb.com/try/download/community



<h3>PERSISTÊNCIA POLIGLOTA</h3>

***Persistência Poliglota***: um aplicação se comunica com vários tipos (diferentes contextos) de bancos de dados diferentes para persistir informações.

- A utilização da persistência poliglota vem crescendo devido a crescente utilização de diferentes tipos de dados (estruturados, semiestruturados e não estruturados) para aplicações com diferentes objetivos.



<img src="../imagens/SBSI20-59-FIG1.jpg?raw=true" alt="Exemplo de um e-commerce utilizando Persistência Poliglota" style="zoom:120%;" />



<h2>Spring Boot com MongoDB</h2>

**Para criação de uma aplicação back-end usando banco de dados NoSQL (MongoDb) são utilizadas as seguintes anotações, repositório, configuração de banco de dados e dependências**  

***Anotações***

- Documentos (Entidades): @Document();
  - Identificador: @Id
  - Referência (Relacionamento): @DBRef

***Repositório***

- extends MongoRepository<"Documento", "Tipo Primitivo do Id">

***Application Properties***

- Exemplo:
  - spring.data.mongodb.uri=mongodb://localhost/
  - spring.data.mongo.username=
  - spring.data.mongo.password=

***Dependência***

- groupId - org.springframework.boot
- artifactId -  spring-boot-starter-data-mongodb

