package polimorfismo;

public class Gestor extends Colaborador {

	public double calculaPremio() {
		return this.salario += 200;
	}
}
