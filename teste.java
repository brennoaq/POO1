package brenno;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);

		char [][] tabuleiro =  new char[3][3];//matriz tabuleiro

		//preenchendo a tabela
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro[i][j] = ' ';
			}	
		}

		char fimDeJogo = ' ';

		int r;
		char result = ' ';
		int jogadaAtual = 0;

		do {
			// fazendo sua jogada
			int linha, coluna;
			System.out.println("Digite a linha de sua jogada no tabuleiro: ");
			linha = teclado.nextInt();
			System.out.println("Digite a coluna de sua jogada no tabuleiro: ");
			coluna = teclado.nextInt();

			if (tabuleiro[linha][coluna] != ' ') {
				System.out.println("posicao invalida, tente novamente! ");
			} else { 
				// salva a jogada da pessoa
				if (jogadaAtual%2!=0) { 						
					tabuleiro [linha][coluna] = 'x';						
				} else {
					tabuleiro [linha][coluna] = 'o';
				}

				//vê se tem vencedor ! ERRO ESTA AQUI, A VARIAVEL FIMDEJOGO NUNCA SAI DE ' '...
				if (tabuleiro[linha][0] == tabuleiro[linha][1] && tabuleiro[linha][0] == tabuleiro[linha][2]) {
					result = tabuleiro[linha][0];
				}

				if (tabuleiro[0][coluna] == tabuleiro[1][coluna] && tabuleiro[0][coluna] == tabuleiro[2][coluna]) {
					result = tabuleiro[linha][0];
				}

				// diagonais
				if(tabuleiro[0][0] != ' ') {
					if(tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
						result = tabuleiro[0][0];
					}
				}

				if(tabuleiro[0][2] != ' ') {
					if(tabuleiro[0][2]== tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
						result = tabuleiro[2][0];
					}						
				}


				jogadaAtual++;
			} // Fim else (Jogada foi válida)

			fimDeJogo = result;

			//mostrar jogo no console !
			System.out.print("JOGO DA VELHA");
			System.out.println("\n-------------\n");

			int t;

			for ( t = 0; t < 3; t++) {
				System.out.println(tabuleiro[t][0]+"|"+tabuleiro[t][1]+"|"+tabuleiro[t][2]);
				if (t != 2) {
					System.out.println("------");
				}
			}
			System.out.print("\n");

			//int jogadaAtual = 0;



		} while (result == ' ');

		// Encerrando o jogo !
		if (String.valueOf(fimDeJogo).equals("x")) {
			System.out.println("Jogador com o 'X' ganhou!\n");
		} else if (String.valueOf(fimDeJogo).equals("o")){
			System.out.println("Jogador com a 'O' ganhou!\n");
		} else {
			System.out.println("Empate!");
		}

	}

}
