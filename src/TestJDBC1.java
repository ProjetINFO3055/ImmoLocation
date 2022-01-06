

			import java.sql.*;

			public class TestJDBC1 {

			   private static void affiche(String message) {
			      System.out.println(message);
			   }

			   private static void arret(String message) {
			      System.err.println(message);
			      System.exit(99);
			   }

			   public static void main(java.lang.String[] args) {
			      Connection con = null;
			      ResultSet r�sultats = null;
			      String requete = "";

			      String url = "jdbc:mysql://localhost:3306/immo_location";
	            	String user = "root";
	            	String passwd = "";
	            	
	            	
	            	/*
	            	 *  On v�rifie bien que la connexion avec la base de donn�es
	            	 *  s'effectue sans aucun probl�me.
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
			      affiche("creation et execution de la requ�te");
			      requete = "SELECT * FROM authentification";

			      try {
			         Statement stmt = con.createStatement();
			         r�sultats = stmt.executeQuery(requete);
			      } catch (SQLException e) {
			         arret("Anomalie lors de l'execution de la requ�te");
			      }

			      //parcours des donn�es retourn�es
			      affiche("parcours des donn�es retourn�es");
			      try {
			         ResultSetMetaData rsmd = r�sultats.getMetaData();
			         int nbCols = rsmd.getColumnCount();
			         boolean encore = r�sultats.next();

			         while (encore) {

			            for (int i = 1; i <= nbCols; i++)
			               System.out.print(r�sultats.getString(i) + " ");
			            System.out.println();
			            encore = r�sultats.next();
			         }

			         r�sultats.close();
			      } catch (SQLException e) {
			         arret(e.getMessage());
			      }

			      affiche("fin du programme");
			      System.exit(0);
			   }
			}


