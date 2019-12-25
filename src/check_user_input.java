public class check_user_input {
	public boolean FoundingUser;
	public boolean FoundingStoreowner;
    public boolean FoundingStore;
	public boolean check_user_account(String uname) throws Exception {
		FoundingUser = false;
		for (int i = 0; i < new systemUser().userDatabase.size(); i++) {
			if (uname.equals(new systemUser().userDatabase.get(i).getUsername())) {
				FoundingUser = true;
			}
		}
		return FoundingUser;
	}

	public boolean check_storeowner_account(String storeownername) throws Exception {
		FoundingStoreowner = false;
		for (int i = 0; i < new systemUser().StoreODatabase.size(); i++) {
			if (storeownername.equals(new systemUser().StoreODatabase.get(i).getUsername())
					&& storeownername != (new ProductOfStoreowner().ProductOfStoreownerDatabase.get(i)
							.getStoreOwnerName())) {
				FoundingStoreowner = true;
			}
		}
		return FoundingStoreowner;
	}
	public boolean check_store( String storename) throws Exception {
		FoundingStore = false;
		for (int i = 0; i < new Store().StoreDatabase.size(); i++) {
			if (storename.equals(new Store().StoreDatabase.get(i).getname())) {
				FoundingStoreowner = true;
			}
		}
		return FoundingStore;
	}
}
