package exercicio2;

/**
 * 
 * @author henriquerc_18
 *
 */

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		do{
			System.out.println("Digite um número (O para encerrar): ");
			x = scan.nextInt();
			scan.nextLine();	
			System.out.println("Número: " + x);
		}while(x != 0);
		System.out.println("Programa encerrado!");
	}
	
}
