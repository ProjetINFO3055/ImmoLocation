package model;

public class Facture {

	private int id_locataire;
	private int type_propriete;
	private int caution;
	private int dureeContrat;
	
	public Facture(int id)
	{
		
	}
	
	public Facture() {
		
	}
	public Facture(int id_locataire, int type_propriete, int caution, int dureeContrat) {
		
		this.id_locataire = id_locataire;
		this.type_propriete = type_propriete;
		this.caution = caution;
		this.dureeContrat = dureeContrat;
	}
	public int getId_locataire() {
		return id_locataire;
	}
	public void setId_locataire(int id_locataire) {
		this.id_locataire = id_locataire;
	}
	public int getType_propriete() {
		return type_propriete;
	}
	public void setType_propriete(int type_propriete) {
		this.type_propriete = type_propriete;
	}
	public int getCaution() {
		return caution;
	}
	public void setCaution(int caution) {
		this.caution = caution;
	}
	public int getDureeContrat() {
		return dureeContrat;
	}
	public void setDureeContrat(int dureeContrat) {
		this.dureeContrat = dureeContrat;
	} 
	public int calculMontant(int montant) {
		montant = montant*dureeContrat;
		return montant;
	}
	public void afficheFacture() {
		System.out.println("id locataire : "+ this.getId_locataire() + "\n type de propriete : " + this.getType_propriete() + "\n caution verser : " + this.getCaution() + "\n duree de contrat :" + this.getDureeContrat());
	}
	// insertion dans la base de donnee
	public void insertFacture(Facture fact) {
		String query = "INSERT INTO Facture VALUES("+fact.getId_locataire()+",'"+fact.getType_propriete()+",'"+fact.getCaution()+",'"+fact.getDureeContrat()+"')";
		 
	}
}
