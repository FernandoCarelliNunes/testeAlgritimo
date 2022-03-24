package testeAlgritimo;








import javax.swing.JOptionPane;


public class teste {

	public static void main(String[] args) {
		
		
	float media;
	

	
	
	
	
	float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Primeira Nota :"));
	float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Segunda Nota :"));
	float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Terceira Nota :"));
	float nota4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Quarta Nota :"));
	
	System.out.println("Digite a Primeira nota : ");
	
	
	media = (nota1 + nota2+ nota3 + nota4)/4;
	
	System.out.println(media);
	
	JOptionPane.showMessageDialog(null,"A Media Final é : " + media);
	
		
		
	}
}