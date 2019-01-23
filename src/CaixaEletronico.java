import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CaixaEletronico extends JFrame {

	private JPanel tela;
	private JPanel teclado;
	private JPanel depositoESaque;
	private JPanel painelUsuario;
	
	private JTextArea infoTela;
	private JTextField entradaUsuario;
	
	private JButton[] tecladoNumerico;
	private static final String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "<-", "Enter"};
	
	private JButton sacaDinheiro;
	private JButton insereEnvelope;
	
	public CaixaEletronico(){
		
		super("Caixa Eletrônio");
		setLayout(new GridLayout(2, 1));
		
		tela = new JPanel(new GridLayout(2, 1));
		teclado = new JPanel(new GridLayout(4, 3));
		depositoESaque = new JPanel(new GridLayout(2, 1));
		painelUsuario = new JPanel(new GridLayout(1, 2));
		
		add(tela);
		add(painelUsuario);
		
		painelUsuario.add(teclado);
		painelUsuario.add(depositoESaque);
		
		infoTela = new JTextArea();
		infoTela.setText(String.format("1 - 20	2 - 50	3 - 100	4 - 200"));
		infoTela.setEditable(false);
		entradaUsuario = new JTextField(20);
		
		tela.add(infoTela);
		tela.add(entradaUsuario);
		
		tecladoNumerico = new JButton[numeros.length];
		for(int i = 0; i < numeros.length; i++) {
			
			tecladoNumerico[i] = new JButton();
			tecladoNumerico[i].setText(numeros[i]);
			teclado.add(tecladoNumerico[i]);
			
		}
		
		sacaDinheiro = new JButton("Retire o dinheito aqui");
		insereEnvelope = new JButton("Insira o envelope aqui");
		
		depositoESaque.add(sacaDinheiro);
		depositoESaque.add(insereEnvelope);
		
	}
}
