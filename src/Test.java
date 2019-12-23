/*import java.util.ArrayList;

import java.util.ArrayList;

public class ProductOfStoreowner {
protected
 String name;
 String category;
 String price;
 String productquantity;
 String brandname;
 String brandcategory;

   ArrayList<ProductOfStoreownerEntity> ProductOfStoreownerDatabase = new ArrayList<ProductOfStoreownerEntity>();
   
public ProductOfStoreowner(String Pname,String Pcategory,String Pprice,String bname,String bcategory, String productquantity) throws Exception {
   this.name=Pname;
   this.category=Pcategory;
   this.price=Pprice;
   this.productquantity=productquantity;
   this.brandname=bname;
   this.brandcategory=bcategory;
   
   ProductOfStoreownerDatabase = FileUsage.product_sOwnerReadFromFile(ProductOfStoreownerDatabase);
}
public ProductOfStoreowner() throws Exception {
	 ProductOfStoreownerDatabase = FileUsage.product_sOwnerReadFromFile(ProductOfStoreownerDatabase);
}

public void addstoreproductinfo( String pname, String pcategory,String pprice,String bname,String bcategory,String pproductquantity) throws Exception {
   
	boolean FoundinSystem1=false;
	boolean FoundinSystem2=false;
	System.out.println("Precheck1");
	for(int i = 0; i < new product().prodctDatabase.size() ; i++) {
		System.out.println("check1");
	   if((pname.equals(new product().prodctDatabase.get(i).getName())) &&
	     (pcategory.equals(new product().prodctDatabase.get(i).getCategory()) 
	    		 && pprice.equals(new product().prodctDatabase.get(i).getPrice())))
	     {
		      FoundinSystem1=true;
		 }
	}
	System.out.println("Precheck2");
	for(int j = 0; j < new Brand().BrandDatabase.size() ; j++) {
		System.out.println("check2");
		   if((bname.equals(new Brand().BrandDatabase.get(j).getBrandName())) && 
		     (bcategory.equals(new Brand().BrandDatabase.get(j).getBrandCategory())))
		     {
			      FoundinSystem2=true; 
			      
			 }
		}
	
	if(FoundinSystem1==false || FoundinSystem2==false ) {
		System.out.println("The Product or Brand is not found in system");
		return;
	} 
	System.out.println("Precheck3");
     if(FoundinSystem1==true & FoundinSystem2==true) {
    	 System.out.println("check3");
    	for(int k = 0; k < ProductOfStoreownerDatabase.size() ; k++) {	       
	          if(ProductOfStoreownerDatabase.get(k).getName().equals(pname) & ProductOfStoreownerDatabase.get(k).getBrandName().equals(bname) & bcategory==pcategory) {
	   		   System.out.print("this product is already added with this brand  \n");
	   		   return;
	   	      }
    	 }
	   FileUsage.usingBufferedWritter(pname + "|" + pcategory + "|" + pprice   + "|" + bname + "|" + bcategory + "|" + pproductquantity,"ProductsOfStoreowner.txt");
	    System.out.println("Product is added to store with a brand");
	  }
   }
}
	   
   


*/


