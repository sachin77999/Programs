import java.util.Arrays;
public class CheckArraysEquals2 {

    public static void main(String args[])
    {
        int arr1[] = {30,25,40};
        int arr2[] = {30,25,40};

        boolean result = Arrays.equals(arr1,arr2);
        if(result == true)
        {
            System.out.println("Arrays are equals");
        }
        else {
            System.out.println("Arrays are not equal");
        }
    }
}
