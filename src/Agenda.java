import javax.swing.JOptionPane;

public class Agenda {

	public static void main(String[] args) {
		
		String nome = JOptionPane
			.showInputDialog(null,"Nome:");
		String email = JOptionPane
			.showInputDialog(null,"Email:"); 
		String telefone = JOptionPane
			.showInputDialog(null,"Telefone:");
		
		String dados = "Nome: " + nome + "\n" +  
				"Email: " + email + "\n" +
				"Telefone: " + telefone;
		
		JOptionPane
			.showMessageDialog(null, dados);
	}

}
