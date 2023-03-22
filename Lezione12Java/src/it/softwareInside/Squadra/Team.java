package it.softwareInside.Squadra;

public class Team {

	private String nome;
	private int numeroTrofeiVinti;
	private Allenatore allenatore;
	private Player [] players;
	
	
	public Team (String nome , int numeroTrofeiVinti , Allenatore allenatore) {
		
		setAllenatore(allenatore);
		setNome(nome);
		setNumeroTrofeiVinti(numeroTrofeiVinti);
		setPlayers(new Player [11]);
	}

	
	
	public Team () {
		
		this("AVG", 8, new Allenatore ());
		
	}
	
	
	
	@Override
	public String toString () {
		
		String ris = "";
		
		for (int i = 0; i < players.length; i++) {
			ris +="\n" +  players[i] + "\n";
		}
		
		return "Nome Squadra: " + this.nome + " Numero trofei vinti: " + this.numeroTrofeiVinti + " Allenatore " + this.allenatore + " Giocatori:\n " +  ris;
	}
	
	
	
	
	
	
	
	//metodi set
	
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	
	
	public void setNumeroTrofeiVinti (int numeroTrofeiVinti) {
		
		this.numeroTrofeiVinti = numeroTrofeiVinti;
	}
	
	
	
	public void setAllenatore (Allenatore allenatore) {
		
		this.allenatore = allenatore;
	}
	
	
	
	public void setPlayers (Player [] players) {
		
		this.players = players;
	}
	
	
	
	
	//metodi get
	
	
	
	public String getNome () {
		
		return this.nome;
	}
	
	
	public int getNumeroTrofeiVinti () {
		
		return this.numeroTrofeiVinti;
	}
	
	
	
	public Allenatore getAllenatore () {
		
		return this.allenatore;
	}
	
	
	
	public Player [] getPlayer () {
		
		return this.players;
	}
	
	
	
	
	
	
	//altri metodi
	
	public void stampaGiocatori () {
		
		for (int i = 0; i < players.length; i++) {
			System.out.println(players[i]);
		}
	}
	
	
	
	
	public boolean aggiungiGiocatore (Player player) {
		
		if (player == null) 
			return false;
		
		
		for (int i = 0; i < players.length; i++) {
			if (players[i] == null) {
				players[i] = player;
				return true;
			}
			
		}
		
		return false;
		
	}
	
	
	
	
	public Player rimuoviGiocatore (int posizione) {
		
		Player playerUscito = new Player();
		
		if (posizione < 0 || posizione >= players.length) 
			return null;
		
		
		playerUscito = players[posizione];
		this.players[posizione] = null;
		return playerUscito;
		
	}
	
	
	
	
	
	
}
