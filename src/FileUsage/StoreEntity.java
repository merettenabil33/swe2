package FileUsage;

public class StoreEntity {
	public StoreEntity(String name,String account, String type , String location) {
		this.location = location;
		this.type = type;
		this.name = name;
		this.accountname=account;
	}
	private String location;
	private String type;
	private String name;
	private String accountname;
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}


