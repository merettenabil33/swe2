public class BuyedProductEntity {
	private String username;
	private String storename;
	private String productname;
	private String amount;
	private String bname;
	private String pprice;
	private String shippingaddress;

	public BuyedProductEntity(String username,String storename, String productname, String amount, String bname, String pprice,
			String shippingaddress) {
		this.username = username;
		this.storename=storename;
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
	public String getStoreName() {
		return storename;
	}

	public void setStoreName(String storename) {
		this.storename = storename;
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