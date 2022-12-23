import java.util.Scanner;
public class UpperLowerCharacter{
    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
        ch = scan.next().charAt(0);
        if(ch >='a' && ch <='z')
        {
            System.out.println(ch +"is a lower case character");
        }
        else if(ch >='A' && ch <='Z')
        {
            System.out.println(ch +" is a upper case character");
        }
        else if(ch >='0' && ch <='9')
        {
            System.out.println(ch+"is a numeric character");
        }
    }
}