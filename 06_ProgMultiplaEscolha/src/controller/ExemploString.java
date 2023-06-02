package controller;

import util.Teclado;

public class ExemploString {

	public static void main(String[] args) {

		String estado = Teclado.lerTexto("Informe a sigla de um estado brasileiro: ");
		
		estado = estado.toLowerCase();//converter para minúsculo
		switch (estado) {
		case "rj":
			System.out.println("Rio de Janeiro");
			break;
		
		default:
			System.out.println("Não é Rio de Janeiro");
		}//fim do switch
		
	}//fim do main

}//fim da classe
