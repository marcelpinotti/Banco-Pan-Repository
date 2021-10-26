import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class ScanOutrosTipos {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        short lerShort = ler.nextShort();
        System.out.print("Short: ");
        System.out.println(lerShort);

        long lerLong = ler.nextLong();
        System.out.print("Long: ");
        System.out.println(lerLong);
    }
}
