package brenno;

import java.util.Scanner;

public class calendario {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		int ano = teclado.nextInt();
		int divisao = ano%4;
		int calculo, calculo1;
		if(ano >= 1700 && ano <=2700){
			if (ano == 1918){
				if (divisao != 0){
					calculo = (256-(243-17));
					System.out.println(calculo+"/09/"+ ano + " Calendario Gregoriano");
				}else{
					calculo1 = (256-(244-17));
					System.out.println(calculo1+"/09/"+ ano + " Calendario Gregoriano");
				}
			}
			else if (ano != 1918){
				if (ano >= 1919){
					if (divisao != 0){
						calculo = (256 - 243);
						System.out.println(calculo+"/09/"+ ano + " Calendario Gregoriano");
					}else{
						calculo1 = (256-244);
						System.out.println(calculo1+"/09/"+ ano + " Calendario Gregoriano");
					}
				}else{
					if (divisao != 0){
						calculo = (256 - 243);
						System.out.println(calculo+"/09/"+ ano + " Calendario Juliano");
					}else{
						calculo1 = (256-244);
						System.out.println(calculo1+"/09/"+ ano + " Calendario Juliano");
					}
				}
			}
		}else{
			System.out.println("ano invalido digite um ano valido");
		}
	}
}

