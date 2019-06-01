public class Estabelecimento{
  //atributos
  private String nomeEstabelecimento;
  private String descricaoEstabelecimento;
  private String horarioAbertura;
  private String horarioEncerramento;
  private Endereco endereco;
  private Cardapio cardapio;
  
  //construtor
  public Estabelecimento(String nomeEstabelecimento,String descricaoEstabelecimento, String horarioAbertura,
                         String horarioEncerramento, Endereco endereco, Cardapio cardapio){
    this.nomeEstabelecimento = nomeEstabelecimento;
    this.descricaoEstabelecimento = descricaoEstabelecimento;
    this.horarioAbertura = horarioAbertura;
    this.horarioEncerramento = horarioEncerramento;
    this.endereco = endereco;
    this.cardapio = cardapio;
  }

  //getters e setters
  public String getNomeEstabelecimento(){
  	return nomeEstabelecimento;
  }

  public void setNomeEstabelecimento(String nomeEstabelecimento){
  	this.nomeEstabelecimento = nomeEstabelecimento;
  }

  public String getDescricaoEstabelecimento(){
  	return descricaoEstabelecimento;
  }

  public void setDescricaoEstabelecimento(String descricaoEstabelecimento){
  	this.descricaoEstabelecimento = descricaoEstabelecimento;
  }

  public String getHorarioAbertura(){
  	return horarioAbertura;
  }

  public void setHorarioAbertura(String horarioAbertura){
  	this.horarioAbertura = horarioAbertura;
  }

  public String getHorarioEncerramento(){
  	return horarioEncerramento;
  }

  public void setHorarioEncerramento(String horarioEncerramento){
  	this.horarioEncerramento = horarioEncerramento;
  }

  public Endereco getEndereco(){
  	return endereco;
  }

  public void setEndereco(Endereco endereco){
  	this.endereco = endereco;
  }

  public Cardapio getCardapio(){
  	return cardapio;
  }

  public void setCardapio(Cardapio cardapio){
  	this.cardapio = cardapio;
  }

  //toString
  @Override
  public String toString(){
  	return ("nomeEstabelecimento: "+nomeEstabelecimento+"/n descricaoEstabelecimento: "+descricaoEstabelecimento+"/n horarioAbertura: "+
  			horarioAbertura+"/n horarioEncerramento: "+horarioEncerramento+"/n endereco: "+endereco+"cardapio: "+cardapio);
  }
}
