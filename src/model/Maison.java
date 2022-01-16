package model;

public class Maison extends Propriete{
	
	public Maison() {}
	
	public Maison(int type,float prix, String description,String localisation,int statut) {
		super(type,prix,description,localisation);	
	}



	public int getType() {
		System.out.println("maison");
		return 1;
	}




}
