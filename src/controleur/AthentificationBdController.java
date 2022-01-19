package src.controleur;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import src.model.Authentification;


public class AthentificationBdController {
	
	private String nomBD;
	private  String mdpBD;
	
	
	
	
	public  void setNom(String nom) {
		
		
		 this.nomBD=nom;
	}
	public  void setMdp(String mdp) {
		this.mdpBD=mdp;
	}
	
	public String getNomBD() {
		return this.nomBD;
	}
	public String getMdpBD() {
		return this.mdpBD;
	}
	
	public Authentification infoBD() {

		  String url = "jdbc:mysql://localhost:3306/immo_location";
		 String user = "root";
		   String pwd = "";
		  
		  Connection con;

		  try{
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      con = DriverManager.getConnection(url, user, pwd);
		      System.out.println("connexion a la BD!");
		      Statement stat=con.createStatement();
		      String sql="SELECT nom_usr,mdp FROM authentification";
		      ResultSet res=stat.executeQuery(sql);
		      
		      while(res.next()) {
		    	setNom(res.getString("nom_usr"));
		    	 setMdp(res.getString("mdp"));
		    	
		      }
 
		    }catch(SQLException|ClassNotFoundException e){
		      System.out.println("Erreur de connexion a la BD!");
		      System.out.println(e.toString());
		    }
		 Authentification authen=new Authentification(this.nomBD,this.mdpBD);
		 return authen;
		  
	}

}
	






