package personnage;

public class chaudran {
private int quantitePotion;
private int forcePotion;
public chaudran (int quantitePotion,int forcePotion)
{
	this.quantitePotion=quantitePotion;
	this.forcePotion=forcePotion;
}
public boolean resterPotion ()
{
	return quantitePotion>0;
}
public void  remplirChaudran(int quantitePotion,int forcePotion)
{
this.quantitePotion=quantitePotion;
this.forcePotion=forcePotion;
}
public int prendreLouche()
{
	quantitePotion--;
	if (quantitePotion<0) 
	{
		quantitePotion=0;
	}
	return forcePotion;
}
}
