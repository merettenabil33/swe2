public class BuyedProductEntity {
	private String username;
	private String storeownername;
	private String productname;
	private String amount;
	private String bname;
	private String pprice;
	private String shippingaddress;

	public BuyedProductEntity(String username,String storeownername, String productname, String amount, String bname, String pprice,
			String shippingaddress) {
		this.username = username;
		this.storeownername=storeownername;
		this.productname = productname;
		this.amount = amount;
		this.bname = bname;
		this.pprice = pprice;
		this.shippingaddress = shippingaddress;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}
	public String getStowerOwnerName() {
		return storeownername;
	}

	public void setStoreOwnerName(String storeownername) {
		this.storeownername = storeownername;
	}
	public String getproductName() {
		return productname;
	}

	public void setproductName(String productname) {
		this.productname = productname;
	}

	public String getamount() {
		return amount;
	}

	public void setamount(String amount) {
		this.amount = amount;
	}

	public String getBrandName() {
		return bname;
	}

	public void setBrandName(String bname) {
		this.bname = bname;
	}

	public String getshippingaddress() {
		return shippingaddress;
	}

	public void setCategory(String shippingaddress) {
		this.shippingaddress = shippingaddress;
	}

	public String getPrice() {
		return pprice;
	}

	public void setPrice(String pprice) {
		this.pprice = pprice;
	}

}