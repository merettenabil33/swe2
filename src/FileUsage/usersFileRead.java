package FileUsage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class usersFileRead {

	   @SuppressWarnings("resource")
	public static ArrayList<UserEntity> userReadFromFile(ArrayList<UserEntity> user,String FileName) throws Exception {
	   	BufferedReader reader = new BufferedReader(new FileReader(new File(FileName)));
	   	String line;
	   	while((line = reader.readLine()) != null) {
	   		String[] arr = line.split("\\|");
	   		user.add(new UserEntity(arr[0], arr[1]));
	   	}
			return user;
	}
	   
}
