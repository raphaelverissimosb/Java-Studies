package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa { 
	
     
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	
	private List <Disciplina> disciplinas = new ArrayList<>();

	public Aluno() {
		
	}
	public Aluno(String nome) {
		super.nome = nome;
	}
	
	
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
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
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
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
	
	@Override 
	public double salario() {
		return 1500.90;
	}

	@Override
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
	}
	 
	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Oba pessoa e maior de idade!" : "Pessoa nao e maior de idade!";
	}
	
	
}
