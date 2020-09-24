package cursojava.thread;

import javax.swing.JOptionPane;

public class ThreadEx {

	public static void main(String[] args) throws InterruptedException {
		
	
		Thread threadEmail = new Thread(thread1); 
		threadEmail.start();
		
		
		Thread ThreadNfe = new Thread(thread2);
		ThreadNfe.start();

		System.out.println("Chegou ao fim");
		JOptionPane.showInternalMessageDialog(null, "Sistema continua executando!");
	}
	
	
	//*************************************THREADS*************************************************
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
 
			for(int pos = 0 ; pos < 10; pos++) {
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Executando alguma rotina");
			
			}
			
		}
	};
	
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			for(int i  = 0; i < 10; i++) {
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Envio de nfe!!!");
			}
			
		}
	};
	
	
	
	
	
	
	
}
