package controller;

import util.Teclado;

public class Questao08 {

	/*
	 * Fazer um programa que calcule e apresente a quantidade de litros que um
	 * automóvel gastará em uma viagem. O programa deve coletar as seguintes
	 * informações: Distância a percorrer na viagem, em quilômetros; qual é o valor
	 * do consumo médio do automóvel, em quilômetros por litro.
	 */

	public static void main(String[] args) {

		double distancia = Teclado.lerDouble("Qual será a distancia (em Km) da sua viagem? "), 
				consumoMedio = Teclado.lerDouble("Qual é o consumo médio que seu veículo gasta (Km por L)? "), 
				litroGasto = distancia / consumoMedio;
		
System.out.println("A quantidade de litros de combustível gastos nessa viagem foi de: " + litroGasto + "L");
		
	}// fim do main

}// fim da classe
