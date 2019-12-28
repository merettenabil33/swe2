/*import java.util.ArrayList;
import java.util.Scanner;

import FileUsage.UserEntity;
import FileUsage.fileWrite;
import FileUsage.usersFileRead;

public class systemUser implements SystemUserLogin , SystemUserRegister {

	public ArrayList<UserEntity> typeDatabase = new ArrayList<UserEntity>();
	
	private Scanner input;
	protected String nameOremail;
    protected String password;
    protected String conf;
    
    public systemUser(String name,String pass,String confirm) throws Exception {
    	   this.nameOremail=name;
    	   this.password=pass;
    	   this.conf=confirm;
    	   
    	}
        public systemUser() throws Exception {
       	  
		}
        public systemUser(String fileName) throws Exception {
        	
        	typeDatabase = usersFileRead.userReadFromFile(typeDatabase,fileName);
         	  
		}
        
        public void register(String type) throws Exception{
        	
    	  input = new Scanner(System.in);
    	  System.out.println("Registration Page");
    	  System.out.println("Be sure that the username is unique");
    	  System.out.printf("Register by email or username: ");
    	  nameOremail=input.nextLine();
    	  System.out.printf("Password: ");
    	  password=input.nextLine();
    	  System.out.printf("Confirm Password: ");
    	  conf=input.nextLine();
    	  int length=password.length();
    	  if(length<6){
    		  System.out.println("Too short password,password must be more than 6 characters");
    		  System.out.printf("Password too short,Re-enter Password: ");
              password=input.next();
    		  }
    	  else{
    		  if(password.equals(conf))
    		  {
                  for(int i = 0; i < typeDatabase.size(); i++) {
                	  if(typeDatabase.get(i).getUsername().equals(nameOremail)) {
                          System.out.println("Username is already exists and used, please type another one");
                	      register(type);
                	  }
                  }
                  typeDatabase.add(new UserEntity(nameOremail, password));
                  if(type=="user") {
                	  fileWrite.usingBufferedWritter(nameOremail + "|" + password, "UserAccounts.txt");
                  }
                  if(type=="store owner") {
                	  fileWrite.usingBufferedWritter(nameOremail + "|" + password, "StoreOwnerAccounts.txt");
                  }
                  if(type=="adminstrator") {
                	  fileWrite.usingBufferedWritter(nameOremail + "|" + password, "AdminAccounts.txt");
                  }
                  System.out.println("Register is done");
                  new NumberOfAddedAccounts().numberOf_addedUsersAccounts();
    		  }
     	  System.out.println("Email or Password is wrong");
     	  login(4);
     	   }
}
        

        @SuppressWarnings("unused")
  	public void login(String type) throws Exception {
      	  Collaborator c= new Collaborator();
      	  input = new Scanner(System.in);
             System.out.println("Enter the username or email: ");
             nameOremail=input.nextLine();
             System.out.printf("Password: ");
       	   password=input.next();
      	  for(int i = 0 ; i < typeDatabase.size(); ++i) {
      		  if(typeDatabase.get(i).getUsername().equals(nameOremail) && typeDatabase.get(i).getPassword().equals(password)) {
      			  System.out.println("You are logged in");
      			  return;
      		  }  
      	  }
      	  System.out.println("Email or Password is wrong");
      	  login(type);
       }
}
*/