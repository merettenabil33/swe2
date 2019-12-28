public class CheckProductValidation {
	public boolean ValidProduct;
	public boolean ValidAmount;

	public boolean Is_Product_Valid(String storename, String bname, String pname, String pprice) throws Exception {
		ValidProduct = false;
		for (int i = 0; i < new ProductOfStoreowner().ProductOfStoreownerDatabase.size(); i++) {
			if (storename.equals(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getStoreName())
					&& pname.equals(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getName())
					&& bname.equals(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getBrandName())
					&& pprice.equals(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getPrice())) {
				ValidProduct = true;
			}
		}
		return ValidProduct;
	}

	public boolean Is_Amount_Valid(String bamount) throws  Exception {
		Integer num1, num2;
		ValidAmount = false;
		for (int i = 0; i < new ProductOfStoreowner().ProductOfStoreownerDatabase.size(); i++) {
			num1 = Integer.valueOf(bamount);
			num2 = Integer.valueOf(new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i).getProductQuantity());
			if (num1 <= num2) {
				ValidAmount = true;
			}
		}
		return ValidAmount;
	}
}
