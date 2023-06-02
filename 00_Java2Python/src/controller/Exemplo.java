package controller;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		console.useLocale(Locale.ENGLISH);
		
		String nome; // %s
		int idade; // %d
		double salario; // %f, %.2f
		
		System.out.println("Qual o seu nome?");
		nome = console.nextLine();
		
		System.out.println("Qual a sua idade?");
		idade = console.nextInt();
		
		System.out.println("Qual o salário pretendido?");
		salario = console.nextDouble();
		
		System.out.printf("Nome: %s, Idade: %d, Salário: %.2f", nome, idade, salario);
		
		console.close();
				
	}//fim do main

}//fim da classe
