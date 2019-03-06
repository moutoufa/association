package test;

public class Departement {
	private String numero;
	private String nomdep;
	
	//si l'association est bidirectionnelle creez alors une liste d'employes
// private ArrayList <Employe> liste; //liste des employes d'un departement
	
	//dans tous les cas le constructeur est a 2 arguments
	public Departement(String numero,String nomdep) {
		this.numero=numero;
		this.nomdep=nomdep;
		
		//creer une liste vide d'employes si bidirectionnel
		//liste=new ArrayList <Employe>()
		
		//la methode ajouter existe si l;association est bidirectionnelle
		/*public void ajouterEmploye(Employe emp){
		 * liste.add(emp);
		 * }
		 */
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNomdep() {
		return nomdep;
	}

	public void setNomdep(String nomdep) {
		this.nomdep = nomdep;
	}
	
	
	
	
	
}
