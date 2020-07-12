package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Diretor  extends Pessoa implements PermitirAcesso{
	
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	private String login;
	private String senha;
	
	
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	//Constructor
	
	public Diretor() {
		
	}
	
	public Diretor(String login , String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	
	@Override
	public double salario() {
		return 3900.78;
	}
	
	@Override
	public boolean pessoaMaiorIdade() {
		return super.pessoaMaiorIdade();
	}
	
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + "]";
	}
	
	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}
	
	

}
