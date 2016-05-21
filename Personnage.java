package Jeu;

import java.util.ArrayList;
import java.util.Scanner;

public class Personnage {
	
	public static final int pointEXpMIN = 1;
	
    public static final int pointEXpMAX = 20;

	
	    protected String Nom;
	   
	    protected double Force;

	    protected double Dexterite;

	    protected double Intelligence;
	   
	    protected double Concentration;
	    
	    protected int Vitalite;

	    protected int pointEXp;
		   	   
	    protected ArrayList<capacite> Tcapacite = new ArrayList<capacite> ();
	    
	    
	    
	    
	    public Personnage(){
	    	this.Nom ="x";
	    	this.Force = 0;
	    	this.Dexterite = 0;
	    	this.Intelligence = 0;
	    	this.Concentration = 0;
	    	this.Vitalite = 0;
	    	this.pointEXp = pointEXpMIN;
	    	this.Tcapacite = new ArrayList<capacite> ();
				    	
	    }

	   
	    
	 // creation d'un personnage methode en init 
	    	    
	      
	    public void initPerso() {
	    	
	    	
	    	
	    	// init interactive du Personnage en Scanner des attributs
	    	
	    	
	    	
	    	
			Scanner in = new Scanner(System.in);
	    	
	    		//reponse nom 
	    	
	    	String dbtN = this.Nom;  
	    	do{
	    		String R_nom;
	    		System.out.println("Saisissez le nom de votre Personnage : \n");
	    		R_nom = in.next();
	    		this.Nom=R_nom; 
		    			
	    	} while(this.Nom.equals(dbtN)); // verrifier que le nom n'est pa le meme que par defaut
	    	
	    	   // reponse force
	    	
	    	do{
	    			double R_force ;
	    			System.out.println("Saisissez le nombre de force : \n");
			    	
	    			 R_force = in.nextDouble();
			    
			    this.Force = R_force;
	    			
	    		} while(this.Force == 0);
	    		
	    	
	    	
	    	
	    	  // reponse dexterite 

	    	do{
    			double R_dex ;
    			System.out.println("Saisissez le nombre de dexterite : \n");
		    	
    			 R_dex = in.nextDouble();
		    
		    this.Dexterite = R_dex;
    			
    		} while(this.Dexterite == 0);
    		
	    	
	    	// reponse intelligence 
	    	
	    	do{
    			double R_inte ;
    			System.out.println("Saisissez le nombre d'intelligence : \n");
		    	
    			 R_inte = in.nextDouble();
		    
		    this.Intelligence = R_inte;
    			
    		} while(this.Intelligence == 0);
	    	
	    	
	    	
	    	// reponse concentration
	    	
	    	do{
    			double R_conce ;
    			System.out.println("Saisissez le nombre de concentration : \n");
		    	
    			 R_conce = in.nextDouble();
		    
		    this.Concentration = R_conce;
    			
    		} while(this.Concentration == 0);
	    	
	    
	    
	    	System.out.println("Personnage Créé");
	
	    		
	    }
	    
	       
	    
	    
	    
	    

		    
	    // NOM methodes
		    
	    				public String getNom(){
					    	  
					    	 return this.Nom;
					     }
					  
					     public void setNom(String value){
					    	  
					    	 this.Nom=value;
					     }
		  
		     
					     
		// Force methodes
					     
					     
					     public double getForce() {
						        
						        return this.Force;
						    }
					     
				
					     public void setForce(double value) {
						        
						        this.Force = value;
						    }
	
		     
		     
		 
						    
	    // Dexterite methodes
			    
			    
				public double getDexterite() {
			        
			        return this.Dexterite;
			    }
	
			    public void setDexterite (double value) {
			        
			        this.Dexterite = value;
			    }
			    
			    
			    
			    
	       //Concentration methodes
			    
			    		public double getConcentration() {
					        
					        return this.Concentration;
					    }
			
					    public void setNbConcentration (double value) {
					        
					        this.Concentration = value;
					    } 
					    
					    
					    
			    
			//Intelligence methodes
			    
					    public double getIntelligence() {
					        
					        return this.Intelligence;
					    }
				
					    public void setIntelligence(double value) {
					        
					        this.Intelligence = value;
					    }
					    
					    

					    
			// vitalite methodes
					    
					    public int getVitalite() {
					        
					        return this.Vitalite;
					    }
				
					    public void setVitalite(int value) { //JAMAIS  UTILISE sauf initDuel()
					        
					        this.Vitalite = value;
					    }

					    
	 

					    
		 //EXp methodes		    
					    
					    public int getPointEXp() {
					       
					        return this.pointEXp;
					    }
				
					    
					
					    public void setPointEXp(int value) {
					        int EXp = this.pointEXp ;
					        int nouvEXp =EXp + value  ; 
					    	   	if ( (1<=EXp && EXp<=20) && (1 <= value && value <= 20) && ( 1<=nouvEXp && nouvEXp <=20) )
					    	   		{
					    	    		// si l'EXP est entre 1 et 20 et que la valeur donner aussi ,la nouvelle valeur doit se contenir entre les extremum 
					    	   		this.pointEXp=(EXp + value) ; /*rajouter la nouvelle valeur a pointEXp*/
					    	   		}
					    	   	else 
					    	   		System.out.println("erreur");
				
					    }
					    
					    
			//Tcapacite  methodes
					    
					    /*A faire*/
					        
					    
					    
					    
			// sauvegarde methode
					    
					   /* a faire */
					    
					    
			 //methode toString
					    
					    public String toString(){
					    	String s;
					    	s ="      "+this.Nom+"\n"+
					    	"--------------------"+"\n"+
					    	"Force : "+this.Force+"\n"+
					    	"Dexterite : "+this.Dexterite+"\n"+
					    	"Intelligence : "+this.Intelligence+"\n"+
					    	"Concentration : "+this.Concentration+"\n"+
					    	"EXp : "+this.pointEXp+"\n"+
					    	"Vie : "+this.Vitalite+"\n"
					    			;
					    	
					    	return s;
					    }
	    
	    

	}

	
	
	
	

