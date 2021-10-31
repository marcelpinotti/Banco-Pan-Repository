<h1>JSON - Atividade</h1>

<h3>Métodos e suas funcionalidades:</h3>



- ***JSONObjectToArray*** - Primeiramente é criado um objeto JSON usando uma String, posteriormente é criado JSONArray com a quantidade de chaves do objeto JSON, a quantidade de chaves é encontrado através de um método para percorrer o objeto JSON. É criado um segundo JSONArray que apresentará somente os valores do JSON através do método toJSONObject() usando o primeiro JSONArray para determinar a quantidade de chaves;

  *Obs: Fiz uma pequena alteração no método  para que fosse possível imprimir também as chaves com os valores também  e não apenas os valores.*

  

- ***JSONExampleArray1*** - É criada uma String , essa String é inserida em um JSONArray através do método .put(). É inicializado um segundo JSONArray que utiliza um método para percorrer o primeiro JSONArray e criar o número de chaves necessárias. É criado um objeto JSON com os valores do primeiro JSONArray e as chaves com os valores do segundo JSONArray, essa criação é feita através do método toJSONObject();

  

- ***JSONExampleArray2*** - Os valores são  inseridos em um primeiro JSONArray através do método .put(). É inicializado um segundo JSONArray que utiliza um método para percorrer o primeiro JSONArray e criar o número de chaves necessárias. É criado um objeto JSON com os valores do primeiro JSONArray e as chaves com os valores do segundo JSONArray, essa criação é feita através do método toJSONObject();

  

- ***JSONExampleStringer*** - Após a criação de um objeto no formato JSONStringer, as chaves e os valores são inseridos no mesmo após a utilização do método .object(), e a inserção é finalizada após a utilização dom método .endObject(). O objeto é transformado em uma String e posteriormente transformado em um objeto JSON; 

  

- ***JSONExampleObject1*** - Criação de um objeto JSON através de uma String;

  

- ***JSONExampleObject2*** - Criação de um objeto JSON através do método da classe .put("key","value");

  

- ***JSONExampleObject3*** - Criação de um objeto JSON através de um HashMap com Generics;

  

- ***JSONExamplWriter*** - Não retorna um objeto JSON, mas sua utilização é muito parecida com a JSONStringer, a diferença é a necessidade de utilizar uma classe de inicialização para o objeto da mesma, a StringBuilder;

  

- ***JSONExampleTokener*** - é uma forma diferente de inicializar um objeto JSON;

  

- ***XMLToExampleConversion*** - Converte em uma String com formato XML de um objeto JSON;

  

- ***XMLFromExampleConversion*** -  Converte uma String no formato XML em um objeto JSON;

  

- ***CookieToExampleConversion*** - Converte em uma String com formato de Cookie de um objeto JSON;

  

- ***CookieFromExampleConversion*** - Converte uma String no formato de Cookie em um objeto JSON;

  

- ***HTTPToExampleConversion*** - Converte em uma String com formato HTTP de um objeto JSON;

  

- ***HTTPFromExampleConversion*** - Converte uma String no formato de HTTP em um objeto JSON;

  

- ***CDLToExampleConversion*** - Converte um JSONArray em uma String de CDL, separando chaves e valores, imprimindo primeiramente a quantidade de chaves e posteriormente os valores do chaves;

  

- ***CDLFromExampleConversion*** - Converte uma String no formato de CDL em um JSONArray;

  

- ***PropertyToExampleConversion*** - Converte um objeto JSON em um objeto Property;

  

- ***PropertyFromExampleConversion*** -  Converte um objeto Property em um objeto JSON.

*Obs: Fiz uma pequena alteração no método  PropertyToExampleConversion() para que fosse impresso tudo no método PropertyFromExampleConversion().*



***Imports:***

- import org.json.*;

- import java.util.HashMap;

- import java.util.Map;

- import java.util.Properties;

  

***Fonte:*** https://github.com/stleary/JSON-java/blob/master/Examples.md

