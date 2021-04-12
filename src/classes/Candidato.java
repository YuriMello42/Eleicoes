package classes;



public class Candidato {
	
	String Nome;
	String nVotacao;
	String Partido;
	int voto;

	
	public Candidato() {
	}

	
	public Candidato(String nome, String nVotacao, String partido) {
		super();
		Nome = nome;
		this.nVotacao = nVotacao;
		Partido = partido;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getnVotacao() {
		return nVotacao;
	}

	public void setnVotacao(String nVotacao) {
		this.nVotacao = nVotacao;
	}

	public String getPartido() {
		return Partido;
	}

	public void setPartido(String partido) {
		Partido = partido;
	}


	public int getVoto() {
		return voto;
	}


	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	
	

}
