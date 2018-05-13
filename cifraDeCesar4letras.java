package prova1;

import java.util.Scanner;

public class cifraDeCesar4letras {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua palavra de no maximo 4 letras: ");
		String palavra = teclado.next();

		if (palavra.length() > 0 && palavra.length() <= 4) {

			System.out.println("informe o valor de rotacao: ");
			int rotacao = teclado.nextInt();

			String alfabeto = "abcdefghijklmnopqrstuvwxyz";
			String abc1, abc2, nPalavra,nAlfabeto;
			char letra, letra1, letra2, letra3;

			abc1 = alfabeto.substring(0,rotacao);
			abc2 = alfabeto.replace(abc1,"");
			nAlfabeto= abc2.concat(abc1);
			letra  = nAlfabeto.charAt(alfabeto.indexOf(palavra.substring(0, 1)));
			letra1 = nAlfabeto.charAt(alfabeto.indexOf(palavra.substring(1, 2)));
			letra2 = nAlfabeto.charAt(alfabeto.indexOf(palavra.substring(2, 3)));
			letra3 = nAlfabeto.charAt(alfabeto.indexOf(palavra.substring(3, 4)));

			String l = Character.toString(letra);
			String l1 = Character.toString(letra1);
			String l2 = Character.toString(letra2);
			String l3 = Character.toString(letra3);

			nPalavra = l+l1+l2+l3;
			System.out.println("Sua palavra criptografada é: ");
			System.out.print(nPalavra);
		}
		else {
			System.out.println("insira uma palavra com 4 letras por favor ! ");
		}

	}
}

