
public class Check_user_account {
	public boolean FoundingUser;
	public boolean FoundingStoreowner;

	public boolean check_user_account(String uname) throws Exception {
		FoundingUser = false;
		for (int i = 0; i < new systemUser().userDatabase.size(); i++) {
			if (uname.equals(new systemUser().userDatabase.get(i).getUsername())) {
				FoundingUser = true;
			}
		}
		return FoundingUser;
	}

	public boolean check_storeowner_account(String uname ,String storename) throws Exception {
		FoundingStoreowner = false;
		for (int i = 0; i < new Store().StoreDatabase.size(); i++) {
			if (storename.equals(new Store().StoreDatabase.get(i).getname())   
					&& uname != (new Store().StoreDatabase.get(i)              //Doesn't buy from his store
							.getAccountname())) {
				FoundingStoreowner = true;
			}
		}
		return FoundingStoreowner;
	}
}
