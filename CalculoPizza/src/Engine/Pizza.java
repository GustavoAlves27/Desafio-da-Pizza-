package Engine;

public class Pizza {
	
	private Pizza[] pizza = new Pizza[7];
	private String nome;
	private int tamanho;
	private float preco;
	private int diametro;
	private int raio;
	private Calculo calculo;
	
	
	

	/**
	 * @param nome
	 * @param tamanho
	 * @param preco
	 * @param diametro
	 * @param raio
	 * @param calculo
	 */
	public Pizza (String nome, int tamanho, float preco, int diametro, int raio, Calculo calculo) {
		
		setNome(nome);
		setPreco(preco);
		setDiametro(diametro);
		setCalculo(calculo);
		setRaio(raio);
		setTamanho(tamanho);
	}

	/**
	 * @return the nomes
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nomes the nomes to set
	 */
	public void setNome(String nomes) {

		this.nome = nome;
	}

	/**
	 * @return the tamanhos
	 */
	public int getTamanho() {
		return tamanho;
	}

	/**
	 * @param tamanhos the tamanhos to set
	 */
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	/**
	 * @return the precos
	 */
	public float getPreco() {
		return preco;
	}

	/**
	 * @param precos the precos to set
	 */
	public void setPreco(float preco) {
		this.preco = preco;
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

	/**
	 * @return the raio
	 */
	public int getRaio() {
		return raio;
	}

	/**
	 * @param raio the raio to set
	 */
	public void setRaio(int raio) {
		this.raio = raio;
	}

	/**
	 * @return the calculo
	 */
	public Calculo getCalculo() {
		return calculo;
	}

	/**
	 * @param calculo the calculo to set
	 */
	public void setCalculo(Calculo calculo) {
		this.calculo = calculo;
	}
	
}
