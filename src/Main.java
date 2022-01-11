import java.awt.EventQueue;
import java.sql.*;

public class Main {

	public static void main(String[] args) {

		ConnexionBD conn = new ConnexionBD();
		
		ResultSet resultats = conn.select("SELECT * FROM Authentification");
		
		conn.afficheResultat(resultats);
	}

	

}
