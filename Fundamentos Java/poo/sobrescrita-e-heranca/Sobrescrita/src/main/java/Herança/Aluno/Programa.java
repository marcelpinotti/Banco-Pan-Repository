package Herança.Aluno;

public class Programa {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        aluno.setNome("Júlio");
        aluno.setCurso("português");

        System.out.println(aluno.getCurso());
        System.out.println(aluno.getNome());

        professor.setSalario(1000.0);
        System.out.println(professor.getSalario());


    }
}
