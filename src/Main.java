package src;
import java.awt.EventQueue;
import src.controleur.*;
import java.sql.*;
import java.util.ArrayList;

import controleur.LocationController;
import model.Locataire;
import model.Maison;
import model.Propriete;
import src.model.*;
import src.vue.Application;
import src.vue.LoginFrame;

public class Main {

	public static  void main(String[] args) {

		ConnexionBD conn = new ConnexionBD();
		
/*
 * lanceur l'application avec systeme d'authentification.					
 *  si vous ne connaissez pas votre user nom et mot de passe,veillez 
 *  vous connecter avec un mot de passe et verifier votre
 *   console,il y sera
 *   
 *   essayez auxi auxi
 */

		LoginFrame log=new LoginFrame();
		log.lanceur();
					 
	/////////////////////////////////////////Test en console/////////////////////////////////::
		
		/*ConnexionBD conn=new ConnexionBD();
		String requete="SELECT * FROM propriete";
		ResultSet res=conn.select(requete);
		ProprieteBdController a=new ProprieteBdController();
		ArrayList b=new ArrayList();
		b=a.afficherToutesLesProprietes(res);
		Propriete p=new Maison();
		Propriete x=new Boutique();
		for(int i=0;i<b.size();i++) {
			System.out.println(i+" "+b.get(i));
		}
		
		Propriete p=new  Maison(5,100000,"djqlhqjk","lsdjeozalisation dans ke dile",2);
		Locataire l=new  Locataire(17413," eloko", "Stephanie", 655543452, "enseignante");
		LocationController louer=new LocationController();
		louer.assigner(l, p);
		System.out.println("le id est maintenant a : "+p.getId());
		*/
		
		
						
		
		
			   
	}

	

}
