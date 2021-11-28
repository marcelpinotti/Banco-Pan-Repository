public class MetodosStringRegex {

    public static void main(String[] args) {

        //Replace
        System.out.println("Replace");
        String frase = "Eu Curso Análise e Desenvolvimento de Sistemas";
        System.out.println ("String original é ':" + frase);
        System.out.println("-x-x-x-x-");
        System.out.println ("Vou substituir toda letra 'e' por 'E': " + frase.replace ('e', 'E'));
        System.out.println("-x-x-x-x-");
        System.out.println ("Vou substituir Análise e Desenvolvimento de Sistemas por ADS': " + frase.replace ("Análise e Desenvolvimento de Sistemas", "ADS"));

        //ReplaceAll
        System.out.println("\nReplaceAll");
        String fraseModificada = frase.replaceAll("\\s", "");
        System.out.println (fraseModificada);

        //ReplaceFirst
        System.out.println("\nReplaceFirst");
        String fraseFirst= frase.replaceFirst ("A", "---SUBSTITUÍ o primeiro 'A' AQUI---");
        System.out.println (fraseFirst);



    }
}
