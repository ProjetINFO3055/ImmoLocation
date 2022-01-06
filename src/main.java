 import java.awt.EventQueue;
 import java.sql.*;

public class main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Le code à exécuter est à insérer ici.
            	
            	/*
            	 *  Informations de connexion, pour connecter l'application
            	 *  à la BDD
            	 */
            	String url = "jdbc:mysql://localhost:3306/immo_location";
            	String user = "root";
            	String passwd = "";
            	
            	
            	/*
            	 *  On vérifie bien que la connexion avec la base de données
            	 *  s'effectue sans aucun problème.
            	 */
            	try {
            	    Class.forName("com.mysql.jdbc.Driver");
            	    Connection conn = DriverManager.getConnection(url, user, passwd);
            	    System.out.println("Connecter");
            	} catch (Exception e){
            	    e.printStackTrace();
            	    System.out.println("Erreur");
            	    System.exit(0);
            	}
            	ResultSet resultat = null;
        		String requete  = "SELECT * FROM status ";
        		
        		try {
        				 Connection conn = DriverManager.getConnection(url, user, passwd);
        				Statement auxi = conn.createStatement();
        				resultat = auxi.executeQuery(requete);
        			
        		}
        		catch (SQLException e){
        			
        		
        		}
        		
            }
        });
		
		
		
	}


	}