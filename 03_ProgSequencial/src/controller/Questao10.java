package controller;

import util.Teclado;

public class Questao10 {

	/*
	 * Fazer um algoritmo que efetue o cálculo do valor de uma prestação em atraso,
	 * utilizando a fórmula 
	 * prestação em atraso = valor + (valor x (taxa : 100) x tempo em dias).
	 */

	public static void main(String[] args) {

		double valor = Teclado.lerDouble("Qual é o valor normal da prestação? "),
			taxa = Teclado.lerDouble("Qual é o valor da taxa (em %) cobrada por atraso? "),
			dias = Teclado.lerDouble("Quantos dias a prestação está atrasada? "),
			prestacao = valor + (valor * (taxa / 100)* dias);
		
	 System.out.println("Analisando as informações passadas, "
	+ "o valor em real que deverá ser pago perante às prestações atrasadas é de R$" + prestacao);
		
	}//fim do main

}//fim da classe
