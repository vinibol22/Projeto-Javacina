package br.com.generation.Javacina;


public class PessoacomComorbidade extends Pessoa {

	protected int comorbidade;
	

	public int getcomorbidade() {
		return comorbidade;
	}

	public void setcomorbidade(int comorbidade) {
		
		this.comorbidade = comorbidade;
		if(this.comorbidade ==1||this.comorbidade==2||this.comorbidade==3||this.comorbidade==4) {
			System.out.println("Voc� faz parte do grupo de risco, A vacina ser� entre amanh� at� o dia 20 deste mes");
			
		}

		
	}}