package controller;

import util.Teclado;

public class Questao06 {

	/*
	 * Fazer um programa que pergunte uma temperatura ao usuário, em graus
	 * Fahrenheit, e apresente esta temperatura convertida em graus Celsius. A
	 * fórmula da conversão é c = (f– 32) x 5 : 9 , onde c é a temperatura em graus
	 * Celsius e f em Fahrenheit.
	 */

	public static void main(String[] args) {

		double tempF = Teclado.lerDouble("Informe uma temperatura em graus Fahrenheit: "),
				tempC = (tempF - 32) * 5 / 9;
		
		System.out.println("A temperatura informada convertida para graus Celsius é: " + tempC);
		
		
	}// fim do main

}// fim da clase
