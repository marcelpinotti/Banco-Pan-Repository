import javax.swing.*;

public class MaiorMenorIdade {

    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));

        if(idade < 18){
            System.out.println("Menor de idade");
            System.out.println("ano que vem será maior");
        } else {
            System.out.println("Maior");
            JOptionPane.showMessageDialog(null, "Maior");
        }
    }
}
