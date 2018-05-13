package prova1;

import java.util.Scanner;

public class tempoData {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero de dias: ");
		int dias = teclado.nextInt();

		int ano = dias/365;
		int semana = (dias%365)/7;
		int dia =(dias%365)/7;

		System.out.println((ano>1?ano +"anos" :ano +"ano")+" , "+(semana>1?semana +"semanas": semana +"semana")+" e "+(dia>1?dia +"dias": dia+"dia"));
	}

}
