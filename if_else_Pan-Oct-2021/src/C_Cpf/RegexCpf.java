package C_Cpf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCpf {
	
	
	public static String adicionarMascaraCpf(String cpf) {
		Pattern pattern = Pattern.compile("(\\d{2})(\\d{3})(\\d{3})(\\d{1})");
		Matcher matcher = pattern.matcher(cpf);
		if(cpf.length()!= 9) {
			System.out.println("Não tem 9 digitos");
			return cpf;
		} else {
			return matcher.replaceAll("$1.$2.$3-$4");
		}
	}

}
