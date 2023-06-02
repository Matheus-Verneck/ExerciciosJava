package controller;

import util.Teclado;

public class Exemplo01 {
	
	/*
	 * Elaborar um pograma que pergunte ao usuário o seu nome, as suas duas notas
	 * e apresente como resultado um relatório com o seu nome, suas notas e sua média.
	 */

	public static void main(String[] args) {
		
		//Declaração de variáveis
		String nome;
		double nota1, nota2, media;
		
		//Entrada de dados
		//perguntar o nome do usuário
		nome = Teclado.lerTexto("Informe o seu nome:");
		
		//perguntar as duas notas
		nota1 = Teclado.lerDouble("Insira a nota 1:");
		nota2 = Teclado.lerDouble("Insira a nota 2:");
		
		//Processamento de dados
		media = (nota1 + nota2) / 2;
		
		//Saída de dados
		System.out.println("Nome: " + nome);
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + media);

	}

}
