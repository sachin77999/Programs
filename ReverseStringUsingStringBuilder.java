import java.lang.*;
import java.io.*;
import java.util.*;
public class ReverseStringUsingStringBuilder {
    
    public static void main(String args[])
    {
        String str = "Geeks for Geeks";
        StringBuilder input1 = new StringBuilder();
        input1.append(str);

        input1.reverse();
        System.out.println(input1);

    }
}
