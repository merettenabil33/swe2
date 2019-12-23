
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class numberOfBoughtProducts {
	public numberOfBoughtProducts() throws Exception {
        super();
    }
	public void numberof_addedProducts() throws Exception {
		int count=0;
		BufferedReader br;
		br = new BufferedReader(new FileReader("NumberBoughtProduct.txt"));
		String line1;
		line1 = br.readLine();
		br.close();
	    count = Integer.valueOf(line1);
		count++;
		line1 = Integer.toString(count);
		File file = new File ("NumberBoughtProduct.txt");
		FileWriter w = new FileWriter(file);
		w.write(line1);
		w.close();
		
    }
}

