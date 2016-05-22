package Jeu;
import Jeu.Personnage;
import Jeu.Arena;

public class TestArena {

	public static void main(String[] args) {
		
		Personnage a = new Personnage();
		Personnage b = new Personnage();
		b.initPerso();
		
		Arena arene = new Arena();
		arene.addPerso(a);	
		arene.addPerso(b);	
		int nb = arene.getnbPerso();
		System.out.println(nb);
		System.out.println(arene.toString());
		
	}

}
