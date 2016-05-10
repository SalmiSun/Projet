public Class Personnage{
	private String NomPersonnage;
	private int NbForce;
	private int NbDexterite;
	private int NbIntelligence;
	private int NbVitalite;
	private int NbExperience;
	
	
public Personnage(){
		this.NomPersonnage="Default";
		this.NbForce=0;
		this.NbDexterite=0;
		this.NbIntelligence=0;
		this.NbVitalite=0;
		this.NbExperience=1;
}
	
public void CreationPersonnage(){
		this.NomPersonnage="Default";
		this.NbForce=0;
		this.NbDexterite=0;
		this.NbIntelligence=0;
		this.NbVitalite=0;
		this.NbExperience=1;
}
	
public void initCreePerso(String n, int f, int d, int i, int v){
	Scanner input = new Scanner(System.in);
		
	System.out.println("Saisissez votre nom : \n");
	this.NomPersonnage = input.nextFloat();
	
	System.out.println("Saisissez le nombre de force : \n");
	this.NbForce = input.nextFloat();
		
	System.out.println("Saisissez le nombre de dexterite : \n");
	this.NbDexeterite = input.nextFloat();
		
	System.out.println("Saisissez le nombre d'intelligence : \n");
	this.NbIntelligence = input.nextFloat();
		
	System.out.println("Saisissez le nombre de concentration : \n");
	this.NbConcentration = input.nextFloat();
	}
	
