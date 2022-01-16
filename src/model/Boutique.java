package model;

public class Boutique extends Propriete {

	
	public Boutique() {}
	
	public Boutique(int type,float prix,String description,String localisation) {
		super(type,prix,description,localisation);	
	}


	public int getType() {
		System.out.println("boutique");
		return 2;
	}
	


}
