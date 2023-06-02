package controller;

import util.Teclado;

public class Questao02 {

	/*
	 * Desenvolver um programa que pergunte o sexo da pessoa e dê como resposta a
	 * seguinte orientação de acordo com o sexo informado: “Banheiro masculino à
	 * direita” ou “Banheiro feminino à esquerda”.
	 */

	public static void main(String[] args) {

		String sexo = Teclado.lerTexto("Informe seu sexo: (m ou f)");

		sexo = sexo.toLowerCase().trim();//converter para minusculo / tirar espaço
				
		
		switch (sexo) {
		case "m":
			System.out.println("Banheiro masculino à direita");
			break;
		case "f":
			System.out.println("Banheiro feminino à esquerda");
			break;
		
		default:
			System.out.println("Opção não identificada");
			
		}// fim do switch

	}// fim do main

}// fim da classe
