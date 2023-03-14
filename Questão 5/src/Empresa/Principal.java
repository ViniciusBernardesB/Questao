package Empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma Palavra:");
		String opcao = teclado.next();
		String Palavra = "";
		for(int i = opcao.length() - 1; i>=0; i--) {
			Palavra = Palavra + Character.toString(opcao.charAt(i));
		}
		System.out.println(Palavra);
	}
	

}
