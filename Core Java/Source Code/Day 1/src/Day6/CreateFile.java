package Day6;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException	 {
		// TODO Auto-generated method stub
			//File f=new File("D:/Wipro Training/a1.txt");
		
		try{
			FileOutputStream f=new FileOutputStream("D:/Wipro Training/a1.txt");
			String s="Welcome to File Handling";
			byte b[]=s.getBytes();
			f.write(b);
			f.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Written to a file");
		}
	}
}
