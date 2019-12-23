import java.util.ArrayList;
import java.util.Scanner;


public class systemUser {

	public ArrayList<UserEntity> userDatabase = new ArrayList<UserEntity>();
	private ArrayList<UserEntity> AdminDatabase = new ArrayList<UserEntity>();
	public ArrayList<UserEntity> StoreODatabase = new ArrayList<UserEntity>();
	protected ArrayList<UserEntity> collaboratorDatabase = new ArrayList<UserEntity>();
	
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
        	  userDatabase = FileUsage.userReadFromFile(userDatabase,"UserAccounts.txt");
         	  AdminDatabase = FileUsage.userReadFromFile( AdminDatabase,"AdminAccounts.txt");
          	  StoreODatabase = FileUsage.userReadFromFile(StoreODatabase,"StoreOwnerAccounts.txt");
              collaboratorDatabase = FileUsage.userReadFromFile(collaboratorDatabase,"Collaborator.txt");
       	  
		}
        public void register(int x) throws Exception{
        	
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
    			  if(x==1) {
                  for(int i = 0; i < userDatabase.size(); i++) {
                	  if(userDatabase.get(i).getUsername().equals(nameOremail)) {
                          System.out.println("Username is already exists and used, please type another one");
                	      register(1);
                	  }
                  }
                  userDatabase.add(new UserEntity(nameOremail, password));
                 FileUsage.usingBufferedWritter(nameOremail + "|" + password, "UserAccounts.txt");
                  System.out.println("Register is done");
                  new NumberOfAddedAccounts().numberOf_addedUsersAccounts();

    		  }
    			  else if(x==2)
    			  {
    				  for(int i = 0; i < StoreODatabase.size(); i++) {
                    	  if(StoreODatabase.get(i).getUsername().equals(nameOremail)) {
                              System.out.println("Username is already exists and used, please type another one");
                    	      register(2);
                    	  }
                      }
                      StoreODatabase.add(new UserEntity(nameOremail, password));
                      FileUsage.usingBufferedWritter(nameOremail + "|" + password, "StoreOwnerAccounts.txt");
                      System.out.println("Register is done");
                      new NumberOfAddedAccounts().numberOf_addedStoreOwnerAccounts();
    			  }
    			  else if (x==3)
    			  {
    				  for(int i = 0; i < AdminDatabase.size(); i++) {
                    	  if(AdminDatabase.get(i).getUsername().equals(nameOremail)) {
                              System.out.println("Username is already exists and used, please type another one");
                    	      register(3);
                    	  }
                      }
                      AdminDatabase.add(new UserEntity(nameOremail, password));
                      FileUsage.usingBufferedWritter(nameOremail + "|" + password, "AdminAccounts.txt");
                      System.out.println("Register is done");
    			  }
    		  }
    		  else 
    			  System.out.println("Password not matched, Re-Enter password");
    		  }
       }
    
      @SuppressWarnings("unused")
	public void login(int y) throws Exception {
    	  Collaborator c= new Collaborator();
    	  input = new Scanner(System.in);
           System.out.println("Enter the username or email: ");
           nameOremail=input.nextLine();
           System.out.printf("Password: ");
     	   password=input.next();
     	  if (y==1)
    	   {
    	  for(int i = 0 ; i < userDatabase.size(); ++i) {
    		  if(userDatabase.get(i).getUsername().equals(nameOremail) && userDatabase.get(i).getPassword().equals(password)) {
    			  System.out.println("You are logged in");
    			  return;
    		  }  
    	  }
    	  System.out.println("Email or Password is wrong");
    	  login(1);
     }
    	   else if (y==2)
   	   {
   	  for(int i = 0 ; i < StoreODatabase.size(); ++i) {
   		  if(StoreODatabase.get(i).getUsername().equals(nameOremail) && StoreODatabase.get(i).getPassword().equals(password)) {
   			  System.out.println("You are logged in");
   			  return;
   		  }  
   	  }
   	  System.out.println("Email or Password is wrong");
   	  login(2);
   	   }
    	  else if (y==3)
  	   {
  	  for(int i = 0 ; i < AdminDatabase.size(); ++i) {
  		  if(AdminDatabase.get(i).getUsername().equals(nameOremail) && AdminDatabase.get(i).getPassword().equals(password)) {
  			  System.out.println("You are logged in");
  			  return;
  		  }  
  	  }
  	  System.out.println("Email or Password is wrong");
  	  login(3);
  	   }
    	  else if (y==4)
     	   {
     	  for(int i = 0 ; i < collaboratorDatabase.size(); ++i) {
     		  if(collaboratorDatabase.get(i).getUsername().equals(nameOremail) && collaboratorDatabase.get(i).getPassword().equals(password)) {
     			  System.out.println("You are logged in");
     			  return;
     		  }  
     	  }
     	  System.out.println("Email or Password is wrong");
     	  login(4);
     	   }
}
}

