package FileUsage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class StoresFilesRead {

	   @SuppressWarnings("resource")
		public static ArrayList<StoreEntity> storeReadFromFile(ArrayList<StoreEntity> store) throws Exception{
			   	BufferedReader reader = new BufferedReader(new FileReader(new File("Store.txt")));
			   	String line;
			   	while((line = reader.readLine()) != null) {
			   		String[] arr = line.split("\\|");
			   		store.add(new StoreEntity(arr[0], arr[1], arr[2],arr[3]));
			   	}
					return store;
		}
		   
}
