public class Notas{
	public static void main(String[] args){
		double[] notasAlunos;

		notasAlunos = new double[5];
		notasAlunos[0] = 6.9;
		notasAlunos[1] = 10.0;
		notasAlunos[2] = 2.3;
		notasAlunos[3] = 9.9;
		notasAlunos[4] = 9.56;

		for (double notas : notasAlunos){
			System.out.print(notas + " - ");
		}
	}
}