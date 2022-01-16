package model;

public class Studio extends Propriete{

	
public Studio() {}
	
	public Studio(int type,float prix,String description,String localisation) {
		super(type,prix,description,localisation);	
	}
	
	public String getDescription() {
		
		return "Studio";
	}

	@Override
	public int getType() {
		System.out.println("studio");
		return 3;
	}

}
