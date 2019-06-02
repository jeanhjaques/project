public class Item{
	//atributos
	private String nomeItem;
	private double precoItem;
	private int qtdPorUnidade;
	private int codigoItem;

	//construtor
	public Item(String nomeItem, double precoItem, int qtdPorUnidade, int codigoItem){
		this.nomeItem = nomeItem;
		this.precoItem = precoItem;
		this.qtdPorUnidade = qtdPorUnidade;
		this.codigoItem = codigoItem;
	}

	//getters e setters
	public String getNomeItem(){
		return nomeItem;
	}

	public void setNomeItem(String nomeItem){
		this.nomeItem = nomeItem;
	}

	public double getPrecoItem(){
		return precoItem;
	}

	public void setPrecoItem(double precoItem){
		this.precoItem = precoItem;
	}

	public int getQtdPorUnidade(){
		return qtdPorUnidade;
	}

	public void setQtdPorUnidade(int qtdPorUnidade){
		this.qtdPorUnidade = qtdPorUnidade;
	}

	public int getCodigoItem(){
		return codigoItem;
	}

	//toString
	@Override
	public String toString(){
		return("Nome do Item: "+nomeItem+", Preço: "+precoItem+", Quantidade por unidade: "+qtdPorUnidade+", Código: "+codigoItem);
	}

	//equals e hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(precoItem);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (Double.doubleToLongBits(precoItem) != Double.doubleToLongBits(other.precoItem))
			return false;
		return true;
	}
}