package cursojava.thread;

import javax.swing.JOptionPane;

public class ThreadEx {

	public static void main(String[] args) throws InterruptedException {
		
		
		new Thread () {
			public void run() {
				
				// codigo da rotina que quero executar em paralelo 
				for(int pos = 0 ; pos < 10; pos++) {
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					/*Da um tempo para a execucao do codigo*/
					/*Quero executar esse envio com um tempo de parada ou um tempo deterinado*/
					
					System.out.println("Executando alguma rotina");
				
				}
			}
		}.start(); // liga a thread que processa por tras
		

		
		//codigo do sistema que continua executando
		System.out.println("Chegou ao fim");
		//Fluxo do sistema 
		JOptionPane.showInternalMessageDialog(null, "Sistema continua executando!");
	}
}
