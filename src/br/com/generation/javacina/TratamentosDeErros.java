package br.com.generation.javacina;

import java.util.Scanner;

public class TratamentosDeErros extends JJavacina {



		Pessoa p = new Pessoa();	

		Scanner entrada=new Scanner(System.in);
	public void nomeIncorreto(String nome) {
		while(nome.length()<=2 || nome.length()>=30) {
			System.out.println("Nome incorreto ");
			System.out.println("Digite novamente");


			}
	}

		public void idadeIncorreta(int idade) {
			while(idade<0 ||idade>130) {

				idade=entrada.nextInt();

				}
					}







}

