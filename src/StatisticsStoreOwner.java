
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class StatisticsStoreOwner {
	public StatisticsStoreOwner() throws Exception {
        super();
     }
	@SuppressWarnings("resource")
	public void usersstatistics() throws Exception{
		 BufferedReader br = new BufferedReader(new FileReader(new File("count.txt")));
     	 String line;
     	 line = br.readLine();
     	 System.out.println("Number of Users viewed the products is: " + line);
     	 BufferedReader br2;
     	 br2 = new BufferedReader(new FileReader("NumberBoughtProduct.txt"));
     	 String line4;
     	 line4 = br2.readLine();
     	 System.out.println("Number of users buy product is: " +line4);
	}

}


