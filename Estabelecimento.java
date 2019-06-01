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
}
