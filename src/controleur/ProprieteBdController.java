package controleur;
import java.sql.*;
	/*
	import java.sql.Connection ;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.ResultSetMetaData;
	import java.sql.SQLException;
	import java.sql.Statement;
	*/
	public class ProprieteBdController {

		private static void affiche(String message) {
		      System.out.println(message);
		   }

		   private static void arret(String message) {
		      System.err.println(message);
		      System.exit(99);
		   }

		   public static void Main(String[] args) {
		      Connection con = null;
		      ResultSet résultats = null;
		      String requete = "";

		      String url = "jdbc:mysql://localhost:3306/immo_location";
	      	String user = "root";
	      	String passwd = "";
	      	
	      	
	      	/*
	      	 *  On vérifie bien que la connexion avec la base de données
	      	 *  s'effectue sans aucun problème.
	      	 */
		      
	      	try {
	      	    Class.forName("com.mysql.jdbc.Driver");
	      	    con = DriverManager.getConnection(url, user, passwd);
	      	    System.out.println("Connecter");
	      	} catch (Exception e){
	      	    e.printStackTrace();
	      	    System.out.println("Erreur");
	      	    System.exit(0);
	      	}


		      //creation et execution de la requete
		      affiche("creation et execution de la requête");
		   
		      public boolean ajouter(String propriete,  int prix_Mensuel,String description,String localisation, boolean status ) 
		      boolean ajout = false;
	    	  String requete = null;
		      {
		    	  try 
		    	  { 
			   	requete = " INSERT INTO propriete(typePropriete,  prix_Mensuel,description,localisation, status) VALUES (?,?,?,?,?)";
			   	PreparedStatement ajoutlocataire= con.prepareStatement(requete);
			   	ajoutlocataire.Int(1);
			   	ajoutlocataire.setString (2, typePropriete.getString());
			   	ajoutlocataire.setString (3, prix_Mensuel.getIntg());
			   	ajoutlocataire.setString (4, description.getString());
			   	ajoutlocataire.setString (5, localisation.getString());
			   	ajoutlocataire.setString (5, status.getString());
			   	
			   	ajoutlocataire.executeUpdate();  
			   	ajout = true;
			 
		    	  //Statement stmt = con.createStatement();
		    	  //résultats = stmt.executeQuery(requete);
		        }
		         
		       catch (SQLException e)
		    	  {
		         arret("Anomalie lors de l'execution de la requête");
		    	  }
		   
		   			return ajout;
		      
	}	   
		   

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

		      System.exit(0);
		   }
		
	}






	}

