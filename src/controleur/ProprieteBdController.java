package controleur;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Authentification;
import model.Maison;
import model.Propriete;

public class ProprieteBdController {
	
static ConnexionBD conn = new ConnexionBD();

private int type;
private float prix;
private String description;
private String localisation;
private int statut;
	public static void enregistrement(Propriete obj) {
		String res = "INSERT INTO Propriete VALUES ("+obj.getId()+","+obj.getType()+","+obj.getPrix()+",'"+obj.getDescription()+"','"+obj.getLocalisation()+"',"+obj.getStatut()+")";
		
		int t = conn.update(res);
		
	}
	public static void afficherProprDispo() {
		try {
		String res1="SELECT  FROM propriete WHERE statut='2'";
		ResultSet t=conn.select(res1);
		 while(res1.next()) {
		    	setNom(res1.getInt(Integer.parseInt("id_propriete")));
		    	 setMdp(res.getString("typeProprite"));
		    	
		      }

		    }catch(SQLException|ClassNotFoundException e){
		      System.out.println("Erreur de connexion a la BD!");
		      System.out.println(e.toString());
		    }
		 Authentification authen=new Authentification(this.nomBD,this.mdpBD);
		 return authen;
		  
		
	}
	public static ArrayList<Propriete> afficherTousLesLocataire(ResultSet resultat) {
		
		ArrayList<Propriete> tab = new ArrayList();
		String t[] = new String[5];
		  try {
		         ResultSetMetaData rsmd = resultat.getMetaData();
		         int nbCols = rsmd.getColumnCount();
		         boolean encore = resultat.next();

		         while (encore) {

		            for (int i = 1; i <= nbCols; i++) {
		              t[i-1] = (resultat.getString(i));
		              
		            }
		            Propriete obj = new Maison();
		              obj.setNumeroCNI(Integer.parseInt(t[0]));
			          obj.setNom(t[1]);
			          obj.setPrenom(t[2]);
			          obj.setTelephone(Integer.parseInt(t[3]));
			          obj.setMetier(t[4]);
			          tab.add(obj);
					  encore = resultat.next();
		         }
		         
		         resultat.close();
		      } catch (SQLException e) {
		         ConnexionBD.arret(e.getMessage());
		      }
		  
		  return tab;
	  }
	

}
