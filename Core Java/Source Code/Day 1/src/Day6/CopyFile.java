package Day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

	public static  void copyContent(File f1, File f2) throws IOException
	{
		FileInputStream fin=new FileInputStream(f1);//represent ip file
		FileOutputStream fout=new FileOutputStream(f2);//represent op file
		try
		{
			int i;
			while((i=fin.read())!=-1)
			{
				fout.write(i);
			}
		}
		finally
		{
			if(fin!=null)
			{
				fin.close();
			}
			if(fout!=null)
			{
				fout.close();
			}
		}
		System.out.println("File Copied");
	}
	public static void main(String[] args) throws IOException
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter source file name");
		String a=s.nextLine();
		File source=new File(a);
		System.out.println("Enter destination file name");
		String b=s.nextLine();
		File destination=new File(b);
		copyContent(source,destination);
	}
}
