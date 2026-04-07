package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Serialization {
public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException
{
	Employee e = new Employee(2, "Parameshwari");
	
	ObjectOutputStream ooo = new ObjectOutputStream(new FileOutputStream("data.ser"));
	ooo.writeObject(e);
	ooo.close();
	
	ObjectInputStream iii = new ObjectInputStream(new FileInputStream("data.ser"));
	Employee d = (Employee)iii.readObject();
	System.out.print(d.id+" "+d.name);
}
}
