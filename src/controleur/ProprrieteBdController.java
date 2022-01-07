package controleur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResulSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ProprrieteBdController {
	private static void affiche(String message) {
	      System.out.println(message);
	   }

	   private static void arret(String message) {
	      System.err.println(message);
	      System.exit(99);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
	      ResultSet résultats = null;
	      String requete = "";

	    String url = "jdbc:mysql://localhost:3306/immo_location";
    	String user = "root";
    	String passwd = "";
    	/*vérification de la connexion*/
    	
    	
    	try {
      	    Class.forName("com.mysql.jdbc.Driver");
      	    con = DriverManager.getConnection(url, user, passwd);
      	    System.out.println("Connecter");
      	} catch (Exception e){
      	    e.printStackTrace();
      	    System.out.println("Erreur");
      	    System.exit(0);
      	}
    	try {
            Statement stmt = con.createStatement();
            résultats = stmt.executeQuery(requete);
         } catch (SQLException e) {
            arret("Anomalie lors de l'execution de la requête");
         }

         //parcours des données retournées
         affiche("parcours des données retournées");
         try {
            ResultSetMetaData rsmd = résultats.getMetaData();
            int nbCols = rsmd.getColumnCount();
            boolean encore = résultats.next();

            while (encore) {

               for (int i = 1; i <= nbCols; i++)
                  System.out.print(résultats.getString(i) + " ");
               System.out.println();
               encore = résultats.next();
            }

            résultats.close();
         } catch (SQLException e) {
            arret(e.getMessage());
         }

         affiche("fin du programme");
         System.exit(0);
	
	}

}
