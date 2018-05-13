package brenno;

import java.util.Scanner;

public class numeroRomano {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com o numero decimal de ate 3 digitos para converter em romanos: ");
		int numero = teclado.nextInt();

		ConversaoRomano(numero);

	}

	public static void ConversaoRomano(int num) {

		int[] decimal = {1, 5, 10, 50, 100, 500, 1000};
		String[] romano = {"I", "V", "X", "L", "C", "D", "M"};
		String numeroRomano="";
		if (num < 1000) {
			for (int i = 6; i >= 0; i--) {
				while (num >= decimal[i]) {
					numeroRomano= numeroRomano.concat(romano[i]);
					num -= decimal[i];
				}

			}

			System.out.println(numeroRomano);
		}

	}
}
