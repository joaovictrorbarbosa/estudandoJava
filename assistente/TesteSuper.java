class Funcionario{
	private String nome;
	private double salario;

	public Funcionario( String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}

	public void addAumento(double valor){
		this.salario += valor;
	}
	public double ganhoAnual(){
		return this.salario * 12;
	}
	public String getNome() {
        return nome;
	}
}

class Assistente extends Funcionario{
	public Assistente(String nome, double salario){
		super(nome, salario);
	}
	 public double ganhoAno() {
        return super.ganhoAnual() + 1000; 
	}
}

public class TesteSuper{
	public static void main(String[] args){
		Assistente assistente = new Assistente("João", 3000);
		assistente.addAumento(500);
		
		System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário anual: R$" + assistente.ganhoAno());
	}
}