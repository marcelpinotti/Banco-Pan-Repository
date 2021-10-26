import java.util.Scanner;

public class LerScanner {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Enter username: ");

        String userName = teclado.nextLine();
        System.out.println("Username is: " + userName);


        System.out.print("Digite sua idade: ");
        Integer idade = teclado.nextInt();
        System.out.println("Sua idade é: "  + idade);

        teclado.close();
    }
}
