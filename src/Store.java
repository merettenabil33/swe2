import java.util.ArrayList;

public class Store {

	public String storelocation;
	public String storetype;
	public String storename;
	public String storeowneraccount;
	ArrayList<StoreEntity> StoreDatabase = new ArrayList<StoreEntity>();

	public Store(String storename, String storeowneraccount, String storetype, String storelocation) throws Exception {
		this.storename = storename;
		this.storeowneraccount = storeowneraccount;
		this.storetype = storetype;
		this.storelocation = storelocation;

		StoreDatabase = FileUsage.storeReadFromFile(StoreDatabase);
	}

	public Store() throws Exception {
		StoreDatabase = FileUsage.storeReadFromFile(StoreDatabase);
	}

	public void addstoreinfo(String storename, String storeowneraccount, String storetype, String storelocation)
			throws Exception {
		boolean FoundinSystem1 = false;
		boolean FoundinSystem2 = false;
		for (int i = 0; i < new systemUser().StoreODatabase.size(); ++i) {
			if (storeowneraccount.equals(new systemUser().StoreODatabase.get(i).getUsername())) {
				FoundinSystem1 = true;
			}
		}
		for (int i = 0; i < StoreDatabase.size(); ++i) {
			if (StoreDatabase.get(i).getname().equals(storename)) {
				System.out.print("This store is already found! ");
				FoundinSystem2 = true;
				return;
			}
		}
		if (FoundinSystem1 == false) {
			System.out.println("This storeowner is not found");
		}
		if (FoundinSystem2 == false && FoundinSystem1 == true) {
			FileUsage.usingBufferedWritter(storename + "|" + storeowneraccount + "|" + storetype + "|" + storelocation,
					"Store.txt");
			System.out.println("Store is added");
		}
	}
}


