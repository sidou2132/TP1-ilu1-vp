package personnage;

public class Village {
	private String nom;
	private int nbVillageois=0;
	private int nbmVillageois;
	private Gaulois nomChef;
	private Gaulois[] villageois;
	public Village (String nom ,Gaulois nomChef,int nbmVillageois )
	{
		
		this.nom=nom;
		this.nbVillageois=0;
		this.nbmVillageois=nbmVillageois;
		this.nomChef=nomChef;
		this.villageois = new Gaulois[nbmVillageois];
	}
	public String getnom()
	{
		return nom ;
	}
	public Gaulois getchef()
	{
		return nomChef;
	}
	public void ajouterVillageois(Gaulois gaulois)
	{
		if (nbVillageois<nbmVillageois)
		{
			villageois[nbVillageois]=gaulois;
			nbVillageois++;
			gaulois.setVillage(this);
		}
		else
		{
			System.out.println("le village est blindé");
		}
	}
	public Gaulois trouverVillageois(int nmrVillageois)
	{
		
		
			if (nmrVillageois>0 && nmrVillageois<=nbVillageois)
			{
				return villageois[nmrVillageois-1];
			}
			else
			{
			   System.out.println("Il n’y a pas autant d'habitants dans notre village !");
			}
			return null ;
		
	}
	public void afficherVillageois ()
	{
		System.out.println("dans le village de : "+nom+"du chef: "+nomChef);
	for (int i=0;i<nbVillageois;i++)
	{
		System.out.println(villageois[i]);
	}
	}
	public void sePresenter (Gaulois gaulois)
	{
		if (gaulois==nomChef)
		{
			System.out.println("Le Gaulois "+gaulois+" : \"Bonjour, je m'appelle "+gaulois+". suis le chef le village : " +nom+".\"");
		}
		else
		{
			int compteur = 0;

	        for (int i = 0; i < nbVillageois; i++) {
	            if (villageois[i] == gaulois) {
	                compteur++;
	            }
	        }

	        if (compteur == 1) {
	            System.out.println("Le Gaulois " + gaulois
	                + " : \"Bonjour, je m'appelle " + gaulois
	                + ". J'habite le village : " + nom + ".\"");
	        } else {
	            System.out.println("Le Gaulois " + gaulois
	                + " : \"Bonjour, je m'appelle " + gaulois
	                + ". Je voyage de villages en villages.\"");
	        }
		}
	}
	public static void main(String[] args)
	{
		
		Gaulois Abraracourcix=new Gaulois("Abraracourcix",6);
		Village village = new Village("Village des Irréductibles",Abraracourcix,30);
		village.trouverVillageois(30);
		Gaulois asterix = new Gaulois ("asterix",8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillageois();
		village.sePresenter(Abraracourcix);
		village.sePresenter(asterix);
		Gaulois Doublepolémix= new Gaulois("Doublepolémix",5);
		village.sePresenter(Doublepolémix);
		
	}
	}
