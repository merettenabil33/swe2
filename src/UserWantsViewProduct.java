
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class UserWantsViewProduct {
	public UserWantsViewProduct() throws Exception {
        super();
    }
	
	@SuppressWarnings("resource")
	public void wantstoviewproduct() throws Exception {
		int count=0;
		BufferedReader bro;
		bro = new BufferedReader(new FileReader("count.txt"));
    	String line1;
    	line1 = bro.readLine();
    	bro.close();
        count = Integer.parseInt(line1);
		count++;
		line1 = Integer.toString(count);
		File file = new File ("count.txt");
		FileWriter w = new FileWriter(file);
		w.write(line1);
		w.close();
		BufferedReader br = new BufferedReader(new FileReader(new File("ProductsOfStoreowner.txt")));
    	String line;
    	while((line = br.readLine()) != null) {
    		System.out.println(line);
	     }
	}
}


