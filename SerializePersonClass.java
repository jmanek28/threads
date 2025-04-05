package threadpackage;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializePersonClass {

	public static void main(String[] args) {
		try {
			Person person = new Person("Pranjal", 22);
			FileOutputStream fileOut = new FileOutputStream("C:/Users/pranjal.parmar/Documents/person.ser");
			//we can change the loaction like "src/person.per or any other location
 			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(person); //writing object to file
			objectOut.close();
			fileOut.close();
			System.out.println("Object has been serialized.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
