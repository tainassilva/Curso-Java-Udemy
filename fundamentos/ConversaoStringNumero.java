package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número: ");
		
		// Aqui está apenas fazendo a concatenação de string
		System.out.println(valor1 + valor2);
		
		// Criando uma variável para converter a string para double. Se colocar letras vai dar erro
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma é =" + soma);
		System.out.println("Média é ="+ soma/2);
		
		
				
		
	}
 
}
