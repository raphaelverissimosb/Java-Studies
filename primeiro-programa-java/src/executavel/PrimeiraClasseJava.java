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
		

		Disciplina disciplina1 = new Disciplina();

		String disciplina01 = JOptionPane.showInputDialog("Informe o nome da disciplina 1?");
		String nota01 = JOptionPane.showInputDialog("Qual e a nota 1?");
		disciplina1.setDisciplina(disciplina01);
		disciplina1.setNota(Double.valueOf(nota01));
		aluno1.getDisciplinas().add(disciplina1);
		
		
		Disciplina disciplina2 = new Disciplina();
		
		String disciplina02 = JOptionPane.showInputDialog("Informe o nome da disciplina 2?");
		String nota02 = JOptionPane.showInputDialog("Qual e a nota 2?");
		disciplina2.setDisciplina(disciplina02);
		disciplina2.setNota(Double.valueOf(nota02));
		aluno1.getDisciplinas().add(disciplina2);
		
		
		Disciplina disciplina3 = new Disciplina();
		
		String disciplina03 = JOptionPane.showInputDialog("Informe o nome da disciplina 2?");
		String nota03 = JOptionPane.showInputDialog("Qual e a nota 2?");
		disciplina3.setDisciplina(disciplina03);
		disciplina3.setNota(Double.valueOf(nota03));
		aluno1.getDisciplinas().add(disciplina3);
		
		
		
		
		
		
		/*
		System.out.println("Media = " + aluno1.getMediaNota());
		System.out.println("Situacao do aluno :" + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		*/
	}
}
