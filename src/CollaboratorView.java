import java.util.Scanner;

public class CollaboratorView {
	public static boolean addProductWant = false;

	@SuppressWarnings("resource")
	public void collaborator_view() throws Exception {
		Collaborator c = new Collaborator();
		Scanner userInput = new Scanner(System.in);
		c.CollaboratoerLogin();
		if (addProductWant == true) {
			if (StoreOwner.checkx == true) {
				System.out.println("Store Owner Accepts Enterd Data");
				c.useAsStoreOwner(1);
			} else if (StoreOwner.checkx == false) {
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
