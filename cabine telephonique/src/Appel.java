import java.util.Scanner;

public class Appel {
	
	int numap;
	String numeroAppelle;
	int [] heuredebut=new int[2];
	int [] heurefin=new int [2];
	Client testclient;
	int taxe=1;
	Scanner clavier=new Scanner(System.in);
	
	
	public Appel() {
		
	}
	


	

	public Appel(int numap, String numeroAppelle) {
		super();
		this.numap = numap;
		this.numeroAppelle = numeroAppelle;
	}





	public Appel(int[] heuredebut, int[] heurefin) {
		
		this.heuredebut = heuredebut;
		this.heurefin = heurefin;
	}



	public int montant (Appel appel) {
		System.out.println("l'appel est taxe a 1f la seconde");
		System.out.println("veillez entrer l'heure de debut de l'appel.");
		appel.heuredebut[1]=clavier.nextInt();
		appel.heuredebut[1]=clavier.nextInt();
		
		System.out.println("veillez entrer l'heure de fin de l'appel.");
		appel.heurefin[1]=clavier.nextInt();
		appel.heurefin[1]=clavier.nextInt();
		System.out.println();
		int durre=(360*appel.heurefin[1]+60*appel.heurefin[1])-(360*appel.heuredebut[1]+60*appel.heuredebut[1]);
		 taxe = durre*taxe;
		 System.out.println("vous avec fais : "+durre+ "s\n");
		 System.out.println("le montant de l'appel est:" +taxe+" fcfa");

		 return   1;
		 		 
		
	
			
	}
		public String toString() {
			return ""+numap+";"+numeroAppelle+"";
//			return "l'heure de debut est "+heuredebut[1]+"h "+heuredebut[1]+ " min et l'heure de fin est "+heurefin[1]+"h "+heurefin[1]+"min";
		}
	
	

}









