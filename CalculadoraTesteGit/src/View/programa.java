package View;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escolha uma das op��es: \n"
				+ "1 - Soma \n"
				+ "2 - Divis�o \n"
				+ "3 - Multiplica��o \n"
				+ "4 - Subtra��o " );
		int op = teclado.nextInt();
		
		System.out.println(op);
		
		
	}

}
