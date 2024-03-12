import java.util.*;
public class sort
{
    public static void max()
    {
        int array1[] = {2,1,3,9,8,7};
        int max = array1[0];
        for(int i = 0;i<array1.length-1;i++)
        {
            if(max < array1[i])
            {
                max = array1[i] ;


            }
        }
        System.out.println(max);
    }


    public static void main(String args[])
    {
    //     int array[] = {1,7,3,8,2,5};
    //    Arrays.sort(array);
    //    for(int i : array)
    //    {
    //     System.out.print(i + " ");
    //    }


       max();
    }
}