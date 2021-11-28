package br.com.marcelpinotti.calculadora.models;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CalculadoraIdade {

    private String nome;
    private String sobrenome;
    private Date nascimento;
    private Date atual;

    public CalculadoraIdade(){
    }

    public CalculadoraIdade(String nome, String sobrenome, Date nascimento){
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento =nascimento;
    }

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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Date getAtual() {
        return atual;
    }

    public void setAtual(Date atual) {
        this.atual = atual;
    }

}
