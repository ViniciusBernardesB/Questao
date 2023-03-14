package Empresa;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		/*Bom Primeiro eu não intendi muito bem a questão, então eu fiz esses dois código:
		 * 
		 * 1* O Primeiro Calcula o Valor que o usuário digitou Para Fibonacci.
		 * 2* O segundo Ver Se o numero inserido está na sequencia da Fibonacci.   
		 */
		Scanner teclado = new Scanner(System.in);

		int Soma = 0;
		int Anterior = 0;
		int Proximo = 1;
		
		System.out.println("Digite Um Numero Inteiro Para Calcular a Fibonacci: ");
		int opcao = teclado.nextInt();
		
		for(int i = 0; i < opcao; i++) {
			Soma = Anterior + Proximo;
			Anterior = Proximo;
			Proximo = Soma;
		}
		System.out.println("O Numero: " + opcao + " Tem A Fibonacci: " + Anterior);
		
		System.out.println("");
		System.out.println("-----2* Segundo Código-----");
		System.out.println("");
		
		System.out.println("Digite Um Numero Para Saber Se Ele Esta Na Sequencia Da Fibonacci: ");
		int opcao2 = teclado.nextInt();
		
		/*Lista de numeros da Fibonacci, não esta completa*/
		ArrayList<Integer> Lista = new ArrayList<>();
		Lista.add(0);
		Lista.add(1);
		Lista.add(1);
		Lista.add(2);
		Lista.add(3);
		Lista.add(5);
		Lista.add(8);
		Lista.add(13);
		Lista.add(21);
		Lista.add(34);
		Lista.add(55);
		Lista.add(89);
		Lista.add(144);
		Lista.add(233);
		Lista.add(377);
		Lista.add(610);
		Lista.add(987);
		Lista.add(1597);
		Lista.add(2584);
		
		if(Lista.contains(opcao2)) {
			System.out.println("Pertence A Fibonacci");
		}else {
			System.out.println("Não Pertence A Fibonacci");
		}
		
		
		
		
		
		
	}
}
