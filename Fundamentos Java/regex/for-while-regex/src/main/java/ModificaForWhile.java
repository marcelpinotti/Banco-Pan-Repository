import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModificaForWhile {

    public static void main(String[] args) {
        
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("-=-=-=-=-=-=-=-=-=");
        /*Exercício: Use um forloop para imprimir "consegui"
        5 vezes e o número da tentativa na frente */

        // Resolução 1
        for(int i = 1; i<=5; i++){
            System.out.println("R1: Consegui " + i);
        }
        //Resolução 2
        int j = 1;
        while (j < 6){
            System.out.println("R2: Consegui " + j);
            j++;
        }
        //Resolução 3
        Integer vezes[] = {1, 2, 3, 4, 5};
        for(Integer i : vezes){
            System.out.println("R3: Consegui " + i);
        }
        //Resolução 4
        for (int i =1; i <= vezes.length; i++){
            System.out.println("R4: Consegui " + i);
        }

        System.out.println("-=-=-=-=-=-=-=-=-=");
        System.out.println(" ");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i: cars){
            System.out.println(i);
        }

        String example = "2021.10.10";
        Pattern pattern = Pattern.compile("(\\d{4})[.](\\d{2})[.](\\d{2})");
        Matcher matcher = pattern.matcher(example);

        while ((matcher.find())){
            System.out.println(matcher.group());
        }

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("hello1234goodboy789very2345");

        while ((m.find())){
            System.out.println(m.group());
        }

        String text = "John speak and John writes about that,\"\r\n"
                + " and John think 2021.10.10 about everything. ";

        String nome = "(John)";

        Pattern patternNome = Pattern.compile(nome);
        Matcher matcherNome = patternNome.matcher(text);

        while (matcherNome.find()){
            System.out.println("found" + matcherNome.group());
        }

    }
}
