import java.util.Scanner;

public class User extends systemUser {

	public User() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("resource")
	public void userbuyproduct() throws Exception{
		   Scanner userInput3 = new Scanner(System.in);
		   System.out.println("Your username is:");
		   String Uname = userInput3.nextLine();
		   System.out.println("Store owner account's name is:");
			String Sname = userInput3.nextLine();
		   System.out.println("name of product is:");
		   String Pname = userInput3.nextLine();
		   System.out.println("amount of products is:" );
		   String bamount = userInput3.nextLine();
		   System.out.println("name of brand is:");
		   String bname = userInput3.nextLine();
		   System.out.println("price of product is:");
		   String pprice = userInput3.nextLine();
		   System.out.println("Shipping address is:" );
		   String shippingaddress = userInput3.nextLine();
		   new BuyedProduct().buyproduct(Uname,Sname,Pname, bamount, bname, pprice,shippingaddress);
		}
	
}

