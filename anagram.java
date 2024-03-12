import java.util.*;
public class anagram {
    /**
     * @return
     */
    public static void anagram1()
     {
        String x = "He is SILENT";
        String y = "Is He LISTEN";

        x = x.replace(" ","");
        y = y.replace(" ","");

        x = x.toUpperCase();
        y = y.toUpperCase();

        char a[]=x.toCharArray();
        char b[]=y.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);

        boolean result = Arrays.equals(a,b);

        if(result == true)
        {
            System.out.print("Anagram");
        }
        else
        {
            System.out.print("Not Anagram"); 
        }


     }
     public static void count()
     {
        String x = "the is";
        char a[] = x.toCharArray();
        int count = 0;
        for(int i = 0 ;i<a.length;i++)
        {
            if(a[i] != (' '))
            {
                count++;
            }
        }
        System.out.print("count:"+count);
        
     }
     
     public static void copydata()
     {
        String x = "Hello Hii";
        char a[] = x.toCharArray();
        char b[] = new char[a.length];

        for(int i = 0;i<a.length;i++)
        {
            if(i < a.length)
            {
                b[i] = a[i];
            }
           
        }
        System.out.print(b);
       
     }
    
     public static void reverse()
     {
        String x = "Thangrajah";
        char a[] = x.toCharArray();
        char b[] = new char[a.length];
        for(int i = a.length-1;i>=0;i--)
        {
           
             
                    b[a.length-i-1] = a[i];
           
            
        }
        System.out.println(b);
     }

     public static void palindrome()
     {
        String x = "too hot to hoot";
        x = x.replace(" ","");
        char a[] = x.toCharArray();
        char b[] = new char[a.length];
        for(int i = a.length-1;i>=0;i--)
        {
           
                b[a.length-i-1] = a[i];
            
           
         }
          System.out.println(b);
          boolean result = Arrays.equals(a,b)  ;
          if(result == true)   
          {
            System.out.print("Palindrome");
          }
          else{
            System.out.print("Not Palindrome");
          }

     }
      
     
    public static void main(String args[]) {
        
       
        //anagram1();
        // String x = "abc tech" ;
        // System.out.print(x.charAt(4));

        //count();
        //copydata();
        //reverse();
        palindrome();
           
       
    }
}