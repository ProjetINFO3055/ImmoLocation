package model;

public abstract class Propriete {
	
	private String type;
	private float prix;
	private String description;
	private String localisation;
	private boolean statut;

	public Propriete() {}
	
	public Propriete(String type, float prix, String description, String localisation, boolean statut) {
		
		this.type=type;
		this.prix=prix;
		this.description=description;
		this.localisation=localisation;
		this.statut=statut;	
	
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public abstract String getDescription();


	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

}
