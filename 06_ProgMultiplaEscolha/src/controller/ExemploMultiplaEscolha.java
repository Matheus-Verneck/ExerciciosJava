package controller;

import util.Teclado;

public class ExemploMultiplaEscolha {

	/*
	 * Programa que pergunte o nº de matrícula de sócio de um Clube e exiba o mês de
	 * pagamento da anuidade, conforme a seguinte tabela: 
	 * Nº Final da Matrícula:    Mês de Pagamento:
	 * 0    					 Janeiro 
	 * 1						 Fevereiro 
	 * 2 						 Março
	 * 3    					 Abril 
	 * Outro final 				 Maio
	 */

	public static void main(String[] args) {

		int matricula = Teclado.lerInt("Informe o número da sua matrícula: "),
			ultimo = matricula % 10;
		
		switch (ultimo) {
		case 0: 
			System.out.println("Mês de pagamento: Janeiro");
			break;
		case 1: 
			System.out.println("Mês de pagamento: Fevereiro");
			break;
		case 2: 
			System.out.println("Mês de pagamento: Março");
			break;
		case 3: 
			System.out.println("Mês de pagamento: Abril");
			break;
			
		default: 
			System.out.println("Mês de pagamento: Maio");
			
		}//fim do switch
		
		
		
		
	}//fim do main

}//fim da classe 
