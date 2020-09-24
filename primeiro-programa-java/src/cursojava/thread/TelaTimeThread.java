package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	
	
	//Inicializar um painel para ser otimizado 
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descriptionTime = new JLabel("Time Thread1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descriptionTime1 = new JLabel("Time Thread2");
	private JTextField mostraTempo1 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	private JButton jButton1 = new JButton("Stop");
	
	
	
	//Thread Runnable Area 
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			while(true) { // Fica sempre rodando
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				mostraTempo1.setText( new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	

	private Thread thread1Time;
	private Thread thread2Time;
	
	public TelaTimeThread() {
		//Configuracoes iniciais
		setTitle("Minha Tela de Time com Thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		//Primeira Parte concluida
		
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); // Controlador de posicionamento de componentes 
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets  = new Insets(5,10,10,5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		
		descriptionTime.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descriptionTime, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		mostraTempo.setEditable(false);
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo, gridBagConstraints);
		
		
		descriptionTime1.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jPanel.add(descriptionTime1, gridBagConstraints);
		
		mostraTempo1.setPreferredSize(new Dimension(200,25));
		mostraTempo1.setEditable(false);
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo1 , gridBagConstraints);
		
		// 
		gridBagConstraints.gridwidth = 1;
		
		
		jButton.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy ++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton1.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButton1, gridBagConstraints);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { /*Executa o clique no botao*/
				
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jButton.setEnabled(false);
				jButton1.setEnabled(true);
				
			}
		});
		
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop();
				jButton.setEnabled(true);
				jButton1.setEnabled(false);
			}
		});
		
		
		jButton1.setEnabled(false);
		
		
		add(jPanel, BorderLayout.WEST);	
		//Deve ser o ultimo comando
	 setVisible(true); // Ultimo a ser executado, torna a tela visivel para o usuario
	}
	
	
}
