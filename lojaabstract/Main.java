abstract class Loja{
	public int cnpj;
	public String razaoSocial;
	protected boolean aberta;

	public Loja(int cnpj, String razaoSocial){
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.aberta = false;
	}

	public void abrir(){
		this.aberta = true;
		
	}

	public void fechar(){
		this.aberta = false;
		
	}
}


class LojaComercial extends Loja{

	public LojaComercial(int cnpj, String razaoSocial){
		super (cnpj, razaoSocial);
	}
}

public class Main{
	public static void main(String[] args){
		LojaComercial barbosa = new LojaComercial(123456789, "Barbosa Mercados");
	
		System.out.println("CNPJ: " + barbosa.cnpj + " Razao Social: " + barbosa.razaoSocial);
		barbosa.abrir();
		System.out.println("A loja está aberta? " + barbosa.aberta);

		barbosa.fechar();
		System.out.println("A loja está aberta? " + barbosa.aberta);
	}
}