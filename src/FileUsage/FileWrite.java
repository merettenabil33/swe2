package FileUsage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void usingBufferedWritter(String textToAppend,String FileName) throws IOException 
	{
	    BufferedWriter writer = new BufferedWriter(new FileWriter(FileName, true));
	    writer.write(textToAppend);  
	    writer.newLine();   //Add new line
	    writer.close();
	}


	
}