package threadpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//Deserialize the object (Read from File)
public class DeSerializePersonClass {

	public static void main(String[] args) {
		try {
			FileInputStream fileIn = new FileInputStream("C:/Users/pranjal.parmar/Documents/person.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Person person = (Person) objectIn.readObject(); //Reading object from file
			objectIn.close();
			fileIn.close();
			System.out.println("Object has been deserialized.");
			person.display();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
