package br.com.generation.Javacina;

public class Pessoa {

	protected int idade;
	protected String nome;
	protected int presen�adeComorbidade;
	private int complicav;

	public int getidade() {
		return idade;
	}

	public void setidade(int idade) {
		this.idade = idade;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public int getpresen�adeComorbidade() {
		return presen�adeComorbidade;
	}

	public void setpresen�adeComorbidade(int presen�adeComorbidade) {
		this.presen�adeComorbidade = presen�adeComorbidade;
	}

	public int getComplicavacia() {
		return complicav;
	}

	public void setComplicavacia(int complicav) {
		this.complicav = complicav;

		if (complicav == 1 || complicav==2) {
			System.out.println("Voce tem algum laudo medico confirmando a sua possibilidade de se vacinar?"+"\n"+"1-Sim"+"\n"+"2-N�o");
		}

	}

}
