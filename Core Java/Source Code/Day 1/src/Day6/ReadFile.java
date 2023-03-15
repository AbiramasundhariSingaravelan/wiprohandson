package Day6;

import java.io.FileInputStream;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream f=new FileInputStream("D:/Wipro Training/a1.txt");
			int i=0;
			while(( i=f.read())!=-1) {
				System.out.print((char)i);	
			}
			f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
