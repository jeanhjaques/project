public class Estabelecimento{
  //atributos
  private String nomeEstabelecimento;
  private String descricaoEstabelecimento;
  private String horarioAbertura;
  private String horarioEncerramento;
<<<<<<< HEAD
  private int codigoEstabelecimento;
=======
>>>>>>> 4d9278b1de260d9d54e3f63af61c355a116f83bd
  private Endereco endereco;
  private Cardapio cardapio;
  
  //construtor
  public Estabelecimento(String nomeEstabelecimento,String descricaoEstabelecimento, String horarioAbertura,
<<<<<<< HEAD
                         String horarioEncerramento, Endereco endereco, Cardapio cardapio, int codigoEstabelecimento){
=======
                         String horarioEncerramento, Endereco endereco, Cardapio cardapio){
>>>>>>> 4d9278b1de260d9d54e3f63af61c355a116f83bd
    this.nomeEstabelecimento = nomeEstabelecimento;
    this.descricaoEstabelecimento = descricaoEstabelecimento;
    this.horarioAbertura = horarioAbertura;
    this.horarioEncerramento = horarioEncerramento;
<<<<<<< HEAD
    this.codigoEstabelecimento = codigoEstabelecimento;
=======
>>>>>>> 4d9278b1de260d9d54e3f63af61c355a116f83bd
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

<<<<<<< HEAD
  public int getCodigoEstabelecimento(){
  	return codigoEstabelecimento;
  }
  
=======
>>>>>>> 4d9278b1de260d9d54e3f63af61c355a116f83bd
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
<<<<<<< HEAD
  	return "Nome: "+nomeEstabelecimento+"\nDescrição: "+descricaoEstabelecimento+"\nAbre: "+
  			horarioAbertura+"\nFecha: "+horarioEncerramento+"\nEndereço: "+endereco+"\nCardápio: "+cardapio+"\n";
 }
}
=======
  	return ("nomeEstabelecimento: "+nomeEstabelecimento+"/n descricaoEstabelecimento: "+descricaoEstabelecimento+"/n horarioAbertura: "+
  			horarioAbertura+"/n horarioEncerramento: "+horarioEncerramento+"/n endereco: "+endereco+"cardapio: "+cardapio);
  }
}
>>>>>>> 4d9278b1de260d9d54e3f63af61c355a116f83bd
