package model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import controleur.ConnexionBD;

	
public class Facture {

	private int idLocataire;
	private int typePropriete;
	private int caution;
	private int dureeContrat;
	
	
	public Facture() {
		
	}
	public Facture(int idLocataire, int typePropriete, int caution, int dureeContrat) {
		
		this.idLocataire = idLocataire;
		this.typePropriete = typePropriete;
		this.caution = caution;
		this.dureeContrat = dureeContrat;
	}
	
	public int getIdLocataire() {
		return idLocataire;
	}
	public void setIdLocataire(int idLocataire) {
		this.idLocataire = idLocataire;
	}
	public int getTypePropriete() {
		return typePropriete;
	}
	public void setTypePropriete(int typePropriete) {
		this.typePropriete = typePropriete;
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
		System.out.println("id locataire : "+ this.getIdLocataire() + "\n type de propriete : " + this.getTypePropriete() + "\n caution verser : " + this.getCaution() + "\n duree de contrat :" + this.getDureeContrat());
	}
	// insertion dans la base de donnee
	public void insertFacture(Facture fact) {
		String query = "INSERT INTO `facture`(`idLocataire`, `typePropriete`, `caution`, `dure_contrat`) VALUES ('"+this.getIdLocataire()+"','"+this.getTypePropriete()+"','"+this.getCaution()+"','"+this.getDureeContrat()+"')";
		ConnexionBD conn=new ConnexionBD();
		int q = conn.update(query); 
	}
	////////////////////////// Affichage des informations sur la facture //////////////////////
	//// les informations sur l'id du locataire doivent etre celle qui sont deja dans la base de donnee
	//// actulement : 14523, 120368, sont les id des locataires dans notre base de donnee 
	
	public static ArrayList<Facture> afficherToutesLesFactures(ResultSet resultat){
		ArrayList<Facture> tab = new ArrayList();
		
		String g[] = new String [4];
		
		try {
			ResultSetMetaData rsmd = resultat.getMetaData();
			int nbCols = rsmd.getColumnCount();
			boolean encore = resultat.next();

			while (encore) {

			   for (int i = 1; i <= nbCols; i++) {
				 g[i-1] = (resultat.getString(i));
				 
			   }
	

		 Facture fact = new Facture();
		 fact.setIdLocataire(Integer.parseInt(g[0]));  
		 fact.setTypePropriete(Integer.parseInt(g[1]));
		 fact.setCaution(Integer.parseInt(g[2]));
		 fact.setDureeContrat(Integer.parseInt(g[3]));
		 tab.add(fact);
		 encore = resultat.next();
			}
			resultat.close();
		}  catch (SQLException e) {
			ConnexionBD.arret(e.getMessage());
		 }
		return tab;
	}
}
