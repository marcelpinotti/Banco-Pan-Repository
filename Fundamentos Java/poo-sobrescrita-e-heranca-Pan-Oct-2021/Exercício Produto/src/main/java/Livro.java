import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Livro extends Produto{

    public void exibirDados(){
        System.out.println("Código: " + getCodigo() +
                "\nDescrição: " +  getDescricao() +
                "\nPreço: " + formatarPreco(getPreco()));
    }

    private String formatarPreco(double preco){
        NumberFormat formata = new DecimalFormat("R$ ###,###.00");
        return formata.format(preco);
    }
}
