package View;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escolha uma das opções: \n"
				+ "1 - Soma \n"
				+ "2 - Divisão \n"
				+ "3 - Multiplicação \n"
				+ "4 - Subtração " );
		int op = teclado.nextInt();
		
		System.out.println(op);
		
		
	}

}
