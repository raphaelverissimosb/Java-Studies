package cursojava.interfaces;

public interface PermitirAcesso {

	
	 // It will be our contract
	
	public boolean autenticar(String usuario, String senha);
	public boolean autenticar();
	
}
