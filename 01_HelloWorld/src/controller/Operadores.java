package controller;

public class Operadores {
	
	public static void main(String[] args) {
		
		int n1, n2, n3 = 10, n4, soma, sub, mult, div;
		boolean casado;
		
		n1 = 5;
		n2 = 8;
		n4 = 7;
		
		soma = n1 + n2 + n3 + n4;
		sub = n1 - n2;
		mult = n1 * n3;
		div = n2 / n1;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + sub);
		System.out.println("Multiplicação: " + mult);
		System.out.println("Divisão: " + div);
		
		casado = true;
		System.out.println("Casado: " + casado);
		casado = 5 < 3;
		System.out.println("Casado: " + casado);
	
	}

}
