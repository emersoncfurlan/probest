package view.menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import view.cadastraAmostra.adicionarNum;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaMain window = new telaMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telaMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 947, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel somatorio = new JPanel();
		tabbedPane.addTab("Somatorio", null, somatorio, null);
		
		JPanel mediaS = new JPanel();
		tabbedPane.addTab("Médias", null, mediaS, null);
		
		JLabel lblmediaARS = new JLabel("Média Aritmética Simples");
		
		JLabel lblMediaAritmeticaPonderada = new JLabel("Media Aritmetica Ponderada");
		
		JLabel lblMdiaHarmonica = new JLabel("Média Harmonica");
		
		JLabel lblMediaGeometrica = new JLabel("Media Geometrica");
		GroupLayout gl_mediaS = new GroupLayout(mediaS);
		gl_mediaS.setHorizontalGroup(
			gl_mediaS.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mediaS.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_mediaS.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMediaGeometrica)
						.addComponent(lblMdiaHarmonica)
						.addComponent(lblmediaARS)
						.addComponent(lblMediaAritmeticaPonderada))
					.addContainerGap(608, Short.MAX_VALUE))
		);
		gl_mediaS.setVerticalGroup(
			gl_mediaS.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mediaS.createSequentialGroup()
					.addGap(18)
					.addComponent(lblmediaARS)
					.addGap(18)
					.addComponent(lblMediaAritmeticaPonderada)
					.addGap(18)
					.addComponent(lblMdiaHarmonica)
					.addGap(18)
					.addComponent(lblMediaGeometrica)
					.addContainerGap(204, Short.MAX_VALUE))
		);
		mediaS.setLayout(gl_mediaS);
		
		JPanel moda = new JPanel();
		tabbedPane.addTab("Moda", null, moda, null);
		
		JPanel mediana = new JPanel();
		tabbedPane.addTab("Mediana", null, mediana, null);
		
		JPanel variancia = new JPanel();
		tabbedPane.addTab("Variancia", null, variancia, null);
		
		JPanel desvioPadrao = new JPanel();
		tabbedPane.addTab("Desvio Padrão", null, desvioPadrao, null);
		
		JPanel produto = new JPanel();
		tabbedPane.addTab("Produto", null, produto, null);
		
		JPanel probabilidade = new JPanel();
		tabbedPane.addTab("Probabilidade", null, probabilidade, null);
		
		JPanel fatorial = new JPanel();
		tabbedPane.addTab("Fatorial", null, fatorial, null);
		
		JPanel mostrarAmostra = new JPanel();
		tabbedPane.addTab("Mostrar Amostra", null, mostrarAmostra, null);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Opções");
		menuBar.add(mnNewMenu);
		
		JMenuItem addNum = new JMenuItem("Adicionar Números");
		addNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adicionarNum exibir = new adicionarNum();
				exibir.setVisible(true);
			}
		});
		mnNewMenu.add(addNum);
		
		JMenuItem sair = new JMenuItem("Sair");
		mnNewMenu.add(sair);
	}
}
