package controller;

import util.Teclado;

public class Exemplo2 {
	
	/*
	 * Fazer um programa que peça ao usuário para comprar uma coxinha e um 
	 * risole na cantina. Informar se ele atendeu corretamente o pedido.
	 */

	public static void main(String[] args) {
		
		String coxinha, risole;
		
		coxinha = Teclado.lerTexto("Trouxe coxinha? (s ou n)");
		risole = Teclado.lerTexto("Trouxe risole? (s ou n)");
		
		if (  coxinha.equals("s") && risole.equals("s") ) {
			System.out.println("OBAAA! Tem salgadinho!");
		} else {
			System.out.println("Poutz, vou ficar com fome");
		}
		

	}

}
