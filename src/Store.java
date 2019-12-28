import java.util.ArrayList;

import FileUsage.StoreEntity;
import FileUsage.fileWrite;
import FileUsage.storesFilesRead;

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

		StoreDatabase = storesFilesRead.storeReadFromFile(StoreDatabase);
	}

	public Store() throws Exception {
		StoreDatabase = storesFilesRead.storeReadFromFile(StoreDatabase);
	}

	public void addstoreinfo(String storename, String storeowneraccount, String storetype, String storelocation)
			throws Exception {
		boolean storeOwnerFound = false;
		boolean storeFound = false;
		for (int i = 0; i < new systemUser().StoreODatabase.size(); ++i) {
			if (storeowneraccount.equals(new systemUser().StoreODatabase.get(i).getUsername())) {
				storeOwnerFound = true;
			}
		}
		for (int i = 0; i < StoreDatabase.size(); ++i) {
			if (StoreDatabase.get(i).getname().equals(storename)) {
				System.out.print("This store is already found! ");
				storeFound = true;
				return;
			}
		}
		if (storeOwnerFound == false) {
			System.out.println("This storeowner is not found");
		}
		if (storeFound == false && storeOwnerFound == true) {
			fileWrite.usingBufferedWritter(storename + "|" + storeowneraccount + "|" + storetype + "|" + storelocation,
					"Store.txt");
			System.out.println("Store is added");
		}
	}
}


