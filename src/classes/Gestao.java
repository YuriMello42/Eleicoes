package classes;

import java.util.HashMap;
import classes.*;

import java.util.List;

public class Gestao {
	public HashMap<String, Vereador> GestaoDeVotosVereador(String numeroVereador, List<Vereador> BancoVereador,
			HashMap<String, Vereador> votosVereador) {

		if (numeroVereador.length() == 5) {
			Vereador vereadorLocalizado = ResultadoBuscaCandidato.getVereador(numeroVereador, BancoVereador);

			if (vereadorLocalizado != null) {
				if (votosVereador.isEmpty()) {
					vereadorLocalizado.setVoto(1);
					votosVereador.put(vereadorLocalizado.getnVotacao(), vereadorLocalizado);
				} else {
					Vereador ver = new Vereador();
					ver = votosVereador.get(numeroVereador);

					if (ver != null) {
						ver.setVoto(ver.getVoto() + 1);
						votosVereador.replace(vereadorLocalizado.getnVotacao(), ver);

					} else {
						vereadorLocalizado.setVoto(1);
						votosVereador.put(vereadorLocalizado.getnVotacao(), vereadorLocalizado);

					}
				}
			}
		}

		return votosVereador;
	}

	public HashMap<String, cBranco> votoBrancoVereador(String tipoCandidato,
			HashMap<String, cBranco> votosBrancoVereador) {

		cBranco branco = new cBranco();

		if (votosBrancoVereador.isEmpty()) {
			branco.setTipoCandidato(tipoCandidato);
			branco.setVotoBranco(1);

			votosBrancoVereador.put(tipoCandidato, branco);

		} else {
			branco = votosBrancoVereador.get(tipoCandidato);
			if (branco != null) {
				branco.setVotoBranco(branco.getVotoBranco() + 1);
				votosBrancoVereador.replace(tipoCandidato, branco);
			} else {
				branco = new cBranco();
				branco.setVotoBranco(1);
				votosBrancoVereador.put(tipoCandidato, branco);
			}
		}

		return votosBrancoVereador;
	}

	public HashMap<String, Prefeito> GestaoVotoPrefeito(String numeroPrefeito, List<Prefeito> BancoPrefeito,
			HashMap<String, Prefeito> votosPrefeito) {

		if (numeroPrefeito.length() == 2) {
			Prefeito prefeitoLocalizado = ResultadoBuscaCandidato.getPrefeito(numeroPrefeito, BancoPrefeito);

			if (prefeitoLocalizado != null) {
				if (votosPrefeito.isEmpty()) {
					prefeitoLocalizado.setVoto(1);
					votosPrefeito.put(prefeitoLocalizado.getnVotacao(), prefeitoLocalizado);
				} else {
					Prefeito pre = new Prefeito();
					pre = votosPrefeito.get(numeroPrefeito);

					if (pre != null) {
						pre.setVoto(pre.getVoto() + 1);
						votosPrefeito.replace(prefeitoLocalizado.getnVotacao(), pre);
					} else {

						prefeitoLocalizado.setVoto(1);
						votosPrefeito.put(prefeitoLocalizado.getnVotacao(), pre);

					}
				}
			}
		}
		return votosPrefeito;
	}

	public HashMap<String, cBranco> votoBrancoPrefeito(String tipoCandidato,
			HashMap<String, cBranco> votosBrancoPrefeito) {
			cBranco branco = new cBranco();
				if(votosBrancoPrefeito.isEmpty()) {
					branco.setTipoCandidato(tipoCandidato);
					branco.setVotoBranco(1);
					
					votosBrancoPrefeito.put(tipoCandidato, branco);
				
				}else {
					branco=votosBrancoPrefeito.get(tipoCandidato);
					
					if(branco!= null) {
						branco.setVotoBranco(branco.getVotoBranco() +1);
					votosBrancoPrefeito.replace(tipoCandidato, branco);
					}else {
						branco = new cBranco();
						branco.setVotoBranco(1);
						votosBrancoPrefeito.put(tipoCandidato, branco);
						
					}
				}
				
		
		return votosBrancoPrefeito;
	}

}
