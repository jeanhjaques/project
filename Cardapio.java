import java.util.Set;
import java.util.HashSet;

public class Cardapio{
	//atributos
	private Set<Bebida> bebidasAlcoolicas = new HashSet<>();
	private Set<Bebida> bebidasNaoAlcoolicas = new HashSet<>();
	private Set<Item> comidas = new HashSet<>();

	//construtor
	
	public Cardapio() {};
	public Cardapio(Set<Bebida> bebidasAlcoolicas, Set<Bebida> bebidasNaoAlcoolicas, Set<Item> comidas) {
		super();
		this.bebidasAlcoolicas = bebidasAlcoolicas;
		this.bebidasNaoAlcoolicas = bebidasNaoAlcoolicas;
		this.comidas = comidas;
	}


	//getters
	public Set<Bebida> getBebidasAlcoolicas(){
		return bebidasAlcoolicas;
	}
	
	public Set<Bebida> getBebidasNaoAlcoolicas(){
		return bebidasNaoAlcoolicas;
	}

	//metodos para adicao e remocao de itens ao cardapio
	public void adicionarBebidaAlcoolica(Bebida novaBebidaAlcoolica){
		bebidasAlcoolicas.add(novaBebidaAlcoolica);
	}

	public void adicionarBebidaNaoAlcoolica(Bebida novaBebidaNaoAlcoolica){
		bebidasNaoAlcoolicas.add(novaBebidaNaoAlcoolica);
	}

	public void adicionarComida(Item novaComida){
		comidas.add(novaComida);
	}

	//toString
	@Override
	public String toString() {
		return "Bebidas Alcoolicas:\n" + bebidasAlcoolicas + "\nBebidas não Alcoolicas:\n" + bebidasNaoAlcoolicas
				+ "\nComidas:\n" + comidas;
	}
}