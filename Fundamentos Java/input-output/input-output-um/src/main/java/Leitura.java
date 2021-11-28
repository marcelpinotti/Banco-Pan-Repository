import javax.swing.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Leitura {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Calculando parcelas");
        double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do produto?"));
        int numeroParcelas = Integer.parseInt(JOptionPane.showInputDialog("Em quantas parcelas?"));
        double valorParcela = valorTotal / numeroParcelas;

        NumberFormat formato = new DecimalFormat("R$ ###,###.00");
        JOptionPane.showMessageDialog(null, "O valor de cada parcela é: " + formato.format(valorParcela));
    }
}
