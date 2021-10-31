package polimorfismo;

public class Colaborador {

	    public String nome;
	    public String cpf;
	    public double salario;

	    public double calculaPremio() {
	        return salario += 100;
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

	
		}
	    
	     
	

