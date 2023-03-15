package Day6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOPStreamDemo {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f=new FileOutputStream("D:/Wipro Training/a1.txt");
		BufferedOutputStream b=new BufferedOutputStream(f);
		FileInputStream f1=new FileInputStream("D:/Wipro Training/a1.txt");
		BufferedInputStream bs=new BufferedInputStream(f1);
		String d="demo";
		byte b1[]=d.getBytes();
		b.write(b1);
		System.out.println("Reading Data");
		int i;
		while((i=bs.read())!=-1){
			System.out.print((char) i);
		}
		b.flush();//
		b.close();
		bs.close();
		f1.close();
	}
	
}
