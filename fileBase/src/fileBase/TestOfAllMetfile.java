package fileBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class TestOfAllMetfile {

	public static void main(String[] args) {
		
		//fonction pour creer un fichier
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
		// fonction pour ecrire dans un fichier
		try {
		      FileWriter myWriter = new FileWriter("Client.txt");
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		//fonction pour lire un fichier
		 try {
		      File myObj = new File("Client.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 //fuction pour suprimer le contenu d'un fichier 
		 File myObj = new File("Client.txt");
		    if (myObj.exists()) {
		      System.out.println("File name: " + myObj.getName());
		      System.out.println("Absolute path: " + myObj.getAbsolutePath());
		      System.out.println("Writeable: " + myObj.canWrite());
		      System.out.println("Readable " + myObj.canRead());
		      System.out.println("File size in bytes " + myObj.length());
		    } else {
		      System.out.println("The file does not exist.");
		    }
		   
		    // fonction pour suprimer un dossier
		        File myObjk = new File("filename.txt"); 
		        if (myObjk.delete()) { 
		          System.out.println("Deleted the file: " + myObj.getName());
		        } else {
		          System.out.println("Failed to delete the file.");
		        } 
		        
		            File myObjc = new File("C:\\sweet\\Client.txt"); 
		            if (myObjc.delete()) { 
		              System.out.println("Deleted the folder: " + myObj.getName());
		            } else {
		              System.out.println("Failed to delete the folder.");
		            } 
		            
		            int x, y, sum;
		            Scanner myObj1 = new Scanner(System.in); // Create a Scanner object
		            System.out.println("Type a number:");
		            x = myObj1.nextInt(); // Read user input

		            System.out.println("Type another number:");
		            y = myObj1.nextInt(); // Read user input

		            sum = x + y;  // Calculate the sum of x + y
		            System.out.println("Sum is: " + sum); // Print the sum
		          }


	 {
		  try {
		    
//		    Path file = Paths.get("C:\\Users\\PC\\Desktop\\file.txt");
			  File file =new File("");
		    BasicFileAttributeView attr = Files.getAttribute(file, creationTime);
		    System.out.println("Date de création: " + attr.creationTime());
		    System.out.println("Date du dernier accès: " + attr.lastAccessTime());
		    System.out.println("Date derniere modification: " + attr.lastModifiedTime());
		    
		    } catch (IOException e) {
		      System.out.println(e.getMessage());
		    }
		    }
	}


