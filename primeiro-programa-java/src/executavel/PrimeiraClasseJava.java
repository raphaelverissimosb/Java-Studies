package executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

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
		String disciplina1 = JOptionPane.showInputDialog("Informe o nome da disciplina 1?");
		String nota1 = JOptionPane.showInputDialog("Qual e a nota 1?");
		String disciplina2 = JOptionPane.showInputDialog("Informe o nome da disciplina 2?");
		String nota2 = JOptionPane.showInputDialog("Qual e a nota 2?");
		String disciplina3 = JOptionPane.showInputDialog("Informe o nome da disciplina 3?");
		String nota3 = JOptionPane.showInputDialog("Qual e a nota 3?");
		String disciplina4 = JOptionPane.showInputDialog("Informe o nome da disciplina 4?");
		String nota4 = JOptionPane.showInputDialog("Qual e a nota 4?");
		
		
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomaMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		aluno1.setDisciplina1(disciplina1);
		aluno1.setDisciplina2(disciplina2);
		aluno1.setDisciplina3(disciplina3);
		aluno1.setDisciplina4(disciplina4);
		
		
		System.out.println("Media = " + aluno1.getMediaNota());
		System.out.println("Situacao do aluno :" + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
	}
}
