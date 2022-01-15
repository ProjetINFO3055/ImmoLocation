
import java.awt.EventQueue;
import controleur.*;
import java.sql.*;
import java.util.ArrayList;
import model.*;
import vue.Application;

public class Main {

	public static void main(String[] args) {

		ConnexionBD conn = new ConnexionBD();
		java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
         Application App=new Application();
         App.setVisible(true);
         App.setLocationRelativeTo(null);
        }
    });
		
		
		
		ResultSet resultats = conn.select("SELECT * FROM Locataire");
		ArrayList<Locataire> r = new ArrayList();
		r = LocataireBdController.afficherTousLesLocataire(resultats);
		for(Locataire l: r) {
			l.afficher();
		}
		
		//INSERT INTO table VALUES ('valeur 1', 'valeur 2', ...)
		
		
		// instantiation de l'objet 
		Locataire l = new Locataire();
		l.setNumeroCNI(12345);
		l.setNom("tkap");
		l.setPrenom("pa");
		l.setTelephone(2345);
		l.setMetier("rer");
		
		
		//LocataireBdController.enregistrement(l);
		
				
		
		//Authentification res = AthentificationBdController.infoLogin(resultats);
		//res.afficher();
		
		
		
		
		
			   
	}

	

}
