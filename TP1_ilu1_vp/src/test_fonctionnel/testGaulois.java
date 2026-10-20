package test_fonctionnel;
import personnage.Gaulois;
import personnage.chaudran;
import personnage.Druide;
import personnage.Romain;
public class testGaulois {
	public static void main(String[] args) {
	//personnage-gaulois
Gaulois asterix = new Gaulois ("asterix",8);
Gaulois obelix = new Gaulois ("obelix",16);
asterix.parler("Bonjour obelix");
obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
asterix.parler("oui tres bonne idee .");
System.out.println("Dans la forêt Astérix et Obélix tombent nez à nez sur le romain Minus.");
   //personnage-romain
Romain minus= new Romain ("minus",6);
for (int i=0;i<3;i++) 
{
	asterix.frapper(minus);
}
  //personnage-druide
chaudran chaudran = new chaudran(0, 0);
Druide panoramix=new Druide ("panoramix",2,chaudran);
panoramix.fabriquer(4, 3);
obelix.boirPotion(3);
asterix.boirPotion(3);
  //personnage-brutus
Romain brutus =new Romain("brutus",14);
for (int i=0;i<3;i++)
{
	asterix.frapper(brutus);
}



	}

}
