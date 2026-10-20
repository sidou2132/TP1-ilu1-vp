package personnage;

public class Druide {
	private String nom;
	private int force ;
	private chaudran chaudran ;
	public Druide (String nom,int force,chaudran chaudran) 
	{
		this.nom=nom;
		this.force=force;
		this.chaudran=chaudran;
	}
	private String prendreParole() 
	{
	    return "Le Druide " + nom + " : ";
	}
	public String getnom()
	{
		return nom ;
	}
	public void parler(String texte)
	{
		System.out.println(prendreParole()+"\""+texte+"\"");
	}
	public void fabriquer(int quantitePotion,int forcePotion)
	{
		chaudran.remplirChaudran(quantitePotion,forcePotion);
		parler("jai conocte "+quantitePotion+" doses de potion magique elle a force de "+forcePotion+".");
	}
	public void booster(Gaulois gaulois)
	{
		if (chaudran.resterPotion()==true) 
		{
			if (gaulois.getnom().equals("obelix"))
			{
				parler("non, "+gaulois.getnom()+" non !... Et tu le sais tres bien !");
			}
			else
			{
				gaulois.boirPotion(chaudran.prendreLouche());
				parler("Tiens "+gaulois.getnom()+" un peu de potion magique ");
			}
		}
		else
		{
			parler("desole "+gaulois.getnom()+" il n'y a plus une seule goutte de potion");
		}
	}
}
