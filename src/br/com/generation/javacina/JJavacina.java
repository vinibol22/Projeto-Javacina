package br.com.generation.javacina;

import java.util.Scanner;


public class JJavacina {

	public static void main(String[] args) {

				int laudov=0;
				Scanner entrada = new Scanner(System.in);

				Pessoa p = new Pessoa();
				TratamentosDeErros trataerro=new TratamentosDeErros();

				System.out.println("Por favor insira seu nome");
				p.setnome(entrada.nextLine());
				trataerro.nomeIncorreto(p.getnome());

				System.out.println("Digite sua idade :");
				p.setidade(entrada.nextInt());
				trataerro.idadeIncorreta(p.getidade());


				if(p.getidade()>=80) {

						PessoassemComorbidade ps = new PessoassemComorbidade();
						ps.setnome(p.getnome());
						ps.setidade(p.getidade());

						System.out.println("Nome: " + ps.getnome());
						System.out.println("Idade: \n" + ps.getidade());
						ps.setData(ps.getidade());
						return;

					}
					if(p.getidade()<18) {

					PessoassemComorbidade ps = new PessoassemComorbidade();
					ps.setnome(p.getnome());
					ps.setidade(p.getidade());

					System.out.println("Nome: " + ps.getnome());
					System.out.println("Idade: " + ps.getidade());
					ps.setData(ps.getidade());
						return;
									}

				System.out.println("--------------------------------------------------------");	
				System.out.println("\nDigite o n�mero caso tenha alguma dessas comorbidades : ");
				System.out.println();
				System.out.println("1-Obesidade grau 3" + "\n" + "2-Diabetes" + "\n" + "3-Doen�a do cora��o " + "\n"
						+ "4-Doen�a respirat�ria " + "\n" + "5-Caso tenha nehuma dessa op��es \n");
				p.setpresen�adeComorbidade(entrada.nextInt());

				while (p.getpresen�adeComorbidade() < 1 || p.getpresen�adeComorbidade() >=6 ) {
					System.out.println("Comorbidade incorreta ");
					System.out.println("Digite novamente");
					p.setpresen�adeComorbidade(entrada.nextInt());
				}

				if (p.getpresen�adeComorbidade() == 1 || p.getpresen�adeComorbidade() == 2 || p.getpresen�adeComorbidade() == 3
						|| p.getpresen�adeComorbidade() == 4) {
					PessoacomComorbidade pc = new PessoacomComorbidade();

					pc.setnome(p.getnome());
					pc.setidade(p.getidade());

					System.out.println("Nome: " + pc.getnome());
					System.out.println("Idade: " + pc.getidade());
					pc.setcomorbidade(p.getpresen�adeComorbidade());

				}  else if (p.getpresen�adeComorbidade() == 5) {
					System.out.println("Digite o n�mero respectivo de sua complica��o m�dica");
					System.out.println();
					System.out.println("1-Voce toma algum rem�dio anticoagulante "+"\n"+"2-Voce tem alergia a algum componente da vacina"+"\n"+"3-nehuma das op��es ");
						p.setComplicavacia(entrada.nextInt());
				if (p.getComplicavacia() == 3) {
						PessoassemComorbidade ps = new PessoassemComorbidade();
						ps.setnome(p.getnome());
						ps.setidade(p.getidade());

						System.out.println("Nome: " + ps.getnome());
						System.out.println("Idade: " + ps.getidade());
						ps.setData(ps.getidade());
					}
						
						
					
				
					laudov=entrada.nextInt();
						if(laudov==2) {
							System.out.println("infelizmente voce n�o poder� se vacinar");
						}
					
					
				}
				entrada.close();
			}

		}