import java.util.Scanner;

public class Main {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {
		User u = new User();
		StoreOwner s = new StoreOwner();
		Adminstrator a = new Adminstrator();
		product p = new product();
		Scanner userInput = new Scanner(System.in);
		while (true) {
			System.out.println("For register enter 1: ");
			System.out.println("For login enter 2: ");
			int register_or_login = userInput.nextInt();
			if (register_or_login == 1) {
				System.out.println("To return to home page Enter 0: ");
				System.out.println("For register as a new user enter 1: ");
				System.out.println("For register as a new store owner enter 2: ");
				System.out.println("For register as a new Adminstrator enter 3: ");
				int register_as = userInput.nextInt();
				if (register_as == 0) {
					System.out.println("  To Home Pgae  ");
				}
				if (register_as == 1) {
					u.register(1);
				}
				if (register_as == 2) {
					s.register(2);
				}
				if (register_as == 3) {
					a.register(3);
				}
			} else if (register_or_login == 2) {
				System.out.println("To return to home page Enter 0: ");
				System.out.println("For login as a User enter 1: ");
				System.out.println("For login as a Store owner enter 2: ");
				System.out.println("For login as an Adminstrator enter 3: ");
				System.out.println("For login as a Collaborator enter 4: ");
				int login_as = userInput.nextInt();
				if (login_as == 0) {
					System.out.println("   To the Home Page   ");
				}
				if (login_as == 1) {
					new User_View().user_view();
				} else if (login_as == 2) {
					new Storeowner_View().storeowner_view();

				} else if (login_as == 3) {
					new Admin_View().adminstrator_view();

				} else if (login_as == 4) {
					new Collaborator_View().collaborator_view();

				}
			}
		}
	}
}