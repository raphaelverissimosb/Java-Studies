package executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Raphael Verissimo");
		aluno1.setNomeEscola("Java Dev");
		
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
		
		System.out.println("Nopme do aluno = " + aluno1.getNome() + " inscrito na escola = " + aluno1.getNomeEscola());
		
		System.out.println();
		System.out.println("**************Disciplinas do Aluno**************");
		
		for(Disciplina discip : aluno1.getDisciplinas()) {
			System.out.println();
			System.out.println();
			System.out.println("Disciplina "+ discip.getDisciplina());
			
			double notaMax = 0.0;
			double notaMin = 0.0;
			
			System.out.println("**************Notas da Disciplina**************");
			for(int i = 0 ; i < discip.getNota().length; i++) {
				System.out.println("Nota " +( i + 1)+ " = " + discip.getNota()[i]);
				if(i == 0) {
					notaMax  = discip.getNota()[i]; 
				}else {
					if(discip.getNota()[i] > notaMax) {
						notaMax = discip.getNota()[i];
					}
				}
				
				if(i == 0) {
					notaMin = discip.getNota()[i];
				}else {
					if(discip.getNota()[i] < notaMin) {
						notaMin = discip.getNota()[i];
					}
				}
			
			}
			
			System.out.println("A maior nota da disciplina = " + discip.getDisciplina() + " e = " + notaMax);
			System.out.println("A menor nota da disciplina = " + discip.getDisciplina() + " e = " + notaMin);
			
			
		}
		
	
	}

}
