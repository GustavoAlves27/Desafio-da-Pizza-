package Engine;

public class Calculo {
	/*
	 * Entradas: 1. Nome comercial (broto, baby, pequena, m�dia, grande, exagerada,
	 * gigante, etc), o tamanho da pizza (di�metro em cent�metros) e respectivo
	 * pre�o. O software dever� aceitar tantas entradas quanto o usu�rio deseja
	 * comparar, desde que n�o haja tamanhos duplicados.
	 */

	private String nome;
	private int tamanho;
	private float preco;
	private int diametro;
	
	//Construtor
	
	public Calculo(String nome, int tamanho, float preco) {
		setNome(nome);
		setPreco(preco);
		setTamanho(tamanho);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	/**
	 * @return the diametro
	 */
	public int getDiametro() {
		return diametro;
	}

	/**
	 * @param diametro the diametro to set
	 */
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	

//   Worker

	public int CalculoC(int tamanho, int calcCircuferencia, int raio) {
		
		calcCircuferencia =(int)  Math.PI * (raio * raio);
		
		return calcCircuferencia;
	}

}

