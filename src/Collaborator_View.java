import java.util.Scanner;

public class Collaborator_View {
	public boolean addProductWant = false;

	public void collaborator_view() throws Exception {
		Collaborator c = new Collaborator();
		StoreOwner s = new StoreOwner();
		Scanner userInput = new Scanner(System.in);
		c.CollaboratoerLogin();
		if (addProductWant == true) {
			if (s.checkx == true) {
				System.out.println("Store Owner Accepts Enterd Data");
				c.useAsStoreOwner(1);
			} else if (s.checkx == false) {
				System.out.println("Sorry! StoreOwner Declined your changes...");
			}
		}
		while (true) {
			System.out.println("To Add Product Enter 1: ");
			System.out.println("To log out enter 2: ");
			int collaborator_choices = userInput.nextInt();
			if (collaborator_choices == 1) {
				addProductWant = true;
				c.useAsStoreOwner(0);
			}
			if (collaborator_choices == 2) {
				break;
			}
		}
	}
}
