package controller;

import util.Teclado;

public class Questao06 {

	/*
	 * Desenvolver um programa que pergunte o peso de uma pessoa e também pergunte o
	 * código do planeta no qual ela gostaria de obter como resposta o valor do seu
	 * peso neste referido planeta. As informações da tabela abaixo (somente as
	 * colunas Código e Planeta) devem aparecer como menu de escolha ao usuário:
	 * Código      Planeta      Gravidade Relativa 
	 *  1          Mercúrio        0,37 
	 *  2          Vênus           0,88 
	 *  3          Marte           0,38  
	 *  4          Júpiter         2,64 
	 *  5          Saturno         1,15 
	 *  6          Urano           1,17 
	 * Para calcular o peso no planeta escolhido, utilize a fórmula: 
	 * pesoNoPlaneta = (pesoNaTerra/10) * gravidadeRelativa. 
	 * Caso o usuário digite um código que não esteja na tabela, informar que o código inserido está errado.
	 */

	public static void main(String[] args) {
		
		System.out.println("Para saber seu peso convertido para um desses planetas, observe a tabela abaixo: \n");
		System.out.println("   CÓDIGO - PLANETA");
		System.out.println("	1 - Mercúrio");
		System.out.println("	2 - Vênus");
		System.out.println("	3 - Marte");
		System.out.println("	4 - Júpiter");
		System.out.println("	5 - Saturno");
		System.out.println("	6 - Urano \n");
		
		int codigo = Teclado.lerInt("Informe o código do planeta desejado: ");
		double pesoNoPlaneta, 
		pesoNaTerra = Teclado.lerDouble("Informe seu peso: "), 
		gravidadeRelativa = 1;
		boolean erro = false;
		
		switch (codigo) {
		case 1:
			gravidadeRelativa = 0.37;
			break;
		case 2: 
			gravidadeRelativa = 0.88;
			break;
		case 3: 
			gravidadeRelativa = 0.38;
			break;
		case 4: 
			gravidadeRelativa = 2.64;
			break;
		case 5: 
			gravidadeRelativa = 1.15;
			break;
		case 6: 
			gravidadeRelativa = 1.17;
			break;	
			
		default: 
			erro = true;
                                            		}//fim do switch
		
		if (erro == false) {
			pesoNoPlaneta = (pesoNaTerra/10) * gravidadeRelativa;
			System.out.println("Seu peso no planeta escolhido é " + pesoNoPlaneta);
		} else {
			System.out.println("Código invalido");
		}//fim do iff...else
		
	}//fim do main

}//fim da classe 
