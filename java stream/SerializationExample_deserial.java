import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class SerializationExample_deserial {
    public static void main(String[] args) {
        String filePath = "student.ser";

        // Serialize the object
        serializeObject(filePath);

        // Deserialize the object
        Student deserializedStudent = deserializeObject(filePath);

        if (deserializedStudent != null) {
            System.out.println("Deserialized Student object: " + deserializedStudent);
        } else {
            System.out.println("Deserialization failed.");
        }
    }

    // Serialize an object and save it to a file
    private static void serializeObject(String filePath) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            Student student = new Student("John", 20);
            objectOut.writeObject(student);

            objectOut.close();
            fileOut.close();

            System.out.println("Student object has been serialized and saved to " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialize an object from a file
    private static Student deserializeObject(String filePath) {
        Student deserializedStudent = null;

        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            deserializedStudent = (Student) objectIn.readObject();

            objectIn.close();
            fileIn.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return deserializedStudent;
    }
}
