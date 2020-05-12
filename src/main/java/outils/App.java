package outils;

import java.util.ArrayList;
import outils.Personne;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
    	ArrayList<Personne> liste_personne = new ArrayList<Personne>() {{
    		new Personne("HAUPE", "Isuru");
			new Personne("MAZET", "Adrien");
			new Personne("AUDO", "Thomas");
			new Personne("GRANTENS", "Maxime");}};
			
		for (Personne personne : liste_personne) {
			System.out.println(personne.toString());
		}
    }
}
