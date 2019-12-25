public class ProductEntity {
	private String offer;
	private String price;
	private String category;
	private String name;

	public ProductEntity(String name, String category, String price, String offer) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.offer = offer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}
}
