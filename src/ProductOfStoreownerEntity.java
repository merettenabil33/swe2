
public class ProductOfStoreownerEntity {
	private String storeOwnerName;
	private String storename;
	private String category;
	private String price;
	private String name;
	private String productquantity;
	private String brandname;
	private String brandcategory;
	
	public ProductOfStoreownerEntity(String storeOwnerName,String storename,String name, String category, String price ,String brandname,String brandcategory,String pproductquantity ) {
		this.storeOwnerName = storeOwnerName;
		this.storename = storename;
		this.name = name;
		this.category = category;
		this.price = price;
		this.productquantity = pproductquantity;
		this.brandname = brandname;
		this.brandcategory = brandcategory;
	}
	
	public String getStoreOwnerName() {
		return storeOwnerName;
	}

	public void setStoreOwnerName(String storeOwnerName) {
		this.storeOwnerName = storeOwnerName;
	}
	public String getStoreName() {
		return storename;
	}

	public void setStoreName(String storename) {
		this.storename = storename;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getProductQuantity() {
		return productquantity;
	}
	public void setProductQuantity(String pproductquantity) {
		this.productquantity=pproductquantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrandName() {
		return brandname;
	}
	public void setBrandName(String brandname) {
		this.brandname = brandname;
	}
	public String getBrandCategory() {
		return brandcategory;
	}
	public void setBrandCategory(String brandcategory) {
		this.brandcategory = brandcategory;
	}
	
}