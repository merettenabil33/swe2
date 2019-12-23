import java.util.Scanner;


public class Main {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {
		User u = new User();
		StoreOwner s = new StoreOwner();
		Adminstrator a = new Adminstrator();
		Collaborator c = new Collaborator();
		product p = new product();
		boolean storewant = false;
		Scanner userInput = new Scanner(System.in);
		while (true) {
			System.out.println("For register enter 1: ");
			System.out.println("For login enter 2: ");
			int want = userInput.nextInt();
			if (want == 1) {
				System.out.println("To return to home page Enter 0: ");
				System.out.println("For register as a new user enter 1: ");
				System.out.println("For register as a new store owner enter 2: ");
				System.out.println("For register as a new Adminstrator enter 3: ");
				int want1 = userInput.nextInt();
				if (want1 == 0) {
					System.out.println("  To Home Pgae  ");
				}
				if (want1 == 1) {
					u.register(1);
				}
				if (want1 == 2) {
					s.register(2);
				}
				if (want1 == 3) {
					a.register(3);
				}
			} else if (want == 2) {
				System.out.println("To return to home page Enter 0: ");
				System.out.println("For login as a User enter 1: ");
				System.out.println("For login as a Store owner enter 2: ");
				System.out.println("For login as an Adminstrator enter 3: ");
				System.out.println("For login as a Collaborator enter 4: ");
				int want2 = userInput.nextInt();
				if (want2 == 0) {
					System.out.println("   To the Home Page   ");
				}
				if (want2 == 1) {
					u.login(1);
					System.out.println("To return to home page Enter 0: ");
					System.out.println("To view products  Enter 1: ");
					System.out.println("To buy a product  Enter 2: ");
					int userwant = userInput.nextInt();
					if (userwant == 0) {
						System.out.println("   To the Home Page   ");
					}
					if (userwant == 1) {
						new UserWantsViewProduct().wantstoviewproduct();
					}
					if (userwant == 2) {
						u.userbuyproduct();
					}

				} else if (want2 == 2) {
					s.login(2);
					if (storewant == true) {
						if (a.check == true) {
							System.out.println("Adminstrator accepts to add new store");
							s.addnewstore();
						} else if (a.check == false) {
							System.out.println("Adminstrator refuses to add new store");
						}
					}

					System.out.println("To return to home page Enter 0: ");
					System.out.println("To Add new store Enter 1: ");
					System.out.println("To Add new product to store Enter 2: ");
					System.out.println("To view statistics  Enter 3: ");
					System.out.println("To Add new Collaborator Enter 4: ");
					System.out.println("To buy a product Enter 5: ");
					System.out.println("To view History Enter 6: ");
					int want3 = userInput.nextInt();
					if (want3 == 0) {
						System.out.println("   To the Home Page   ");
					}
					if (want3 == 1) {
						storewant = true;
						s.wantaddstore();
					}
					if (want3 == 2) {
						s.addproducttostoreowner();
					}
					if (want3 == 3) {
						new StatisticsStoreOwner().usersstatistics();
					}
					if (want3 == 4) {
						s.wantToAddCollaborator();
					}
					if (want3 == 5) {
						s.storeownerbuyproduct();
					}
					if (want3 == 6) {
						s.history();
					}

				} else if (want2 == 3) {
					a.login(3);
					if (storewant) {
						a.AcceptStore();
					}
					System.out.println("To return to home page Enter 0: ");
					System.out.println("To Add new product Enter 1: ");
					System.out.println("To Add new brand Enter 2: ");
					System.out.println("To see new statistics Enter 3:");
					int want4 = userInput.nextInt();
					if (want4 == 0) {
						System.out.println("   To the Home Page   ");
					}
					if (want4 == 1) {
						a.addproducttosystem();
					}
					if (want4 == 2) {
						a.addBrandtosystem();
					}
					if (want4 == 3) {
						a.addnewstatistics();
					}

				} else if (want2 == 4) {
					c.CollaboratoerLogin();
					System.out.println("To Add Product Enter 1: ");
					int collaboratorWant = userInput.nextInt();
					if (collaboratorWant == 1) {
						c.useAsStoreOwner();
					}

				}
			}
		}
	}
}

