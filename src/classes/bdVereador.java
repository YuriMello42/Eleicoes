package classes;

import java.util.ArrayList;
import java.util.List;


public class bdVereador {
	public static List<Vereador> carregarVereador() {
		List<Vereador> BancoVereador = new ArrayList<>();
		
		BancoVereador.add(new Vereador("Jonatas Caldas", "51559", "PATRIOTA"));
		BancoVereador.add(new Vereador("Eduarda Arouca", "51919", "PATRIOTA"));
		BancoVereador.add(new Vereador("Dennis Porto", "51353", "PATRIOTA"));
		BancoVereador.add(new Vereador("Jeremias Toledo", "51825", "PATRIOTA"));
		
		BancoVereador.add(new Vereador("Fátima Chagas", "13082", "PT"));
		BancoVereador.add(new Vereador("Valéria Pardo", "13048", "PT"));
		BancoVereador.add(new Vereador("Nilo Nunes", "13070", "PT"));
		
		BancoVereador.add(new Vereador("Valter Palma", "20878", "PSDB"));
		BancoVereador.add(new Vereador("Denisson Atilano", "20259", "PSDB"));
		BancoVereador.add(new Vereador("Alissa Palha", "20157", "PSDB"));
	
		return BancoVereador;
	
	}
}
