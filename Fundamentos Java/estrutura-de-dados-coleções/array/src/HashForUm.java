import java.util.HashMap;
import java.util.Map;

public class HashForUm {

	public static void main(String[] args) {
		
		Map<String, String> tabelaCursos = new HashMap<String, String>();
		
		tabelaCursos.put("Ang", "Angular9");
		tabelaCursos.put("J...", "Java");
		tabelaCursos.put("O...", "Oracle");
		
		for(Map.Entry<String, String> conjunto : tabelaCursos.entrySet()){
			System.out.println(conjunto.getKey() + " = " + conjunto.getValue());
		}

		System.out.println("-------------------");
		
		for(Map.Entry<String, String> conjunto : tabelaCursos.entrySet()){
			if(conjunto.getKey() == "Ang"){
			System.out.println(conjunto.getKey() + " = " + conjunto.getValue());
			}
		}
	}

}
