public class Main{
	public static void main(String args[]){
		//criando endereco
		Endereco escobar = new Endereco("790000", "Universitario", "100", "Trindade");
		
		//criando uma bebida
		Bebida skolBeats = new Bebida("Skol Beats", 5.00, 313, 1 , "Skol",
			"7,9");

		//criando uma comida
		Item coxinha = new Item("Coxinhas de frango", 5.00, 313, 2);
		
		//criando um cardapio
		Cardapio cardapioEscobar = new Cardapio();
		
		//inserindo bebida no cardapio
		cardapioEscobar.adicionarBebidaAlcoolica(skolBeats);

		//inserindo comida no cardapio
		cardapioEscobar.adicionarComida(coxinha);

		//criando um estabelecimento
		Estabelecimento primeiro = new Estabelecimento("Bar Escobar", "Bar da faculdade", "9:00", "22:00", escobar, cardapioEscobar, 1);
		
		System.out.println(primeiro);
	}
}
