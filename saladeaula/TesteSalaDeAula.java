class SalaDeAula{
	 static int contagemAlunos = 0;

	 public static void contador(int a){
	 	contagemAlunos++;
	 }

	 public static void totAlunos(){
	 	System.out.println("O total de alunos é: " + contagemAlunos);
	 }
}

public class TesteSalaDeAula{
	public static void main(String[] args){
		SalaDeAula.contador(1);
		SalaDeAula.contador(2);
		SalaDeAula.contador(3);
		SalaDeAula.totAlunos();
	}
}
