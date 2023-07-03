import java.util.Scanner;



public class PostiveOrNegativeOrZero {

    public static void main(String args[]) {
        System.out.println("enter the number");
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        if(num>0)
        System.out.println("the number is postive");
        else if(num==0)
        System.out.println("the number is zero");
        else 
        System.out.println("the numer is negative");
    }
    
}
