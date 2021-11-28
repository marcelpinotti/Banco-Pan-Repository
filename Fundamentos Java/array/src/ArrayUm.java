import java.util.ArrayList;
import java.util.HashMap;

public class ArrayUm {

	public static void main(String[] args) {
		
		HashMap<String, String> hashMapUm = new HashMap<>();
		hashMapUm.put("procuro", "Fui achado hash.");
		hashMapUm.put("procuro 2", "Fui achado hash 2.");
		
		
		String value = hashMapUm.get("procuro");
		System.out.println(value);
		
		
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Tópico 1 da lista me achou.");
		lista.add("Tópico 2 da lista me achou.");
		
		String str1 = lista.get(0);
		System.out.println(str1);
	}
	

}
