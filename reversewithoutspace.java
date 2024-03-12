import java.util.*;
public class reversewithoutspace
{
    public static void main(String args[])
    {
        String word = "hello world";
        String nword = "";
        for(int i = 0;i<word.length();i++)
        {
            if(word.charAt(i)==' ')
            {
                continue;
            }
           nword += word.charAt(i);
        }
         System.out.println(nword);

        char array[]=new char[nword.length()];
        for(int i = nword.length()-1;i>=0;i--)
        {
            array[nword.length()-i-1] = nword.charAt(i);
        }
        System.out.println(Arrays.toString(array));

    }
}