package estado;

public class Funcionario {
	
	private int id;
	
	private String nome;
	
	double salario;
	
	public Funcionario(int id,String nome,double salario) {
		
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String toString () {
		
		return id+"," +nome+ "," +salario+ "\n";
	}
	
	
}
