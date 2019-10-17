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
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;

public class telaMain {

	private JFrame frame;
	private JTextField textFdMediaARS;
	private JTextField textFdMediaAritmeticaPond;
	private JTextField textFdMediaHarmonica;
	private JTextField textFdMediaGeometrica;
	private JTextField textFdSomatorio;
	private JTextField textFdModa;
	private JTextField textFdMediana;
	private JTextField textFdVarianca;
	private JTextField textFdDesvioPadrao;
	private JTextField textFdProduto;
	private JTextField textFdProbabilidade;
	private JTextField textFdFatorial;

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
		frame.setBounds(100, 100, 947, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel somatorio = new JPanel();
		tabbedPane.addTab("Somatorio", null, somatorio, null);
		
		JLabel lblSomatrio = new JLabel("Somatório");
		
		textFdSomatorio = new JTextField();
		textFdSomatorio.setText("11");
		textFdSomatorio.setHorizontalAlignment(SwingConstants.CENTER);
		textFdSomatorio.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFdSomatorio.setEditable(false);
		textFdSomatorio.setColumns(10);
		
		JTextPane textPSomatorio = new JTextPane();
		textPSomatorio.setEditable(false);
		textPSomatorio.setBackground(UIManager.getColor("Button.background"));
		
		JCheckBox checkBxSomatorio = new JCheckBox("Exibir Wiki");
		checkBxSomatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkBxSomatorio.isSelected()) {
					textPSomatorio.setText("333");
				}else {
					textPSomatorio.setText("");
				}
			}
		});
		
		GroupLayout gl_somatorio = new GroupLayout(somatorio);
		gl_somatorio.setHorizontalGroup(
			gl_somatorio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_somatorio.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_somatorio.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSomatrio, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_somatorio.createSequentialGroup()
							.addGroup(gl_somatorio.createParallelGroup(Alignment.LEADING)
								.addComponent(textFdSomatorio, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(checkBxSomatorio, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addGap(61)
							.addComponent(textPSomatorio, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_somatorio.setVerticalGroup(
			gl_somatorio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_somatorio.createSequentialGroup()
					.addGap(20)
					.addComponent(lblSomatrio)
					.addGap(6)
					.addGroup(gl_somatorio.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_somatorio.createSequentialGroup()
							.addComponent(textFdSomatorio, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(checkBxSomatorio))
						.addComponent(textPSomatorio, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(402, Short.MAX_VALUE))
		);
		somatorio.setLayout(gl_somatorio);
		
		JPanel mediaS = new JPanel();
		tabbedPane.addTab("Médias", null, mediaS, null);
		
		JLabel lblmediaARS = new JLabel("Média Aritmética Simples");
		
		JLabel lblMediaAritmeticaPonderada = new JLabel("Media Aritmetica Ponderada");
		
		JLabel lblMediaHarmonica = new JLabel("Média Harmonica");
		
		JLabel lblMediaGeometrica = new JLabel("Media Geometrica");
		
		textFdMediaARS = new JTextField();
		textFdMediaARS.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFdMediaARS.setText("11");
		textFdMediaARS.setHorizontalAlignment(SwingConstants.CENTER);
		textFdMediaARS.setEditable(false);
		textFdMediaARS.setColumns(10);
		
		textFdMediaAritmeticaPond = new JTextField();
		textFdMediaAritmeticaPond.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFdMediaAritmeticaPond.setText("12");
		textFdMediaAritmeticaPond.setHorizontalAlignment(SwingConstants.CENTER);
		textFdMediaAritmeticaPond.setEditable(false);
		textFdMediaAritmeticaPond.setColumns(10);
		
		textFdMediaHarmonica = new JTextField();
		textFdMediaHarmonica.setText("23");
		textFdMediaHarmonica.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFdMediaHarmonica.setHorizontalAlignment(SwingConstants.CENTER);
		textFdMediaHarmonica.setEditable(false);
		textFdMediaHarmonica.setColumns(10);
		
		textFdMediaGeometrica = new JTextField();
		textFdMediaGeometrica.setHorizontalAlignment(SwingConstants.CENTER);
		textFdMediaGeometrica.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFdMediaGeometrica.setText("422");
		textFdMediaGeometrica.setEditable(false);
		textFdMediaGeometrica.setColumns(10);
		JTextPane textPMediaARS = new JTextPane();
		textPMediaARS.setBackground(UIManager.getColor("CheckBox.background"));
		textPMediaARS.setText("                                             ");
		textPMediaARS.setEditable(false);
		
		JTextPane textPMediaAritmeticaPond = new JTextPane();
		textPMediaAritmeticaPond.setBackground(UIManager.getColor("CheckBox.background"));
		textPMediaAritmeticaPond.setEditable(false);
		
		JTextPane textPMediaHarmonica = new JTextPane();
		textPMediaHarmonica.setBackground(UIManager.getColor("CheckBox.background"));
		textPMediaHarmonica.setEditable(false);
		
		JTextPane textPMediaGeometrica = new JTextPane();
		textPMediaGeometrica.setBackground(UIManager.getColor("CheckBox.background"));
		textPMediaGeometrica.setEditable(false);
		
		JCheckBox chckbxMediaARS = new JCheckBox("Exibir Wiki");
		chckbxMediaARS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxMediaARS.isSelected()) {
					textPMediaARS.setText("333");
				}else {
					textPMediaARS.setText("");
				}
			}
		});
		
		JCheckBox chckbxMediaAritmeticaPond = new JCheckBox("Exibir Wiki");
		chckbxMediaAritmeticaPond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxMediaAritmeticaPond.isSelected()) {
					textPMediaAritmeticaPond.setText("333");
				}else {
					textPMediaAritmeticaPond.setText("");
				}
			}
		});
		
		JCheckBox chckbxMediaHarmonica = new JCheckBox("Exibir Wiki");
		chckbxMediaHarmonica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxMediaHarmonica.isSelected()) {
					textPMediaHarmonica.setText("333");
				}else {
					textPMediaHarmonica.setText("");
				}
			}
		});
		
		JCheckBox chckbxMediaGeometrica = new JCheckBox("Exibir Wiki");
		chckbxMediaGeometrica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxMediaGeometrica.isSelected()) {
					textPMediaGeometrica.setText("333");
				}else {
					textPMediaGeometrica.setText("");
				}
			}
		});
		
		
		GroupLayout gl_mediaS = new GroupLayout(mediaS);
		gl_mediaS.setHorizontalGroup(
			gl_mediaS.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mediaS.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_mediaS.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxMediaARS)
						.addComponent(chckbxMediaAritmeticaPond)
						.addComponent(lblMediaAritmeticaPonderada)
						.addComponent(chckbxMediaGeometrica)
						.addComponent(chckbxMediaHarmonica)
						.addComponent(lblMediaGeometrica)
						.addComponent(lblMediaHarmonica)
						.addComponent(lblmediaARS)
						.addComponent(textFdMediaGeometrica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFdMediaAritmeticaPond, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFdMediaHarmonica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFdMediaARS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
					.addGroup(gl_mediaS.createParallelGroup(Alignment.LEADING)
						.addComponent(textPMediaARS, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPMediaAritmeticaPond, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPMediaHarmonica, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPMediaGeometrica, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_mediaS.setVerticalGroup(
			gl_mediaS.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mediaS.createSequentialGroup()
					.addGap(18)
					.addComponent(lblmediaARS)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mediaS.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mediaS.createSequentialGroup()
							.addComponent(textFdMediaARS, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxMediaARS)
							.addGap(43)
							.addComponent(lblMediaAritmeticaPonderada))
						.addComponent(textPMediaARS, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mediaS.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mediaS.createSequentialGroup()
							.addComponent(textFdMediaAritmeticaPond, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxMediaAritmeticaPond)
							.addGap(51)
							.addComponent(lblMediaHarmonica))
						.addComponent(textPMediaAritmeticaPond, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mediaS.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mediaS.createSequentialGroup()
							.addComponent(textFdMediaHarmonica, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxMediaHarmonica)
							.addGap(42)
							.addComponent(lblMediaGeometrica))
						.addComponent(textPMediaHarmonica, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_mediaS.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mediaS.createSequentialGroup()
							.addComponent(textFdMediaGeometrica, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxMediaGeometrica))
						.addComponent(textPMediaGeometrica, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		mediaS.setLayout(gl_mediaS);
		
		JPanel moda = new JPanel();
		tabbedPane.addTab("Moda", null, moda, null);
		
		JLabel lblModa = new JLabel("Moda");
		
		textFdModa = new JTextField();
		textFdModa.setText("11");
		textFdModa.setHorizontalAlignment(SwingConstants.CENTER);
		textFdModa.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFdModa.setEditable(false);
		textFdModa.setColumns(10);
		
		JTextPane textPModa = new JTextPane();
		textPModa.setEditable(false);
		textPModa.setBackground(UIManager.getColor("Button.background"));
		
		JCheckBox checkBxModa = new JCheckBox("Exibir Wiki");
		checkBxModa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkBxModa.isSelected()) {
					textPModa.setText("23332");
				}else {
					textPModa.setText("");
				}
			}
		});
		
		GroupLayout gl_moda = new GroupLayout(moda);
		gl_moda.setHorizontalGroup(
			gl_moda.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_moda.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_moda.createParallelGroup(Alignment.LEADING)
						.addComponent(lblModa, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_moda.createSequentialGroup()
							.addGroup(gl_moda.createParallelGroup(Alignment.LEADING)
								.addComponent(textFdModa, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(checkBxModa, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addGap(61)
							.addComponent(textPModa, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(50, Short.MAX_VALUE))
		);
		gl_moda.setVerticalGroup(
			gl_moda.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_moda.createSequentialGroup()
					.addGap(22)
					.addComponent(lblModa)
					.addGap(6)
					.addGroup(gl_moda.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_moda.createSequentialGroup()
							.addComponent(textFdModa, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(checkBxModa))
						.addComponent(textPModa, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(400, Short.MAX_VALUE))
		);
		moda.setLayout(gl_moda);
		
		JPanel mediana = new JPanel();
		tabbedPane.addTab("Mediana", null, mediana, null);
		
		JLabel label_2 = new JLabel("Média Aritmética Simples");
		
		textFdMediana = new JTextField();
		textFdMediana.setText("11");
		textFdMediana.setHorizontalAlignment(SwingConstants.CENTER);
		textFdMediana.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFdMediana.setEditable(false);
		textFdMediana.setColumns(10);
		
		JTextPane textPMediana = new JTextPane();
		textPMediana.setEditable(false);
		textPMediana.setBackground(UIManager.getColor("Button.background"));
		JCheckBox checkBxMediana = new JCheckBox("Exibir Wiki");
		
		checkBxMediana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkBxMediana.isSelected()) {
					textPMediana.setText("155123145125125");
				}else {
					textPMediana.setText("");
				}
			}
		});
		
		GroupLayout gl_mediana = new GroupLayout(mediana);
		gl_mediana.setHorizontalGroup(
			gl_mediana.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mediana.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_mediana.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_mediana.createSequentialGroup()
							.addGroup(gl_mediana.createParallelGroup(Alignment.LEADING)
								.addComponent(textFdMediana, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(checkBxMediana, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addGap(61)
							.addComponent(textPMediana, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(46, Short.MAX_VALUE))
		);
		gl_mediana.setVerticalGroup(
			gl_mediana.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mediana.createSequentialGroup()
					.addGap(26)
					.addComponent(label_2)
					.addGap(6)
					.addGroup(gl_mediana.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mediana.createSequentialGroup()
							.addComponent(textFdMediana, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(checkBxMediana))
						.addComponent(textPMediana, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(396, Short.MAX_VALUE))
		);
		mediana.setLayout(gl_mediana);
		
		JPanel variancia = new JPanel();
		tabbedPane.addTab("Variancia", null, variancia, null);
		
		JLabel lblVariana = new JLabel("Variancia");
		
		textFdVarianca = new JTextField();
		textFdVarianca.setText("11");
		textFdVarianca.setHorizontalAlignment(SwingConstants.CENTER);
		textFdVarianca.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFdVarianca.setEditable(false);
		textFdVarianca.setColumns(10);
		
		JTextPane textPVariancia = new JTextPane();
		textPVariancia.setEditable(false);
		textPVariancia.setBackground(UIManager.getColor("Button.background"));
		
		JCheckBox checkBxVariancia = new JCheckBox("Exibir Wiki");
		checkBxVariancia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkBxVariancia.isSelected()) {
					textPVariancia.setText("vadavsdvwawdvwdvawd");
				}else {
					textPVariancia.setText("");
				}
			}
		});
		
		GroupLayout gl_variancia = new GroupLayout(variancia);
		gl_variancia.setHorizontalGroup(
			gl_variancia.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_variancia.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_variancia.createParallelGroup(Alignment.LEADING)
						.addComponent(lblVariana, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_variancia.createSequentialGroup()
							.addGroup(gl_variancia.createParallelGroup(Alignment.LEADING)
								.addComponent(textFdVarianca, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(checkBxVariancia, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addGap(61)
							.addComponent(textPVariancia, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_variancia.setVerticalGroup(
			gl_variancia.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_variancia.createSequentialGroup()
					.addGap(25)
					.addComponent(lblVariana)
					.addGap(6)
					.addGroup(gl_variancia.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_variancia.createSequentialGroup()
							.addComponent(textFdVarianca, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(checkBxVariancia))
						.addComponent(textPVariancia, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(397, Short.MAX_VALUE))
		);
		variancia.setLayout(gl_variancia);
		
		JPanel desvioPadrao = new JPanel();
		tabbedPane.addTab("Desvio Padrão", null, desvioPadrao, null);
		
		JLabel lblDesvioPadro = new JLabel("Desvio Padrão");
		
		textFdDesvioPadrao = new JTextField();
		textFdDesvioPadrao.setText("11");
		textFdDesvioPadrao.setHorizontalAlignment(SwingConstants.CENTER);
		textFdDesvioPadrao.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFdDesvioPadrao.setEditable(false);
		textFdDesvioPadrao.setColumns(10);
		
		JTextPane textPDesvioPadrao = new JTextPane();
		textPDesvioPadrao.setEditable(false);
		textPDesvioPadrao.setBackground(UIManager.getColor("Button.background"));
		
		JCheckBox checkBxDesvioPadrao = new JCheckBox("Exibir Wiki");
		checkBxDesvioPadrao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkBxDesvioPadrao.isSelected()) {
					textPDesvioPadrao.setText("3123131412");
				} else {
					textPDesvioPadrao.setText("");
				}
			}
		});
		
		GroupLayout gl_desvioPadrao = new GroupLayout(desvioPadrao);
		gl_desvioPadrao.setHorizontalGroup(
			gl_desvioPadrao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_desvioPadrao.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_desvioPadrao.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDesvioPadro, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_desvioPadrao.createSequentialGroup()
							.addGroup(gl_desvioPadrao.createParallelGroup(Alignment.LEADING)
								.addComponent(textFdDesvioPadrao, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(checkBxDesvioPadrao, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addGap(61)
							.addComponent(textPDesvioPadrao, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(49, Short.MAX_VALUE))
		);
		gl_desvioPadrao.setVerticalGroup(
			gl_desvioPadrao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_desvioPadrao.createSequentialGroup()
					.addGap(28)
					.addComponent(lblDesvioPadro)
					.addGap(6)
					.addGroup(gl_desvioPadrao.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_desvioPadrao.createSequentialGroup()
							.addComponent(textFdDesvioPadrao, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(checkBxDesvioPadrao))
						.addComponent(textPDesvioPadrao, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(394, Short.MAX_VALUE))
		);
		desvioPadrao.setLayout(gl_desvioPadrao);
		
		JPanel produto = new JPanel();
		tabbedPane.addTab("Produto", null, produto, null);
		
		JLabel lblProduto = new JLabel("Produto");
		
		textFdProduto = new JTextField();
		textFdProduto.setText("11");
		textFdProduto.setHorizontalAlignment(SwingConstants.CENTER);
		textFdProduto.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFdProduto.setEditable(false);
		textFdProduto.setColumns(10);
		
		JTextPane textPProduto = new JTextPane();
		
		textPProduto.setEditable(false);
		textPProduto.setBackground(UIManager.getColor("Button.background"));
		JCheckBox checkBxProduto = new JCheckBox("Exibir Wiki");
		checkBxProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkBxProduto.isSelected()) {
					textPProduto.setText("33214412312412");
				} else {
					textPProduto.setText("");
				}
			}
		});
		
		GroupLayout gl_produto = new GroupLayout(produto);
		gl_produto.setHorizontalGroup(
			gl_produto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_produto.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_produto.createParallelGroup(Alignment.LEADING)
						.addComponent(lblProduto, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_produto.createSequentialGroup()
							.addGroup(gl_produto.createParallelGroup(Alignment.LEADING)
								.addComponent(textFdProduto, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(checkBxProduto, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addGap(61)
							.addComponent(textPProduto, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		gl_produto.setVerticalGroup(
			gl_produto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_produto.createSequentialGroup()
					.addGap(28)
					.addGap(3)
					.addComponent(lblProduto)
					.addGap(6)
					.addGroup(gl_produto.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_produto.createSequentialGroup()
							.addComponent(textFdProduto, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(checkBxProduto))
						.addComponent(textPProduto, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(394, Short.MAX_VALUE))
		);
		produto.setLayout(gl_produto);
		
		JPanel probabilidade = new JPanel();
		tabbedPane.addTab("Probabilidade", null, probabilidade, null);
		
		JLabel lblProbabilidade = new JLabel("Probabilidade");
		
		textFdProbabilidade = new JTextField();
		textFdProbabilidade.setText("11");
		textFdProbabilidade.setHorizontalAlignment(SwingConstants.CENTER);
		textFdProbabilidade.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFdProbabilidade.setEditable(false);
		textFdProbabilidade.setColumns(10);
		
		JTextPane textPProbabilidade = new JTextPane();
		textPProbabilidade.setText("");
		textPProbabilidade.setEditable(false);
		textPProbabilidade.setBackground(UIManager.getColor("Button.background"));
		
		JCheckBox checkBxProbabilidade = new JCheckBox("Exibir Wiki");
		checkBxProbabilidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkBxProbabilidade.isSelected()) {
					textPProbabilidade.setText("51235125123125125");
				} else {
					textPProbabilidade.setText("");	
				}
			}
		});
		
		GroupLayout gl_probabilidade = new GroupLayout(probabilidade);
		gl_probabilidade.setHorizontalGroup(
			gl_probabilidade.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_probabilidade.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_probabilidade.createParallelGroup(Alignment.LEADING)
						.addComponent(lblProbabilidade, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_probabilidade.createSequentialGroup()
							.addGroup(gl_probabilidade.createParallelGroup(Alignment.LEADING)
								.addComponent(textFdProbabilidade, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(checkBxProbabilidade, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addGap(61)
							.addComponent(textPProbabilidade, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		gl_probabilidade.setVerticalGroup(
			gl_probabilidade.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_probabilidade.createSequentialGroup()
					.addGap(28)
					.addComponent(lblProbabilidade)
					.addGap(6)
					.addGroup(gl_probabilidade.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_probabilidade.createSequentialGroup()
							.addComponent(textFdProbabilidade, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(checkBxProbabilidade))
						.addComponent(textPProbabilidade, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(394, Short.MAX_VALUE))
		);
		probabilidade.setLayout(gl_probabilidade);
		
		JPanel fatorial = new JPanel();
		tabbedPane.addTab("Fatorial", null, fatorial, null);
		
		JLabel lblFatorial = new JLabel("Fatorial");
		
		textFdFatorial = new JTextField();
		textFdFatorial.setText("11");
		textFdFatorial.setHorizontalAlignment(SwingConstants.CENTER);
		textFdFatorial.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFdFatorial.setEditable(false);
		textFdFatorial.setColumns(10);
		
		JTextPane textPFatorial = new JTextPane();
		textPFatorial.setText("");
		textPFatorial.setEditable(false);
		textPFatorial.setBackground(UIManager.getColor("Button.background"));
		
		JCheckBox checkBxFatorial = new JCheckBox("Exibir Wiki");
		checkBxFatorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkBxFatorial.isSelected()) {
					textPFatorial.setText("51261261416161357");
				} else {
					textPFatorial.setText("");
				}
			}
		});
		
		GroupLayout gl_fatorial = new GroupLayout(fatorial);
		gl_fatorial.setHorizontalGroup(
			gl_fatorial.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fatorial.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_fatorial.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFatorial, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_fatorial.createSequentialGroup()
							.addGroup(gl_fatorial.createParallelGroup(Alignment.LEADING)
								.addComponent(textFdFatorial, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
								.addComponent(checkBxFatorial, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addGap(61)
							.addComponent(textPFatorial, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		gl_fatorial.setVerticalGroup(
			gl_fatorial.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fatorial.createSequentialGroup()
					.addGap(29)
					.addComponent(lblFatorial)
					.addGap(6)
					.addGroup(gl_fatorial.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_fatorial.createSequentialGroup()
							.addComponent(textFdFatorial, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(checkBxFatorial))
						.addComponent(textPFatorial, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(393, Short.MAX_VALUE))
		);
		fatorial.setLayout(gl_fatorial);
		
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
		
		JMenuItem mntmEditarNumeros = new JMenuItem("Editar Numeros");
		mnNewMenu.add(mntmEditarNumeros);
		
		JMenuItem sair = new JMenuItem("Sair");
		mnNewMenu.add(sair);
	}
}
