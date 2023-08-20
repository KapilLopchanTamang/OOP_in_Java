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

public class SerializationExample {
    public static void main(String[] args) {
        String filePath = "student.ser";
        
        // Create a Student object
        Student student = new Student("John", 20);
        
        // Serialize the object to a file
        try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            
            objectOut.writeObject(student);
            
            objectOut.close();
            fileOut.close();
            
            System.out.println("Student object has been serialized and saved to " + filePath);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Deserialize the object from the file
        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            
            Student deserializedStudent = (Student) objectIn.readObject();
            
            objectIn.close();
            fileIn.close();
            
            System.out.println("Deserialized Student object: " + deserializedStudent);
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
