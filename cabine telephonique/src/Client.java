import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Client {

	String nom;
	String prenom;
	String numero;
	ArrayList <Appel> appel=new ArrayList <Appel>();
	Appel newappel;
	
	
	public Client(String nom, String prenom,String numero, ArrayList<Appel> appel) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.numero=numero;
		this.appel = appel;
	}

	
	

		
	 public String createFileClient() {
	 	try {
	 	      File myObj = new File("C:\\sweet\\Client.txt");
	 	      if (myObj.createNewFile()) {
	 	        System.out.println("File created: " + myObj.getName());
	 	      } else {
	 	        System.out.println("File already exists.");
	 	      }
	 	    } catch (IOException e) {
	 	      System.out.println("An error occurred.");
	 	      e.printStackTrace();
	 	    }
	 	return "";
	 	}
	 	public String ajoutClient() {
	 	try {
	 	      FileWriter stockClient = new FileWriter("Client.txt");
	 	      
	 	      stockClient.write("le nom du client est: "+this.nom+" son prenom: "+this.prenom+" numero= "+this.numero+" sa liste d appel "+appel);
	 	      stockClient.close();
	 	      System.out.println("Successfully wrote to the file.");
	 	    
	 	      }
	 	      catch (IOException e) {
	 	      System.out.print("An error occurred.");
	 	      e.printStackTrace();
	 	    }
		return "";
	 	}
	 	
	 public String readClientStock() {
	 	try {
	 		 File myObj = new File("C:\\sweet\\Client.txt");
	 	      Scanner myReader = new Scanner(myObj);
	 	      while (myReader.hasNextLine()) {
	 	        String reader = myReader.nextLine();
	 	        System.out.println(reader);
	 	      }
	 	      myReader.close();
	 	    } catch (FileNotFoundException e) { 
	 	      System.out.println("An error occurred.");
	 	      e.printStackTrace();
	 	    }

	 	return "";
	 	

	 }
	 public void deleteFileClient() {
	 		File myObj = new File("C:\\sweet\\Client.txt"); 
	 		 if (myObj.delete()) { 
	 			System.out.println("Deleted the file: " + myObj.getName());
	 		} 
	 		 else {
	 				System.out.println("Failed to delete the file.");
	 		 		} 
	 		
	     
	 }
	 public String toString1() {
		 String reading;
		 reading=appel.toString();
		 return "voici la liste de "+this.nom+ "" +reading;
		 }
		
	 
	
	}
		 
		
	 
	 
	
	

