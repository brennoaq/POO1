package prova1;

import java.util.Scanner;

public class vogalConsoante {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String s, maius;
		char c;
		int i, n;

		System.out.printf("Informe um caracter do alfabeto:\n");
		s = teclado.nextLine();

		n = s.length();// tamanho da string
		if(n == 1) {
			maius = ""; // string convertida em maiúsculas

			for (i=0; i<n; i++) {
				c = s.charAt(i);
				// verifica se o i-ésimo caractere é alfabético minúsculo
				if ((c >= 'a') && (c <= 'z')) {
					// converte o i-ésimo caractere no correspondente maiúsculo
					maius = maius + (char)(c - 32);
				}else {
					maius = maius + c;
				}
				// verifica se o i-ésimo caractere é alfabético maiúsculo
				System.out.printf("\nResultado:\n");
				System.out.printf(maius);
				if(c == 'A' ||c == 'E' || c == 'I'|| c == 'O'|| c == 'U') {
					System.out.println("sua letra e uma vogal !");
				}else {
					System.out.println("\n Sua letra e uma consoante ! ");
				}
			}
		}

		else{
			System.out.println("Por favor digite só um caracter !\n");
		}
	}
}
