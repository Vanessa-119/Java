import java.util.ArrayList;

public class TestProject {

	public static void main(String[] args) {
		Appel ap4=new Appel(1,"65545");
		Appel ap1=new Appel(2,"22121");
		Appel ap2=new Appel(3,"555");
		Appel ap3=new Appel(4,"5555");
		ArrayList<Appel>appel=new ArrayList<Appel>();
		
		appel.add(ap1);
		appel.add(ap2);
		appel.add(ap3);


	Client client =new Client("vanessa","mell","44444",appel);
	Client client1 =new Client("sweet","meliul","455544",appel);
	
	
	System.out.println(client.readClientStock());

	
//	System.out.println(client.ajoutClient() );
//	System.out.println(client1.ajoutClient() );
 
	
	
	

	}

}
