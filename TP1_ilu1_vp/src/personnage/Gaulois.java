package personnage;

public class Gaulois {
private String nom ;
private int force;
private int effetPotion=1;
public Gaulois (String nom,int force) 
{
	this.nom=nom;
	this.force=force;
	
}
private String prendreParole() 
{
    return "Le Gaulois " + nom + " : ";
}
public void parler(String texte)
{
	System.out.println(prendreParole()+"\""+texte+"\"");
}
public void frapper(Romain romain ) 
{
	System.out.println(nom+"envoie un coup dans la machoir de "+romain.getnom());
	int forceCoup=force*effetPotion/3;
	romain.recevoirCoup(forceCoup);
	if (effetPotion>1)
	   {
		   effetPotion--;
	   }
}
public String getnom()
{
	   return nom ;
}
public void boirPotion(int forcePotion)
{
	this.effetPotion=forcePotion;
}
}
