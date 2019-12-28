import java.util.Scanner;

public class AdminView {
	@SuppressWarnings({ "resource", "static-access" })
	public void adminstrator_view() throws Exception {
		Adminstrator a = new Adminstrator();
		Scanner userInput = new Scanner(System.in);
		a.login(3);
		if (new StoreownerView().storeowner_want_add_store == true) {
			a.AcceptStore();
		}
		while (true) {
			System.out.println("To return to home page Enter 0: ");
			System.out.println("To Add new product Enter 1: ");
			System.out.println("To Add new brand Enter 2: ");
			System.out.println("To see new statistics Enter 3:");
			System.out.println("To log out enter 4: ");
			int admin_choices = userInput.nextInt();
			if (admin_choices == 0) {
				System.out.println("   To the Home Page   ");
			}
			if (admin_choices == 1) {
				a.addproducttosystem();
			}
			if (admin_choices == 2) {
				a.addBrandtosystem();
			}
			if (admin_choices == 3) {
				a.addnewstatistics();
			}
			if (admin_choices == 4)
				break;
		}
	}
}
