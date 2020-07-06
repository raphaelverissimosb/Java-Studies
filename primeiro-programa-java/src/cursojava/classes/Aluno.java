package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa {
	

	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	
	private List <Disciplina> disciplinas = new ArrayList<>();

	
	
	//constructors
	public Aluno() {
		
	}
	public Aluno(String nome) {
		super.nome = nome;
	}
	

	//Getters and Setters
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
			somaNotas += disciplina.getNota();
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
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}

	// to String method 
	
	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}
	
	
	
	
	
	
	
	
}
