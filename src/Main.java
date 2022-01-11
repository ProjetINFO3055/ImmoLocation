package src;
import java.awt.EventQueue;
import src.controleur.*;
import java.sql.*;
import java.util.ArrayList;
import src.controleur.*;
import src.model.*;

public class Main {

	public static void main(String[] args) {

		ConnexionBD conn = new ConnexionBD();
		
		
		
		//ResultSet resultats = conn.select("SELECT * FROM Authentification");
		
		//INSERT INTO table VALUES ('valeur 1', 'valeur 2', ...)
		
		
		// instantiation de l'objet 
		Locataire l = new Locataire();
		l.setNumeroCNI(12345);
		l.setNom("tkap");
		l.setPrenom("pa");
		l.setTelephone(2345);
		l.setMetier("rer");
		
		
		LocataireBdController.enregistrement(l);
		
				
		
		//Authentification res = AthentificationBdController.infoLogin(resultats);
		//res.afficher();
		
		
			   
	}

	

}
