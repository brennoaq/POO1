package prova1;

import java.util.Scanner;

public class consumoEletricidade {

	public static void main(String[] args) {

		double fatura;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite as unidades de eletricidade consumidas: ");
		int uConsumida = teclado.nextInt();

		if (uConsumida > 0 && uConsumida <= 50) {
			fatura = (uConsumida*0.50);
			System.out.println("o valor a ser pago da sua fatura é de: "+" R$: "+ (fatura+(fatura*0.2))+"0");
		}
		else if (uConsumida > 50 && uConsumida <= 100) {
			fatura = (uConsumida*0.75);
			System.out.println("o valor a ser pago da sua fatura é de: "+" R$: "+ (fatura+(fatura*0.2))+"0");
		}
		else if (uConsumida > 100 && uConsumida <= 250) {
			fatura = (uConsumida*1.20);
			System.out.println("o valor a ser pago da sua fatura é de: "+" R$: "+ (fatura+(fatura*0.2))+"0");
		}
		else {
			fatura =(uConsumida*1.50);
			System.out.println("o valor a ser pago da sua fatura é de: " +" R$: "+ (fatura+(fatura*0.2))+"0");
		}
	}
}
