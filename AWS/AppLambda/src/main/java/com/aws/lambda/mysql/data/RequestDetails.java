package com.aws.lambda.mysql.data;

public class RequestDetails 
{
   private String nome;
   private String sobrenome;
   private Integer idade;
   
   public String getNome() {
	   return nome;
   }
   public void setNome(String nome) {
	   this.nome = nome;
   }
   public String getSobrenome() {
	   return sobrenome;
	   }
   public void setSobrenome(String sobrenome) {
	   this.sobrenome = sobrenome;
   }
   public Integer getIdade() {
	   return idade;
   }
   public void setIdade(Integer idade) {
	   this.idade = idade;
   }
   
}
