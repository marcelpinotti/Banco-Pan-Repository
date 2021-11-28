package A_Vazio;

public class Caractere {
	
	public static String metodoDigitado(String digitado) {
		if(digitado == null || digitado.isEmpty()) {
			System.out.println("Sem nada");
			return null;
		} else {
			return digitado;
		}
	}
	
	public static String metodoDigitadoUm(String digitado) {
		if(digitado == null) {
			return null;
		} else if (digitado.isEmpty()) {
			return "Sem nada";
		} else {
			return digitado;
		}
	}

}
