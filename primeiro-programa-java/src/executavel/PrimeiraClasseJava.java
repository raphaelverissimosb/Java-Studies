package executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesAuxiliares.FuncaoAutenticar;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		try {
		String login = JOptionPane.showInputDialog("Informe o login:");
		String senha = JOptionPane.showInputDialog("Informe a senha:");
		
		
		PermitirAcesso permitirAcesso = new Secretario(login , senha);
		
		
		if(new FuncaoAutenticar(permitirAcesso).autenticar()) { // I will block the contract just to permitted people 
		List<Aluno> alunos = new ArrayList<>();
		
		// HashMap
		HashMap<String, List<Aluno>> maps = new HashMap<>();
		
		
		
//		List<Aluno> alunosAprovados = new ArrayList<>();
//		List<Aluno> alunosRecuperacao = new ArrayList<>();
//		List<Aluno> alunosReprovados = new ArrayList<>();
		
		
		for(int qtd = 1 ; qtd <= 2; qtd++) {
			
		
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
			//disciplina.setNota(Double.valueOf(notaDisciplina));
			
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
		
		
		alunos.add(aluno1);
	}
		
	maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
	maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
	maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
	
		
	for(Aluno aluno : alunos) {
			if (aluno.getAlunoAporvado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if(aluno.getAlunoAporvado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
	}
	
	//Lista dos Aprovados 
	System.out.println("********** Lista dos Aprovados **********");
	for(Aluno aluno :maps.get(StatusAluno.APROVADO)) {
		System.out.println("Aluno:" + aluno.getNome());
		System.out.println("Media:" +aluno.getMediaNota());
		System.out.println("Resultado:" + aluno.getAlunoAporvado2());
		System.out.println();
	}
	
	System.out.println("********** Lista dos Recuperacao **********");
	for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
		System.out.println("Aluno:" + aluno.getNome());
		System.out.println("Media:" +aluno.getMediaNota());
		System.out.println("Resultado:" + aluno.getAlunoAporvado2());
		System.out.println();
	}
	
	System.out.println("********** Lista dos Reprovados **********");
	for(Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
		System.out.println("Aluno:" + aluno.getNome());
		System.out.println("Media:" +aluno.getMediaNota());
		System.out.println("Resultado:" + aluno.getAlunoAporvado2());
		System.out.println();
	}
	
	
	
	
	
//	//Percorrer listas por posicoes
//		for(int pos =0 ; pos < alunos.size(); pos ++ ) {
//			
//			Aluno aluno = alunos.get(pos);
//			
//			if(aluno.getNome().equalsIgnoreCase("Raphael")) {
//				
//				Aluno trocar =  new Aluno();
//				trocar.setNome("Aluno foi trocado");
//				
//				Disciplina disciplina  = new Disciplina();
//				disciplina.setDisciplina("Matematica");
//				disciplina.setNota(80);
//				
//				trocar.getDisciplinas().add(disciplina);
//				
//				alunos.set(pos, trocar);
//				aluno = alunos.get(pos);
//			}
//			
//			System.out.println("Aluno  = " + aluno.getNome());
//			System.out.println("Nota = " + aluno.getMediaNota());
//			System.out.println("Situacao do aluno = " + aluno.getAlunoAporvado2());
//			System.out.println("Resultado = " + aluno.getAlunoAprovado());
//	
//			for ( Disciplina disciplina : aluno.getDisciplinas()) {
//				 System.out.println("Materia = " + disciplina.getDisciplina() + ", nota ="+ disciplina.getNota());
//			 }
//			
//			for( int posd = 0 ; posd < aluno.getDisciplinas().size(); posd ++) {
//				Disciplina disc = aluno.getDisciplinas().get(posd);
//				System.out.println("Materia = " + disc.getDisciplina()+", nota =" + disc.getNota());
//			}
//		}
//		
		
//		for (Aluno aluno : alunos) {
//			if(aluno.getNome().equalsIgnoreCase("Raphael")) {
//			alunos.remove(aluno);
//			break;
//			}else {
//				System.out.println("Nome = " + aluno.getNome());
//				System.out.println("Media = " + aluno.getMediaNota());
//				System.out.println("Situacao do aluno :" + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
//				System.out.println("---------------------------------------------------------------------------");
//			}
//		}
//		
//		// alunos que sobraram na lista 
//		System.out.println("*************************************************0");
//		System.out.println("�lunos  que sobraram na lista");
//		for(Aluno aluno : alunos) {
//			
//			System.out.println("Nome do aluno:"+ aluno.getNome());
//			
//			for(Disciplina disciplina : aluno.getDisciplinas()) {
//				System.out.println(disciplina.getDisciplina());
//				System.out.println(disciplina.getNota());
//			}
//		}
		
		}else {
			System.out.println("Desculpe, usuario ou senha incorretos");
		}	
		
		}catch(NumberFormatException e) {
			
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace();
			
			System.out.println("Mensagem:" + e.getMessage());
			
			for(int i  = 0 ;i <= e.getStackTrace().length; i++) {
				saida.append("\n" + e.getStackTrace()[i].getClassName());
				saida.append("\n" + e.getStackTrace()[i].getLineNumber());
				saida.append("\n" + e.getStackTrace()[i].getMethodName());
			}
			
			
			JOptionPane.showMessageDialog(null, "Erro de conversao de numero" + e.getMessage());
			
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Opa um null pointer exception"  + e.getClass());
		}catch(Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro inesperado !" + e.getClass().getName());
		}finally {
			System.out.println("Obrigado por apreder Java!");
		}
		
	}
}
