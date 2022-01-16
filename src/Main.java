
import java.awt.EventQueue;
import controleur.*;
import java.sql.*;
import java.util.ArrayList;
import model.*;
import vue.Application;
import vue.LoginFrame;

public class Main {

	public static  void main(String[] args) {

		ConnexionBD conn = new ConnexionBD();
		
/*
 * lanceur l'application avec systeme d'authentification.					
 *  si vous ne connaissez pas votre user nom et mot de passe,veillez 
 *  vous connecter avec un mot de passe et verifier votre
 *   console,il y sera
 */

		LoginFrame log=new LoginFrame();
		log.lanceur();
					 
	
						
		
		
			   
	}

	

}
