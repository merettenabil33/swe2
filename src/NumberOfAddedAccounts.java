
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class NumberOfAddedAccounts {
	public NumberOfAddedAccounts() throws Exception {
        super();
    }
	public void numberOf_addedUsersAccounts() throws Exception {
		int count=0;
		BufferedReader br;
		br = new BufferedReader(new FileReader("NumberOfAddedUsersAccounts.txt"));
    	String line1;
    	line1 = br.readLine();
    	br.close();
        count = Integer.valueOf(line1);
		count++;
		line1 = Integer.toString(count);
		File file = new File ("NumberOfAddedUsersAccounts.txt");
		FileWriter w = new FileWriter(file);
		w.write(line1);
		w.close();
    }
	
	public void numberOf_addedStoreOwnerAccounts() throws Exception {
		int count=0;
		BufferedReader br;
		br = new BufferedReader(new FileReader("NumberOfAddedStoreOwnerAccounts.txt"));
    	String line1;
    	line1 = br.readLine();
    	br.close();
        count = Integer.valueOf(line1);
		count++;
		line1 = Integer.toString(count);
		File file = new File ("NumberOfAddedStoreOwnerAccounts.txt");
		FileWriter w = new FileWriter(file);
		w.write(line1);
		w.close();
    }
}

