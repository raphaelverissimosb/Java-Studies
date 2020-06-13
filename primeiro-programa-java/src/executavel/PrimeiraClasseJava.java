package executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual e a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual e a data de nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Qual e o Rg do aluno?");
		String numeroCpf = JOptionPane.showInputDialog("Qual e o cpf do aluno?");		
		String nomeMae = JOptionPane.showInputDialog("Qual e o nome da mae do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual e o nome do pai do aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Qual seria a data da matricula?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual e a serie do aluno?"); 
		String nomeEscola = JOptionPane.showInputDialog("Qual e o nome da escola ?");
		
		
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(nomeEscola);
		
		
		for(int pos = 1 ; pos <=4; pos++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina"+pos+"?");
			String notaDisciplina = JOptionPane.showInputDialog("Qual e a nota"+pos+"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if(escolha == 0) {
			
			int continuarRemover = 0;
			int posicao = 1;
			while (continuarRemover == 0){
			
			String disciplinaRemover = JOptionPane.showInputDialog("Qual e a disciplina 1,2,3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Contiuar removendo ?");
			
			}
		}
		
		
		/*
		System.out.println("Media = " + aluno1.getMediaNota());
		System.out.println("Situacao do aluno :" + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		*/
	}
}