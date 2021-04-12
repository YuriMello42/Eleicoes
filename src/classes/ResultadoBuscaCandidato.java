package classes;

import java.util.List;



public class ResultadoBuscaCandidato {
	
	public static Vereador getVereador(String numeroVereador, List<Vereador> BancoVereador) {
		
		Vereador vereadorLocalizado = null;
		
		for (Vereador ver : BancoVereador ) {
			if(ver.getnVotacao().equals(numeroVereador)) {
				vereadorLocalizado = new Vereador();
				
				vereadorLocalizado.setNome(ver.getNome());
				vereadorLocalizado.setnVotacao(ver.getnVotacao());
				vereadorLocalizado.setPartido(ver.getPartido());
				vereadorLocalizado.setVoto(ver.getVoto());
			}
		}
		
		return vereadorLocalizado;
	}
	
	
	public static Prefeito getPrefeito(String numeroPrefeito, List<Prefeito> BancoPrefeito) {
		Prefeito PrefeitoLocalizado = null;
		
		for (Prefeito pre : BancoPrefeito) {
			if(pre.getnVotacao().equals(numeroPrefeito)) {
				PrefeitoLocalizado = new Prefeito();
				
				PrefeitoLocalizado.setNome(pre.getNome());
				PrefeitoLocalizado.setnVotacao(pre.getnVotacao());
				PrefeitoLocalizado.setPartido(pre.getPartido());
				PrefeitoLocalizado.setVoto(pre.getVoto());
				
							
			}
		}
		
		return PrefeitoLocalizado;
		
	}

}
