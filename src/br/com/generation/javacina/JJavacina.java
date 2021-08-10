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
				System.out.println("\nDigite o número caso tenha alguma dessas comorbidades : ");
				System.out.println();
				System.out.println("1-Obesidade grau 3" + "\n" + "2-Diabetes" + "\n" + "3-Doença do coração " + "\n"
						+ "4-Doença respiratória " + "\n" + "5-Caso tenha nehuma dessa opções \n");
				p.setpresençadeComorbidade(entrada.nextInt());

				while (p.getpresençadeComorbidade() < 1 || p.getpresençadeComorbidade() >=6 ) {
					System.out.println("Comorbidade incorreta ");
					System.out.println("Digite novamente");
					p.setpresençadeComorbidade(entrada.nextInt());
				}

				if (p.getpresençadeComorbidade() == 1 || p.getpresençadeComorbidade() == 2 || p.getpresençadeComorbidade() == 3
						|| p.getpresençadeComorbidade() == 4) {
					PessoacomComorbidade pc = new PessoacomComorbidade();

					pc.setnome(p.getnome());
					pc.setidade(p.getidade());

					System.out.println("Nome: " + pc.getnome());
					System.out.println("Idade: " + pc.getidade());
					pc.setcomorbidade(p.getpresençadeComorbidade());

				}  else if (p.getpresençadeComorbidade() == 5) {
					System.out.println("Digite o número respectivo de sua complicação médica");
					System.out.println();
					System.out.println("1-Voce toma algum remédio anticoagulante "+"\n"+"2-Voce tem alergia a algum componente da vacina"+"\n"+"3-nehuma das opções ");
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
							System.out.println("infelizmente voce não poderá se vacinar");
						}
					
					
				}
				entrada.close();
			}

		}