package br.com.marcelpinotti.estudandojpa.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;
    @Column
    private String sobrenome;
    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Calendar nascimento;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column
    private Calendar cadastro = Calendar.getInstance();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public Calendar getCadastro() {
        return cadastro;
    }

    public void setCadastro(Calendar cadastro) {
        this.cadastro = cadastro;
    }
}
