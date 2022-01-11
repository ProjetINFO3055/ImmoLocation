package src.controleur;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import src.ConnexionBD;
import src.model.*;

public class LocataireBdController {
	static ConnexionBD conn = new ConnexionBD();
	
	public static void enregistrement(Locataire obj) {
		String res = "INSERT INTO Locataire VALUES ("+obj.getNumeroCNI()+",'"+obj.getNom()+"','"+obj.getPrenom()+"',"+obj.getTelephone()+",'"+obj.getMetier()+"')";;
		
		int t = conn.update(res);
		
	}
	
/*public static ArrayList<Authentification> afficheResultat(ResultSet resultat) {
		
		ArrayList<Authentification> tab = new ArrayList();
		String t[] = new String[2];
		  try {
		         ResultSetMetaData rsmd = resultat.getMetaData();
		         int nbCols = rsmd.getColumnCount();
		         boolean encore = resultat.next();

		         while (encore) {

		            for (int i = 1; i <= nbCols; i++) {
		              t[i-1] = (resultat.getString(i));
		              
		            }
		            Authentification obj = new Authentification();
		              obj.setUser_name(t[0]);
			          obj.setPwd(t[1]);
			            tab.add(obj);
					  encore = resultat.next();
		         }
		         
		         resultat.close();
		      } catch (SQLException e) {
		         ConnexionBD.arret(e.getMessage());
		      }
		  
		  return tab;
	  }*/
	
}





