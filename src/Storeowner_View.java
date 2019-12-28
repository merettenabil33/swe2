import java.util.Scanner;

public class Storeowner_View {
	public static boolean storeowner_want_add_store = false;

	@SuppressWarnings("resource")
	public void storeowner_view() throws Exception {
		StoreOwner s = new StoreOwner();
		Adminstrator a = new Adminstrator();
		Scanner userInput = new Scanner(System.in);
		s.login(2);
		if (storeowner_want_add_store == true) {
			if (a.check == true) {
				System.out.println("Adminstrator accepts to add new store");
				s.addnewstore();
			} else if (a.check == false) {
				System.out.println("Adminstrator refuses to add new store");
			}
		}
		while (true) {
			System.out.println("To return to home page Enter 0: ");
			System.out.println("To Add new store Enter 1: ");
			System.out.println("To Add new product to store Enter 2: ");
			System.out.println("To view statistics  Enter 3: ");
			System.out.println("To Add new Collaborator Enter 4: ");
			System.out.println("To buy a product Enter 5: ");
			System.out.println("To view History Enter 6: ");
			System.out.println("To log out enter 7: ");
			int storeowner_choices = userInput.nextInt();
			if (storeowner_choices == 0) {
				System.out.println("   To the Home Page   ");
			}
			if (storeowner_choices == 1) {
				storeowner_want_add_store = true;
				s.wantaddstore();
			}
			if (storeowner_choices == 2) {
				s.addproducttostoreowner();
			}
			if (storeowner_choices == 3) {
				new StatisticsStoreOwner().usersstatistics();
			}
			if (storeowner_choices == 4) {
				s.wantToAddCollaborator();
			}
			if (storeowner_choices == 5) {
				s.storeownerbuyproduct();
			}
			if (storeowner_choices == 6) {
				s.history();
			}
			if (storeowner_choices == 7)
				break;
		}
	}
}
