import java.util.ArrayList;

public class ArrayForUm {

	public static void main(String[] args) {
		
		ArrayList<String> pessoas = new ArrayList<>();
		
		pessoas.add("Luiza");
		pessoas.add("Gabriel");
		pessoas.add("Marcio");
		
		System.out.println("-----Todos-----");
		for (String pessoa : pessoas) {
			System.out.printf("Posi��o %s\n", pessoa);
		}
		
		System.out.println("-----Come�a com L-----");
		for (String pessoa : pessoas) {
			if(pessoa.charAt(0) == 'L') {
			System.out.printf("Pessoa %s\n", pessoa);
			}
		}
		
		System.out.println("-----Pessoas e �ndices-----");
		System.out.println("Indo um por um");
		int i = 0;
		for (String pessoa : pessoas) {
			System.out.printf("Posi��o %d - %s\n",i , pessoa);
			i++;
		}
		
	}

}
