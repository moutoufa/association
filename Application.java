package test;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		ArrayList<Departement> listedep=new ArrayList<Departement>();
		ArrayList<Employe>listemp=new ArrayList<Employe>();
		int choix=0;
		do {
			System.out.println("1.Creer un Departement");
			System.out.println("2.Creer un Employe");
			System.out.println("3.ister les Departements");
			System.out.println("4.Lister les employes et leur departement");
			System.out.println("5.Lister les empoyes d'un departement donne");
			System.out.println("6.Sortie");
			System.out.println("   Votre choix");
			choix=sc.nextInt();
			sc.nextLine();
			
			if(choix==1) {
				System.out.println("Numero de departement ?");
				String numd=sc.nextLine();
				System.out.println("Nom departement");
				String nom=sc.nextLine();
				Departement d=new Departement(numd,nom);
				listedep.add(d);
			}
			else if(choix==2) {
				System.out.println("Matricule employe ?");
				int num=sc.nextInt();
				sc.nextLine();
				System.out.println("Nom ?");
				String nom=sc.nextLine();
				System.out.print("Prenom");
				String prenom=sc.nextLine();
				Employe e=new Employe(nom,prenom,num);
				System.out.println("Numero de departement ?");
				String numd=sc.nextLine();
				if(numd.equals("0")) {
					e.setDept(null);
					listemp.add(e);
				}
				else
				{
					 Departement d=null;
					 for(Departement x : listedep)
						 if(x.getNumero().equals(numd))
						 {
							 d=x;
							 break;
						 }
						 if(d==null)
							 System.out.println("departement inexistant");
						 else {
							e.setDept(d);
						 	listemp.add(e);
						 }			
				}
			}//fin choix 2
			
			else if(choix==3) {
				for(Departement x:listedep)
					System.out.println(x.getNumero()+"   "+x.getNomdep());
			}
			
			
			else if(choix==4) {
				for(Employe y:listemp)
				{
					if(y.getDept()==null)
						System.out.println(y.getMatr()+"  "+ y.getNom()+"  "+y.getPrenom());
					else
						System.out.println(y.getMatr()+"  "+ y.getNom()+"  "+y.getPrenom()+" "+y.getDept().getNumero()+" "+y.getDept().getNomdep());

				}
			}
			else if(choix==5) {
				System.out.println("Le Numero du departement?");
				String numero=sc.nextLine();
				Departement d=null;
				for(Departement x:listedep)
				
					if(x.getNumero().equals(numero))
					{
						d=x;
						break;
					}
					if(d==null) {
						System.out.println("Departement inexistant");
					}
					else {
						for(Employe x1:listemp)
							if(x1.getDept().getNumero().equals(numero))
							{
								System.out.println("Matricule:"+x1.getMatr());
								System.out.println("Nom: "+x1.getNom());
								System.out.println("Prenom: "+x1.getPrenom());
							}
					
				}
				
				
					
			}
			
			
			else if(choix==6)
				break;
			else
				System.out.println("option invalide");
		} while(choix!=6);
	}

}
