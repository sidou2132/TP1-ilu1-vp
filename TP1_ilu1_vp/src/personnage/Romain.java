package personnage;
import objet.Equipement;

public class Romain
{
	private String nom;
	private int force;
	private int nbEquipements=0;
	private Equipement [] equipements;
public Romain(String nom,int force) 
{
	this.nom = nom;
	this.force=force;
	this.equipements=new Equipement[2];
	assert isInvariantVerified();
}
private boolean  isInvariantVerified()
{
	return force>=0;
}

   public void recevoirCoup(int forceCoup )
   {
	   int a=force;
	   assert isInvariantVerified();
	   assert forceCoup>0;
	   force=force-forceCoup;
	   if (force>0)
	   {
		   System.out.println("le Romain"+nom+": \"aie\"");
		   
	   }
	   else
	   {
		   System.out.println("le Romain"+nom+": \"jabandonne !\"");
	   }
	   assert isInvariantVerified();
	   assert a>force;
   }
   public int cnbEquipements(Equipement  equipements[])
   {
	   nbEquipements=0;
	   for (int i=0;i<2;i++)
	   {
		   if (equipements[i]!=null)
		   {
			   nbEquipements++;
		   }
	   }
	   return nbEquipements;
   }
   public void sEquiper(Equipement equipementss)
   {
	   cnbEquipements(equipements);
	   switch (nbEquipements)
	   {
	   case 2:
		   System.out.println("Le soldat"+nom+"est déjà bien protégé !");
		   break;
	   case 1:
		   if (equipements[0]==equipementss)
		   {
			   System.out.println("Le soldat Minus possède déjà un"+equipementss+" !");
			   break;
		   }
		   else
		   {
			   equipements[1]=equipementss;
			   System.out.println("Le soldat Minus s’équipe avec un "+equipementss+" .");
			   break;
		   }
	   case 0:
		   equipements[0]=equipementss;
		   System.out.println("Le soldat Minus s’équipe avec un "+equipementss+" .");
		   break;
	   }
   }
   public String getnom()
   {
	   return nom ;
   }
   public static void main(String[] args) {
	Romain minus = new Romain ("minus",6);
	 minus.sEquiper(Equipement.CASQUE);
	    minus.sEquiper(Equipement.CASQUE);
	    minus.sEquiper(Equipement.BOUCLIER);
	    minus.sEquiper(Equipement.CASQUE);
}
}
