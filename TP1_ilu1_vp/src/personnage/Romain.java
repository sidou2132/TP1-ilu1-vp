package personnage;

public class Romain
{
	private String nom;
	private int force;
public Romain(String nom,int force) 
{
	this.nom = nom;
	this.force=force;
}
   public void recevoirCoup(int forceCoup )
   {
	   
	   force=force-forceCoup;
	   if (force>0)
	   {
		   System.out.println("le Romain"+nom+": \"aie\"");
		   
	   }
	   else
	   {
		   System.out.println("le Romain"+nom+": \"jabandonne !\"");
	   }
   }
   public String getnom()
   {
	   return nom ;
   }
}
