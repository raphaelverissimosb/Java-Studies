package cursojava.thread;

public class ThreadEx {

	public static void main(String[] args) throws InterruptedException {
		
		
		for(int pos = 0 ; pos < 10; pos++) {
			
			
			Thread.sleep(10000);/*Da um tempo para a execucao do codigo*/
			/*Quero executar esse envio com um tempo de parada ou um tempo deterinado*/
			
			System.out.println("Executando alguma rotina");
		
		}
		
	}
}