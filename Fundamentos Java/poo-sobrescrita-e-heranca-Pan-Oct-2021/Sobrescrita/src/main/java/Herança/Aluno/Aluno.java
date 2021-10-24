package Herança.Aluno;

public class Aluno extends Pessoa{

    private String curso;
    private Double[] notas;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }
}
