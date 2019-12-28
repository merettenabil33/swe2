package FileUsage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class brandsFileRead {

	
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

}
