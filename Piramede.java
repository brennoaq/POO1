package brenno;

import java.util.Scanner;

public class Piramede {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero de linhas da piramide: ");
		int numero = teclado.nextInt();

		visuPiramede(numero);
	}
	//-----
	public static void visuPiramede(int num) {
		for(int i = 0; i <= num; i++){
			for (int j = 0; j <= i; j++) {
				System.out.print(i<9? "0"+i:i);
			}
			System.out.print("\n");
		}
	}
}

