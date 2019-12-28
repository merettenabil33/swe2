package FileUsage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ProductsOfStoreOwnerFileRead {
	
	   @SuppressWarnings("resource")
		public static ArrayList<ProductOfStoreownerEntity> product_sOwnerReadFromFile(ArrayList<ProductOfStoreownerEntity> productstore,String FileName) throws Exception{
				BufferedReader reader = new BufferedReader(new FileReader(new File(FileName)));
				String line;
				while((line = reader.readLine()) != null) {
					String[] arr = line.split("\\|");
					productstore.add(new ProductOfStoreownerEntity(arr[0], arr[1], arr[2], arr[3], arr[4],arr[5],arr[6],arr[7]));
				}
				return productstore;
			}
			   
}
