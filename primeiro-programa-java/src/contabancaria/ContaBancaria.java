package contabancaria;

public class ContaBancaria {

	double saldo = 8000;
	String descricao;
	
	public void sacarSaldo(double sacar) {
		saldo -= sacar;
	}
	public void depositarDinheiro(double depositar) {
		saldo += depositar;
	}
	
	
	public void setDescricaoConta(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	@Override
	public String toString() {
		return "ContaBancaria [saldo=" + saldo + ", descricao=" + descricao + "]";
	}
	
	
}
