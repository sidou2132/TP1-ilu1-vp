package personnage;

public class Romain
{
	private String nom;
	private int force;
public Romain(String nom,int force) 
{
	this.nom = nom;
	this.force=force;
	assert isInvariantVerified();
}
private boolean  isInvariantVerified()
{
	return force>=0;
}

   public void recevoirCoup(int forceCoup )
   {
	   
	   assert isInvariantVerified();
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
   }
   public String getnom()
   {
	   return nom ;
   }
   public static void main(String[] args) {
	Romain minus = new Romain ("minus",6);
}
}
