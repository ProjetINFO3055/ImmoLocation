package model;

public abstract class Propriete {
	
	private int type;
	private float prix;
	private String description;
	private String localisation;
	private int statut,id;

	public Propriete() {}
	
	public Propriete(int type, float prix, String description, String localisation) {
		
		this.type=type;
		this.prix=prix;
		this.description=description;
		this.localisation=localisation;
		this.statut=1;	
	
	}

	public abstract int getType();


	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return this.description;
		
	}
	public void setDescription(String description) {
		this.description=description;
	}


	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public int getStatut() {
		this.statut=2;//pour toute nouvelle propriete son statut est libre
		return statut;
	}

	public void setStatut(int statut) {
		this.statut = statut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
