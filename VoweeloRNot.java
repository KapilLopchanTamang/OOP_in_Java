import java.util.Scanner;

public class VoweeloRNot {
    public static void main(String args[]){
        System.out.println("enter the alphabet ");
        Scanner input=new Scanner(System.in);
        char n =input.next().charAt(0);
        switch (n){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println(n +"is vowel");
            break;
            default:
            System.out.println(n+"is the consonant");
        }

    }
}
