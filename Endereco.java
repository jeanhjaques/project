public class Endereco {
	//atributos
	String cep;
	String bairro;
	String numero;
	String rua;
	
	//construtor
	public Endereco(String cep, String bairro, String numero, String rua) {
		super();
		this.cep = cep;
		this.bairro = bairro;
		this.numero = numero;
		this.rua = rua;
	}
	
	//getters e setters
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	
	//toString
	@Override
	public String toString() {
		return rua + ", " + numero + ", " +bairro+ ", " +cep;
	}
}