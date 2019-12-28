package FileUsage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class BuyedProductsFileRead {

	   @SuppressWarnings("resource")
	public static ArrayList<BuyedProductEntity> buyed_productReadFromFile(ArrayList<BuyedProductEntity> buyedProduct) throws Exception{
		   BufferedReader reader = new BufferedReader(new FileReader(new File("BuyedProduct.txt")));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] arr = line.split("\\|");
				buyedProduct.add(new BuyedProductEntity(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5],arr[6]));
			}
			return buyedProduct;
		}
	
	   
}
