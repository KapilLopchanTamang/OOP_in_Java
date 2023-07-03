import java.util.*;

public class InputIn {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        //String input =sc.next();
        //System.out.println(input);
        System.out.println("enter the name value");
        String name =sc.nextLine();
        
        System.out.println(name);
        System.out.println("enter the interger value");
        int number=sc.nextInt();
        System.out.println(number);
        System.out.println("enter teh floating value");
        float price =sc.nextFloat();
        System.out.println(price);

    }
}
