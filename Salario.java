
package brenno;

import javax.swing.JOptionPane;

public class Salario {

	public static void main(String[] args) {

		double valorShr = 15, numeroht, soma;
		double salarioLiquido;
		double desconto = 0.2;
		
		numeroht = Integer.parseInt(JOptionPane.showInputDialog("quantas horas você trabalha por dia ?"));
		
		soma = (numeroht * valorShr);
		salarioLiquido = soma - (soma*desconto);
		JOptionPane.showMessageDialog(null, "O meu salario liquido é " +salarioLiquido);
		
	}

}
