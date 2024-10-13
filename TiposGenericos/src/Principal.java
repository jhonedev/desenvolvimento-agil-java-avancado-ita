import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		Cesta<Fruta> frutas = new Cesta<>();
		frutas.adiciona(new Fruta("Maçã"));
		frutas.adiciona(new Fruta("Banana"));
		frutas.adiciona(new Fruta("Goiaba"));
		frutas.adiciona(new Fruta("Mamão"));
		frutas.adiciona(new Fruta("Pêra"));
		frutas.adiciona(new Fruta("Uva"));
		frutas.adiciona(new FrutaVermelha("Morango"));
		
		List<FrutaVermelha> vermelhas = new ArrayList<>();
		vermelhas.add(new FrutaVermelha("Amora"));
		vermelhas.add(new FrutaVermelha("Cereja"));
		
		frutas.adicionaTodos(vermelhas);
		
		while(frutas.temIntens()) {
			System.out.print(frutas.retira());
		}
	}
}
