public class Funcionario{
	
	String nome;
	String cargo;
	int idade;

	Funcionario(String nomeInit, String cargoInit, int idadeInit) {
		nome = nomeInit;
		cargo = cargoInit;
		idade = idadeInit;
	}

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario("João", "Desenvolvedor", 23);
		
		Funcionario funcionario2 = new Funcionario("Maria", "Gerente", 20);
		

		System.out.println("Nome: " + funcionario1.nome);
		System.out.println("Cargo: " + funcionario1.cargo);
		System.out.println("Idade: " + funcionario1.idade);
		System.out.println("-------------------------");
		System.out.println("Nome: " + funcionario2.nome);
		System.out.println("Cargo: " + funcionario2.cargo);
		System.out.println("Idade: " + funcionario2.idade);
		}
	}
	 