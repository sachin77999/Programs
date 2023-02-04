import java.io.*;
import java.util.*;
public class CheckArraysEquals3 {
    public static void main(String args[])
    {
        int a[] = {10, 30, 12};
        int b[] = {10, 30, 12};
        
        boolean result = true;
        if(a.length == b.length){
            for(int i=0;i<a.length;i++)
            {
                if(a[i] != b[i]){
                    result = false;
                }
            }
        }
        else {
            result = false;
        }
        if(result == true){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
    }
}
