package tableaux;

public class TestTableau {
public static void main(String[] args) {
	int[] tableauEntiers = { 5, 7, 2, 5, 3 };
	String[] tableauChaines = new String[5];
	System.out.println(tableauEntiers);
	
	
	
	for (int entier : tableauEntiers)
	{
		System.out.print(entier+" ");
	}
	System.out.println(" ");
	
	
	
	for (int i=0;i<tableauEntiers.length;i++)
	{
		int entier=tableauEntiers[i];
		System.out.print(entier+" ");
	}
	System.out.println(" ");
	
	
	
	for (int i = 0; i < tableauEntiers.length; i++) {
		int entier = tableauEntiers[i];
		System.out.print(entier);
		if (i < tableauEntiers.length - 1) {
		System.out.print(", ");
		}
		}
	System.out.println(" ");
	
	
	for (String chaine : tableauChaines)
	{
		System.out.print(chaine+" ");
	}
	System.out.println(" ");
	
	
	String [] tableauChaines2 = new String[5];
	int nbChaines=0;
	tableauChaines2[nbChaines]="hello";
	nbChaines ++;
	tableauChaines2[nbChaines]="world";
	nbChaines ++;
	for (int i = 0; i < nbChaines; i++) {
	    System.out.print(tableauChaines2[i] + " ");
	}
	System.out.println(" ");
	
	
	
	for (String chaines : tableauChaines2)
	{
		if (chaines !=null)
		{
			System.out.print(chaines+" ");
		}
	}
	
	
}
}
