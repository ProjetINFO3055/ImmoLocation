package model;
import java.util.Date;
import java.util.Scanner;

public class Locataire {
Scanner clavier = new Scanner(System.in);
	private Date dateNaissance;
	private String nom;
	private String prenom;
	private String metier;
	private int telephone;
	private int numeroCNI;
	

/*METHODE SUR LES LOCATAIRES
 * 
 * Constructeur avec parametre de la classe Locataire qui permettra de creer tout les instances de notre classe
 * CONSTRUCTEUR particulier D'UN LOCATAIRE
 * ajouterLocataire();
 * OMINSERT INTO Employe(Nom, Prenom, NAS, Telephone, IdDepartement)
VALUES ('Lapierre',
'Pierre',
987654321,
'(514) 456-7890‘,
(SELECTId FROMDepartementWHERENom = 'Ventes'));
 * 
 * DESTRUCTION D'UN LOCATAIRE
 * supprimerLocataire();
 * 
 * CHANGER DE INFORMATION SUR LE LOCATAIRE
 * modifierLocataire();
 * 
 * AFFICHER LA LISTE DE TOUT LES LOCATAIRE
 * listeLocataire();
 * 
 * AFFICHER LOCATAIRE
 * 
 * GETTER FOR NAME
 * getName();
 */
	// constructeur avec paramettre, j'ajoute un 'p' devant chaque parametre pour faire la difference
	public Locataire(String pNom, String pPrenom, String pMetier,  int pTelephone, int ncni) {
		nom = pNom;
		prenom = pPrenom;
		metier = pMetier;
		telephone = pTelephone;
		numeroCNI = ncni;
	}
	// methode retournant le prenom du locataire
	public String getPrenom() {
		return prenom;
	}
	// on definit le 'prenom' du locataire
	public void setPrenom(String Pprenom) {
		prenom = pPrenom;
	}
	// on retourne le metier du locataire
	public String getMetier() {
		return metier;
	}
	// on definit le metier du locataire
	public void setMetier(String pMetier) {
		metier = pMetier;
	}
	// on retourne le numero de telephone du locataire
	public int getTelephone() {
		return telephone;
	}
	// on definit le numero de telephone du locataire
	public void setTelephone(int pTelephone) {
		telephone = pTelephone;
	}
	// on retourne le numero de la CNI du locataire
	public int getNumeroCNI() {
		return numeroCNI
	}
	// on definit le numero de CNI du locataire
	public void SetNumeroCNI(int ncni) {
		numeroCNI = ncni;
	}
		
   	
	public void ajouterLocataire()
	{
		System.out.println("-----------------------------------SYSTEM DE RECEUIL D'INFORMATION SUR LE LOCATAIRE------------------------------");
		System.out.print("\n ");
		System.out.print("\n ");
		System.out.print("NOM : ");
		this.name=clavier.nextLine();
		System.out.print("\n ");
		System.out.print("PRENOM : ");
		this.lastName=clavier.nextLine();
		//System.out.print("\n ");
		//System.out.print("DATE DE NAISSANCE : ");
		//this.dateNaissance=clavier.Date()
		System.out.print("\n ");;
		System.out.print("METIER : ");
		this.metier=clavier.nextLine();
		System.out.print("\n ");
		System.out.print("INFORMATION SUPPLEMENTAIRE : ");
		this.informatioSuplementaire=clavier.nextLine();
		System.out.print("\n ");
		System.out.print("MAIL : ");
		this.mail=clavier.nextLine();
		System.out.print("\n ");
		System.out.print("CNI : ");
		this.numeroCNI=clavier.nextInt();
		System.out.print("\n ");
		System.out.print("TELEPHONE: ");
		this.telephone=clavier.nextInt();
		System.out.print("\n ");
		
		
		
		
	}
	public void supprimerLocation()
	{
		this.name=null;
		this.lastName=null;
		this.mail=null;
		this.metier=null;
		this.informatioSuplementaire=null;
		this.numeroCNI=0;
		this.telephone=0;
		
	}
	public void modifierLocataire()
	{
		
	}
	public void listeLocataire()
	{
		
	}
	public void afficheLocataire()

	{
		System.out.println("-----------------------------------SYSTEM DE RECEUIL D'INFORMATION SUR LE LOCATAIRE------------------------------");
		System.out.print("\n ");
		System.out.print("\n ");
		System.out.print("NOM : "+this.name);
		
		System.out.print("\n ");
		System.out.print("PRENOM : "+this.lastName);
		
		//System.out.print("\n ");
		//System.out.print("DATE DE NAISSANCE : ");
	
		System.out.print("\n ");;
		System.out.print("METIER : "+this.metier);
		
		System.out.print("\n ");
		System.out.print("INFORMATION SUPPLEMENTAIRE : "+this.informatioSuplementaire);
		
		System.out.print("\n ");
		System.out.print("MAIL : "+this.mail);
		
		System.out.print("\n ");
		System.out.print("CNI : "+this.numeroCNI);
		
		System.out.print("\n ");
		System.out.print("TELEPHONE: "+this.telephone);
		
		System.out.print("\n ");
		
		
		
	}
	public String getNom()
	{
		return this.name;
	}
	// on definit le nom du locataire
	public void setName(String pNom) {
		nom = pNom;
	}
	// description du locataire
	public String toString() {
		String str;
		if(this.nom != null && this.prenom != null && this.metier != null ) {
			str = "Description de notre locataire \n";
			str += "nom : " +this.nom +"\n";
			str += "prenom : " +this.prenom +"\n";
			str += "metier : " +this.metier +"\n";
			str += "telephone : " +this.telephone + "\n";
			str += "numeroCNI : " +this.numeroCNI + "\n";
		}else {
			str = "aucune information";
		}
		return str;
	}
		
	
}
	
