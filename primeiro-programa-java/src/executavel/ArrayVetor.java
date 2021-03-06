package executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.setNome("Raphael Verissimo");
		aluno1.setNomeEscola("Java Dev");
		aluno2.setNome("Eurides Verissimo");
		aluno2.setNomeEscola("Fatec Presidente Prudente");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		double notas[] = {4,8.5,10,5};
		disciplina.setNota(notas);
		aluno1.getDisciplinas().add(disciplina);
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Banco de Dados");
		double notas2[] = {9.5,10,8.2,1};
		disciplina2.setNota(notas2);
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Teoria dos Eventos");
		double notas3[] = {10,4,5,10};
		disciplina3.setNota(notas3);
		aluno2.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Calculo e Custos I");
		double notas4[] = {10,8,6,2};
		disciplina4.setNota(notas4);
		aluno2.getDisciplinas().add(disciplina4);
		
		
		
		System.out.println();
		System.out.println("**************Disciplinas do Aluno**************");
		
		//*************************************************************************
		
		Aluno[] arrayAlunos = new Aluno[2];
		
		arrayAlunos[0] = aluno1;
		arrayAlunos[1] = aluno2;
		
		for(int i = 0 ;i < arrayAlunos.length; i++) {
			System.out.println("Nome do aluno e " + arrayAlunos[i].getNome());
		
			for(Disciplina d : arrayAlunos[i].getDisciplinas()) {
				
				System.out.println("Nome da disciplina e :" + d.getDisciplina());
				
				for(int j = 0 ; j < d.getNota().length; j ++) {
					System.out.println("A nota numero  "+ j + " = " + d.getNota()[j] );
				}
				
				
			}
			System.out.println();
		}
		
	
	}

}
