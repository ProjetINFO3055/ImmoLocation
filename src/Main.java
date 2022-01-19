package src;
import java.awt.EventQueue;
import src.controleur.*;
import java.sql.*;
import java.util.ArrayList;
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
					 
	
						
		
		
			   
	}

	

}
