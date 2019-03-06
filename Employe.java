package test;

public class Employe {

	private String nom;
	private String prenom;
	private int matr;
	private Departement dept;
	
	//ne jamais mettre dans le constructeur les attributs de l'association
	public Employe(String nom,String prenom,int matr) {
		this.nom=nom;
		this.prenom=prenom;
		this.matr=matr;
	}


	
	//getters and setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getMatr() {
		return matr;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}

	public Departement getDept() {  //obtenir le department d'un employe
		return dept;
	}

	public void setDept(Departement dept) {  //ASsocier l'employe a un departement 
		this.dept = dept;
	}
	
	//fin getters and setters 
}
