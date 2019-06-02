public class Bebida extends Item{
	//atributos
	private String marcaBebida;
	private String teorAlcoolico;
	
	//construtor
	public Bebida(String nomeItem, double precoItem, int qtdPorUnidade, int codigoItem, String marcaBebida,
			String teorAlcoolico) {
		super(nomeItem, precoItem, qtdPorUnidade, codigoItem);
		this.marcaBebida = marcaBebida;
		this.teorAlcoolico = teorAlcoolico;
	}
	
	//getters e setters
	public String getMarcaBebida() {
		return marcaBebida;
	}

	public void setMarcaBebida(String marcaBebida) {
		this.marcaBebida = marcaBebida;
	}

	public String getTeorAlcoolico() {
		return teorAlcoolico;
	}
	public void setTeorAlcoolico(String teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	//toString
	@Override
	public String toString() {
		return "Nome: "+ this.getNomeItem()+", Preco: "+this.getPrecoItem()+", Quantidade Por Unidade: "+this.getQtdPorUnidade()+", Código: "+this.getCodigoItem()+
		", Marca: " + marcaBebida + ", teorAlcoolico: " + teorAlcoolico;
	}
}