class Pessoa{
	public String nome;
	private int idade;
	private String endereco;
	String telefone;

	Pessoa(String nomeInit, int idadeInit, String enderecoInit, String telefoneInit){	
		nome = nomeInit;
		idade = idadeInit;
		endereco = enderecoInit;
		telefone = telefoneInit;
		}
	public int getIdade(){
		return idade;
		}
		
	public void setIdade(int idade){
		this.idade = idade;
		}
	public String getEndereco(){
		return endereco;
		}
	public void setEndereco(String endereco){
		this.endereco = endereco;
		}
	public String getTelefone(){
		return telefone;
		}
	public void setTelefone(String telefone){
		this.telefone = telefone;
		}
	}
	
	public class Aplicacao{
		public static void main(String[] args){
			Pessoa pessoa1 = new Pessoa ("João", 23,"Rua das estrelas,777", "(12) 12345-6789");

			//ACESSANDO E ALTERANDO DADOS:

			System.out.println("Nome: " +pessoa1.nome);
			System.out.println("Idade: " +pessoa1.getIdade());
			pessoa1.setIdade(25);
			System.out.println("Nova Idade: " +pessoa1.getIdade());
			System.out.println("Endereço: " + pessoa1.getEndereco());
			pessoa1.setEndereco("Rua dos passaros, 24");
			System.out.println("Novo endereço: " +pessoa1.getEndereco());
			System.out.println("Telefone: " + pessoa1.getTelefone());
			pessoa1.setTelefone("(12) 23456-9870");
			System.out.println("Novo Telefone: " +pessoa1.getTelefone());
		}
	}
