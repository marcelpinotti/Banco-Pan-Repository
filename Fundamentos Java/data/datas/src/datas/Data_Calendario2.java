package datas;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Data_Calendario2 {
	
	public static void main(String[] args) {
		
		  /// instanciou (muito simples)
	      Calendar calendario1 = (Calendar) Calendar.getInstance();
	 
	      
	      int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento "));
	    
	      int ano_atual = calendario1.get(Calendar.YEAR);
	      
	      int idade = ano_atual - ano;
	      
	      System.out.println(idade);

	}

}
