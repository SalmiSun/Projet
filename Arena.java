package Jeu;

import java.util.ArrayList;


public class Arena {
	
	 public static int nbPerso = 0 ;
	
	 private ArrayList<Personnage> arena = new ArrayList<Personnage> ();
	 
	 
	 
	 
	 // methode recupere l'arraylist

	public ArrayList<Personnage> getArena() {
		return arena;
	}
	
	
	
	// methode return l'arraylist

	public void setArena(ArrayList<Personnage> arena) {
		this.arena = arena;
	}
	
	// methode addPerso
	public void addPerso(Personnage Perso){
		this.arena.add(Perso);
		Arena.nbPerso ++;
	
		
	}

	

	// methode showAllPerso
	
	
	
	
	// (seul) methode nbPerso
	// return le nombre de personnage ajouter
	public int getnbPerso() {
		return nbPerso;
			
	}
	
	// tostring de chaque personnage de l'arena
	public String toString(){
		String s=" \n";
		for (int i = 0; i < arena.size(); i++) {
			s = s +("Personnage "+(i+1)+" \n\n");
            s = s +(arena.get(i).toString());
            s = s + ("            \n");
			}
	
		
		s=s+("fin des participants de l'Arena");
		return s;
		
	}
	
	//methode choosePerso
	public Personnage getPerso_in(String nomP){
		Personnage p= null;
		for (int i = 0; i < arena.size(); i++) {
			if (arena.get(i).getNom().equals(nomP))
				{
				p = arena.get(i);
				}
		}
			if (p==null){
				System.out.println("pointer null, pas de personnage avec ce nom !!");
			
			}
			return p;
		}

}
