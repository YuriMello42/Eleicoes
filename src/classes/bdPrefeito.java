package classes;

import java.util.ArrayList;
import java.util.List;


public class bdPrefeito {	
	public static List<Prefeito> carregarPrefeito() {
		List<Prefeito> BancoPrefeito = new ArrayList<>();
		
		BancoPrefeito.add(new Prefeito("Anderson Vila�a","51","PATRIOTA"));
		BancoPrefeito.add(new Prefeito("Karine In�cio","13","PT"));
		BancoPrefeito.add(new Prefeito("Marcus Cunha","20","PSDB"));
			
		return BancoPrefeito;
		
	}
	
}
