import java.util.Scanner;

public class User_View {
	@SuppressWarnings("resource")
	public void user_view() throws Exception {
		User u = new User();
		Scanner userInput = new Scanner(System.in);
		u.login(1);
		while (true) {
			System.out.println("To return to home page Enter 0: ");
			System.out.println("To view products  Enter 1: ");
			System.out.println("To buy a product  Enter 2: ");
			System.out.println("To log out enter 3: ");
			int user_choices = userInput.nextInt();
			if (user_choices == 0) {
				System.out.println("   To the Home Page   ");
			}
			if (user_choices == 1) {
				new UserWantsViewProduct().wantstoviewproduct();
			}
			if (user_choices == 2) {
				u.userbuyproduct();
			}
			if (user_choices == 3)
				break;
		}
	}
}
