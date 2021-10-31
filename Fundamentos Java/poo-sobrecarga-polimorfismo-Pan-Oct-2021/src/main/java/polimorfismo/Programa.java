package polimorfismo;

public class Programa {
	
	public static void main(String[] args) {

		Colaborador col1 = new Colaborador();
		Colaborador col2 = new Gestor();
		
	
		 col1.setSalario(300);
		 col2.setSalario(300);
		 
		 
		 System.out.println(col1.calculaPremio());
		 System.out.println(col2.calculaPremio());

	}

}
