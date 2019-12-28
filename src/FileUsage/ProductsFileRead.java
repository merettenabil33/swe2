package FileUsage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ProductsFileRead {

	
	   @SuppressWarnings("resource")
	public static ArrayList<ProductEntity> productReadFromFile(ArrayList<ProductEntity> products) throws Exception {
		   	BufferedReader reader = new BufferedReader(new FileReader(new File("Products.txt")));
		   	String line;
		   	while((line = reader.readLine()) != null) {
		   		String[] arr = line.split("\\|");
		   		products.add(new ProductEntity(arr[0], arr[1], arr[2], arr[3]));
		   	}
				return products;
		   }
	   
}
