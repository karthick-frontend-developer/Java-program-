import java.io.*;
import java.util.*;
class P5
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s="Programming";
        String s1="Java";
        int i;
        char[] c=s.toCharArray();
        System.out.println("the character arrary is: "+Arrays.toString(c));
        System.out.println("Enter an index position");
        i=Integer.parseInt(br.readLine());
        System.out.println("character at an index"+i+"is"+c[i]);
        System.out.println("size of char array:"+c.length);
        System.out.println("concatention of string"+s1.concat(s));
    }
}
