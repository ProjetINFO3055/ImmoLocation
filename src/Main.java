import java.awt.EventQueue;
import java.sql.*;

import vue.Fenetre;

public class Main {

	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre frame = new Fenetre();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		ConnexionBD conn = new ConnexionBD();
		
		ResultSet resultats = conn.select("SELECT * FROM Authentification");
		
		conn.afficheResultat(resultats);
	}

	

}
