package funcoes;

import javax.swing.JOptionPane;

public class Inputs {

    public static void main(String[] args) {

        //Gera um mock - inventa um dado simulando a execução de uma função (JOptionPane)

        String nome = JOptionPane.showInputDialog("Qual é o seu nome");

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade"));

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu peso"));

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);

    }
}
