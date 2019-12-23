public class BrandEntity {
	private String category;
	private String name;

	public BrandEntity(String name, String category) {
		this.name = name;
		this.category = category;

	}

	public String getBrandName() {
		return name;
	}

	public void setBrandName(String name) {
		this.name = name;
	}

	public String getBrandCategory() {
		return category;
	}

	public void setBrandCategory(String category) {
		this.category = category;
	}

}

