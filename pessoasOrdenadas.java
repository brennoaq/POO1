package brenno;

import java.util.Scanner;


public class pessoasOrdenadas {

	public static void main(String[] args) {
		armazenando();
		ordenando();

	}

	public static void armazenando() {

		Scanner teclado = new Scanner(System.in);

		String[] nome = new String[10];
		int[] idade = new int[10];

		System.out.println("Digite os nomes: ");
		String nomeEmIngles = teclado.nextLine();

		System.out.println("Digite a idade em numeros: ");
		int idadeEmIngles = teclado.nextInt();

		for (int i = 0; i < 10; i++) {

			nome[i] = nomeEmIngles;
			nome[i].toLowerCase();

			idade[i] = idadeEmIngles;

		}

	}

	public static void ordenando() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite os nomes: ");
		String nomeEmIngles = teclado.nextLine();

		System.out.println("Digite a idade em numeros: ");
		int idadeEmIngles = teclado.nextInt();

		String[][] nomeIdade = new String[2][10];

		for (int i = 0; i < 10; i++) {

			nomeIdade[0][i] = nomeEmIngles;
			nomeIdade[0][i].toLowerCase();

			nomeIdade[1][i] = "" + idadeEmIngles;

			System.out.println("Nome: " + nomeIdade[0][i] + " Idade: " + nomeIdade[1][i]);
		}
	}

}
