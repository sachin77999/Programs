import java.util.Arrays;
public class CheckArraysEqual1 {
    
    public static void main(String args[])
    {
        int a[] = {30, 25, 40};
        int b[] = {30, 25, 0};

        boolean result = Arrays.equals(a,b);
        if(result == true)
        {
            System.out.println("Array is equal");
        }
        else {
            System.out.println("Arrya is not equal");
        }
    }
}
