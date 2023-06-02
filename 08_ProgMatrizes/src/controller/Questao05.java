package controller;

import util.Teclado;

public class Questao05 {

	/*
	 * Desenvolver um programa que crie uma matriz de 4 linhas e 4 colunas. Pergunte
	 * ao usuário nomes de pessoas para preencher toda a matriz. Em seguida o
	 * programa perguntará ao usuário as coordenadas (linha e coluna) que deseja
	 * visualizar o conteúdo correspondente na matriz. Enquanto o usuário informar
	 * coordenadas válidas, o programa exibirá o conteúdo correspondente. No momento
	 * em que forem inseridas coordenadas não válidas o programa será encerrado com
	 * a mensagem na tela “Coordenadas inválidas”.9
	 */

	public static void main(String[] args) {

		String mat[][] = new String[4][4];
		int linha, coluna;
		boolean valido = true;
		
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				mat[linha][coluna] = Teclado.lerTexto("Infomrme um nome para mat[" + linha + "][" + coluna + "]");
			}//fim do for coluna
		}//fim do for linha
		
		System.out.println("\n--- COORDENADAS ---\n");
		
		do {
			linha = Teclado.lerInt("Informe qual linha você quer ver (0 a 3): ");
			coluna = Teclado.lerInt("Informe qual coluna você quer ver (0 a 3): ");
			
			if ((linha >= 4) || (coluna >= 4)) {
				System.out.println("COORDENADAS INVÁLIDAS");
				valido = false;
			} else {
				System.out.println("Valor em mat[" + linha + "][" + coluna + "] " + mat[linha][coluna]);
			}//fim do if...else
		} while (valido);
				
	}//fim do main

}//fim da classe
