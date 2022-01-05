import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;

public class main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Le code � ex�cuter est � ins�rer ici.
            	
            	/*
            	 *  Informations de connexion, pour connecter l'application
            	 *  � la BDD
            	 */
            	String url = "jdbc:mysql://localhost:3306/immo_location";
            	String user = "root";
            	String passwd = "";
            	
            	
            	/*
            	 *  On v�rifie bien que la connexion avec la base de donn�es
            	 *  s'effectue sans aucun probl�me.
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
            }
        });
	}


	}

