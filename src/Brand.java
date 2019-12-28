import java.io.IOException;
import java.util.ArrayList;

import FileUsage.BrandEntity;
import FileUsage.FileWrite;
import FileUsage.BrandsFileRead;

@SuppressWarnings("unused")
public class Brand {
	
	private
	String bname;
    String bcategory;
    
   ArrayList<BrandEntity> BrandDatabase = new ArrayList<BrandEntity>();
   public Brand(String Bname,String Bcategory) throws Exception {
   this.bname=Bname;
   this.bcategory=Bcategory;
   
   
   BrandDatabase = BrandsFileRead.brandRreadFromFile(BrandDatabase);
}
public Brand() throws Exception {
	
	   BrandDatabase = BrandsFileRead.brandRreadFromFile(BrandDatabase);

}

public void addBrandinfo( String Bname, String Bcategory) throws IOException {
   for(int i = 0; i < BrandDatabase.size(); ++i) {
	   if(BrandDatabase.get(i).getBrandName().equals(Bname)) {
		   System.out.print("this Brand is found");
		   return;
	   }
   }
   
   FileWrite.usingBufferedWritter(Bname + "|" + Bcategory , "Brands.txt");
   System.out.println("Brand is added");
}

}


