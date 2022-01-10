package model;

public class Facture extends Locataire {

	private float montant;
	private Locataire locataire;
	private int caution;
	private int dureeContrat;
	
	public Facture() {
		super();
	}
	// constructeur avec parametre, j'ajoute un 'p' devant chaque parametre pour faire la difference
	public Facture(String pNome, String pPrenom, String pMetier, int pTelephone, int ncni, int pDureeContrat, int pCaution , float pMontant) {
		// appel du constructeur de la classe mere
		super(pNom, pPrenom, pMetier, pTelephone , ncni);
		this.dureeContrat = pDureeContrat;
		this.Caution = pCaution;
		this.montant = pMontant;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float pMontant) {
		montant = pMontant;
	}
	public int getDureeContrat() {
		return dureeContrat;
	}
	public void setDureeContrat(int pDureeContrat) {
		dureeContrat = pDureeContrat;
	}
	public int getCaution() {
		return caution;
	}
	public void setCaution( int pCaution) {
		caution = pCaution;
	}
	public float CalculerFacture(float montant) {
		montant = montant*dureeContrat;
		return montant;
	}
	// description de notre facture
	public String toString() {
		String str;
		if(this.getNom() != null && this.getPrenom() != null && this.getMetier() != null){
		    str = "--------------- FACTURE DU LOCATAIRE ---------- \n";
			str += "nom : " +this.getNom() +"\n";
			str += "prenom : " +this.getPrenom() +"\n";
			str += "metier : " +this.getMetier() +"\n";
			str += "telephone : " +this.getTelephone() + "\n";
			str += "numeroCNI : " +this.getNumeroCNI() + "\n";
			str += "caution verser : " +this.caution + " FCFA \n";
			str += "duree du contrat : " + this.dureeContrat + " mois \n";
			str += "prix de la propriete : " + this.montant + " FCFA \n";
			str += "montant de la facture : " +this.CalculerFacture(montant) + " FCFA \n";	
		} else {
			str = "Aucune facture disponible";
		}
		return str;
	}
}
