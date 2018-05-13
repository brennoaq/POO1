package brenno;

import java.util.Scanner;

public class circo {

	public static void main(String[] args) {

		int localizacaoX, localizacaoY, distF;
		double distX, distY, calculo, calculo1;
		Scanner captura = new Scanner(System.in);

		System.out.println("Digite a localizacao do 1°canguru: ");
		localizacaoX = captura.nextInt();

		System.out.println("Digite a distancia do salto em metros do 1°canguru: ");
		distX = captura.nextDouble();

		System.out.println("Digite a localizacao do 2°canguru: ");
		localizacaoY = captura.nextInt();

		System.out.println("Digite a distancia do salto em metros do 2°canguru: ");
		distY = captura.nextDouble();

		System.out.println("Digite a distancia final ao qual os dois cangurus devem chegar: ");
		distF = captura.nextInt();

		if (distF > 0 ){
			if (localizacaoX < distF && localizacaoY < distF){
				calculo = distX*distF;
				calculo1 = distY*distF;
				if(calculo == localizacaoX && calculo1 == localizacaoY && calculo == calculo1){
					System.out.println("Sim, os cangurus chegaram juntos");
				}else{
					System.out.println("Nao, os cangurus nao chegaram juntos");
				}
			}
			else{
				System.out.println("os cangurus nao sairam do lugar");
			}
		}
	}
}
