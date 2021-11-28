package operadores;

import java.util.Locale;

public class Calculos {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
	    int sum1 = 100 + 50;
	    int sum2 = sum1 + 250;
	    int sum3 = sum2 + sum2;
	    System.out.println(sum1);
	    System.out.println(sum2);
	    System.out.println(sum3);  

	    int valor = 5;
	    --valor;
	    System.out.println(valor);
	    
	    int divisao = 4/2;
	    System.out.println(divisao);

	    //forma dif
	    System.out.println(5.0/8.2);
	    
	    double teste = 4.0 / 9 ;
	    System.out.println ("Resultado - : " + teste );
	    
	    double testeUm = 4.0 / 9;
		System.out.printf("Resultado - :%.4f%n ", testeUm);
	    
	    int x = 2 * 4;
	    double y = x; 
	    System.out.println(y);
	  
	    
	    int teste2 = (int) (4.0 / 9) ;
	    System.out.println ("Resultado - : " + teste2 );
	    
	  }


}
