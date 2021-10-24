import java.text.DecimalFormat;

public class Formata {
    public static void main(String[] args) {

        double valor = 2000.0;
        double parcelas = 3.0;

        double prestacao = valor/parcelas;

        DecimalFormat df = new DecimalFormat("0.###");

    }
}
