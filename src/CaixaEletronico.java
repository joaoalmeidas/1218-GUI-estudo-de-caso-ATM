import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CaixaEletronico extends JFrame {

	private JPanel tela;
	private JPanel teclado;
	private JPanel depositoESaque;
	
	private JTextArea infoTela;
	private JLabel labelEntradaUsuario;
	private JTextField entradaUsuario;
	
	private JButton[] tecladoNumerico;
	private static final String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "<-", "Enter"};
	
	private JButton sacaDinheiro;
	private JButton insereEnvelope;
	
	
}
