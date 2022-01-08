package model;
import java.util.Date;
import java.util.Scanner;

public class Locataire {
Scanner clavier = new Scanner(System.in);
	private Date dateNaissance;
	private String name;
	private String lastName;
	private String metier;
	private String mail;
	private String informatioSuplementaire;
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
	public Locataire(String pName, String pLastName, String pMetier, String pMail, String pInformationSupplementaire, int pTelephone, int pNumeroCNI) {
		name = pName;
		lastName = pLastName;
		metier = pMetier;
		mail = pMail;
		informationSupplementaire = pInformationSupplementaire;
		telephone = pTelephone;
		numeroCNI = pNumeroCNI;
	}
	// methode retournant le lastName du locataire
	public String getLastName() {
		return lastName;
	}
	// on definit le 'lastName' du locataire
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	// on retourne le metier du locataire
	public String getMetier() {
		return metier;
	}
	// on definit le metier du locataire
	public void setMetier(String metier) {
		this.metier = metier;
	}
	// on retourne le mail du locataire
	public String getMail() {
		return mail;
	}
	// on definit le mail du locataire
	public void setMail(String mail) {
		this.mail = mail;
	}
	// on retourne l'information supplementaire du locataire
	public String getInformationSupplementaire() {
		return informationSupplementaire;
	}
	// on definit l'information supplementaire du locataire
	public void setInformationSupplementaire(String informationSupplementaire) {
		this.informationSupplementaire = informationSupplementaire;
	}
	// on retourne le numero de telephone du locataire
	public int getTelephone() {
		return telephone;
	}
	// on definit le numero de telephone du locataire
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	// on retourne le numero de la CNI du locataire
	public int getNumeroCNI() {
		return numeroCNI
	}
	// on definit le numero de CNI du locataire
	public void SetNumeroCNI(int numeroCNI) {
		this.numeroCNI = numeroCNI;
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
	public String getName()
	{
		return this.name;
	}
	// on definit le nom du locataire
	public void setName(String name) {
		this.name = name;
	}
	
}
	
