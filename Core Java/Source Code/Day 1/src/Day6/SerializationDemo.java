package Day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
}
public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student s1=new Student(100,"abi");
	//Creating stream and write the object
		FileOutputStream fout=new FileOutputStream("D:/student.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		//FileInputStream fin=new FileInputStream("D:/student.txt");
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:/student.txt"));
		out.writeObject(s1);
		Student stud=(Student)in.readObject();
		System.out.println(stud.id +"--" +stud.name);
		out.flush();
		out.close();
		System.out.println("Serialization Done");
	}

}
