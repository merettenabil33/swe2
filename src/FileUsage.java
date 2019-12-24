import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileUsage {
	public static void usingBufferedWritter(String textToAppend,String FileName) throws IOException 
	{
	    BufferedWriter writer = new BufferedWriter(new FileWriter(FileName, true));
	    writer.write(textToAppend);  
	    writer.newLine();   //Add new line
	    writer.close();
	}

	   @SuppressWarnings("resource")
	public static ArrayList<UserEntity> userReadFromFile(ArrayList<UserEntity> user,String FileName) throws Exception {
	   	BufferedReader reader = new BufferedReader(new FileReader(new File(FileName)));
	   	String line;
	   	while((line = reader.readLine()) != null) {
	   		String[] arr = line.split("\\|");
	   		user.add(new UserEntity(arr[0], arr[1]));
	   	}
			return user;
	}
	   
	   
	   @SuppressWarnings("resource")
	public static ArrayList<BrandEntity>brandRreadFromFile(ArrayList<BrandEntity> Brands) throws Exception{
			BufferedReader reader = new BufferedReader(new FileReader(new File("Brands.txt")));
			String line;
			while((line = reader.readLine()) != null) {
				String[] arr = line.split("\\|");
				Brands.add(new BrandEntity(arr[0], arr[1]));
			}
			return Brands;
		}

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
	   
	   @SuppressWarnings("resource")
	public static ArrayList<ProductOfStoreownerEntity> product_sOwnerReadFromFile(ArrayList<ProductOfStoreownerEntity> productstore,String FileName) throws Exception{
			BufferedReader reader = new BufferedReader(new FileReader(new File(FileName)));
			String line;
			while((line = reader.readLine()) != null) {
				String[] arr = line.split("\\|");
				productstore.add(new ProductOfStoreownerEntity(arr[0], arr[1], arr[2], arr[3], arr[4],arr[5],arr[6]));
			}
			return productstore;
		}
		   
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