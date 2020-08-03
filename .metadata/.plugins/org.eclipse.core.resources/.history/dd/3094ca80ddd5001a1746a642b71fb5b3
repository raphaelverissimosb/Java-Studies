package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa { // classe Aluno extende Pessoa e todos os seus atributos
	
    // declaracao de atributos 
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	
	// Lista de diciplinas 
	private List <Disciplina> disciplinas = new ArrayList<>();

	
	
	//constructors
	
	//Metodo construtor padrao da classe
	public Aluno() {
		
	}
	public Aluno(String nome) {
		super.nome = nome;
	}
	

	//Getters and Setters para instaciar valores dentro do array de disciplinas
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	//Getters and Setters dos atributos 
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	
	
	// Methods 
	
	// Metodo gerador de media de notas do aluno
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		// for para percorrer as disciplinas e apresentar as notas
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNotas();
		}
		return somaNotas / disciplinas.size();
	}
	
	public boolean getAlunoAprovado(){
		double media = this.getMediaNota();
		if(media >= 5) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getAlunoAporvado2() {
		double media = getMediaNota();
		if(media >= 5) {
			if(media >= 7) {
				return StatusAluno.APROVADO; // retorna uma constante para ter um maior controle do que for retornado 
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}
	
	@Override // sobrescrita da classe Pai vinda de um metodo abstrato
	public double salario() {
		return 1500.90;
	}
	
	
	@Override
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
	}
	
	// to String method 
	
	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}

	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Oba pessoa e maior de idade!" : "Pessoa nao e maior de idade!";
	}
	
	
}
