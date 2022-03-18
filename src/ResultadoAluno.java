import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
		
		double nota1 = Double.parseDouble(JOptionPane
				.showInputDialog(null,
						"Digite a primeira nota:"));
		double nota2 = Double.parseDouble(JOptionPane
				.showInputDialog(null,
						"Digite a segunda nota:"));
		double nota3 = Double.parseDouble(JOptionPane
				.showInputDialog(null,
						"Digite a terceira nota:"));
		
		double media = (nota1 + nota2 + nota3)/3;
		
		if (media >= 6.0) {
			JOptionPane.showMessageDialog(null,
					"Aprovado com média:" + media);
		}else if (media <= 6.0) {
			JOptionPane.showMessageDialog(null,
					"Reprovado com média: " + media);
		}
		
	}

}
