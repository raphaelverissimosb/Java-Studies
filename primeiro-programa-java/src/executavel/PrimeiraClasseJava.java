package executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno("Josy");
		
		aluno1.setNota1(10);
		aluno1.setNota2(8);
		aluno1.setNota3(5.5);
		aluno1.setNota4(7);
		
		System.out.println("Media da nota e :" + aluno1.getMediaNota());
		System.out.println("Resultado, aluno aprovado ?:" + (aluno1.getAlunoAprovado() ? "Aprovado": "Reprovado"));
	}
}
