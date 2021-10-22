import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		
		LinkedList<String> car = new LinkedList<String>();
		
		car.add("EcoSport");
		car.add("Mercedes");
		car.add("Fox");
		car.add("Gol");
		
		System.out.println(car.contains("Gol"));
		car.addFirst("Palio");
		car.addLast("Mazda");
		
		System.out.println(car.getLast());
		
		car.removeLast();
		
		System.out.println(car.get(0));
		System.out.println(car.getLast());
		car.clear();
		
		System.out.println(car);

	}

}
