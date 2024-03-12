import java.util.*;
public class exercise
{
    public static void reverse()
    {
        String name= "jasmi";
        String reverse = "";
        char ch;
        for(int i = 0;i<name.length();i++)
        {
            ch = name.charAt(i);
            reverse =ch + reverse;
            
        }
        System.out.print("reverse :" + reverse);

    }

     public static void reverseNumber()
    {
        int number = 1234;
        int answer = 0;
        while(number > 0)
        {
            int lastdigit = number % 10 ;
            answer = answer*10 + lastdigit;
            number = number / 10;
        }
        System.out.print("answer :" + answer);

    }

    public static void sum()
    {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the count:");
        int count = input.nextInt();
        for(int i =0;i<count;i++)
        {
           System.out.println("Enter the num:");
           int num = input.nextInt();
           sum = sum + num;
        }

        System.out.print("numbers :" + " ");
        System.out.println("sum:" + sum);
        double average = sum / count;
        System.out.println("Average : " + average);

    }

    public static void addDigits()
    {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int digit = input.nextInt();
        int sum = 0 ;
        while(digit>0)
        {
          int  lastdigit = digit%10;
          sum = sum + lastdigit;
           digit = digit/10;
        }
        System.out.println("sum:"+sum);
    }

     public static void arraysum()
    {
            int array[] = {1,2,3,4,5};
            int sum = 0;
            for(int i =0;i<array.length;i++)
            {
               sum = sum + array[i];
            }
            System.out.println("sum="+sum);
            double ave = sum / array.length;
             System.out.println("average="+ave);

     }

    public static void sumofN()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value:");
        int value = input.nextInt(); 
        int sum = 0;
        while(value>0)
        {
          sum = sum + value;
          value--;
      
        }
        System.out.println("sum ="+ sum);
    }     

     public static void prime()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt(); 
        boolean isPrime = true;
        if(number == 0 || number == 1)
        {
                System.out.println(number+" is Not prime");
        }
        else
            {
                for(int i =2; i<number/2;i++)
                {
                   if(number % i ==0)
                   {
                    isPrime = false;
                    break;
                   }
                }
            if(isPrime){
                System.out.println(number+" is  prime");
            }
            else{
                System.out.println(number+" is not  prime");
            }
            }
          
        
       
    }     


    public static void fibonnacci()
    {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the number that you want to fiboonacci series:");
        int number = input.nextInt(); 
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        
       for(int i = 0; i<number ;i++)
       {
        int num3 = num1 + num2;
        System.out.print(num3 + " ");
        num1 = num2;
        num2= num3;
       

       }
       
    }   

    public static void factorial()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of factorial:");
        int number = input.nextInt();
        if (number <= 0){
             System.out.println("false number ");
        }
        else{

        int fact = 1; 
        while(number>0)
        {
          
          fact = fact * number;
          number--;
        }
        System.out.println("fact:"+fact);
        }
    }

        public static void factorial1()
        {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter the number of factorial:");
           int number = input.nextInt();
           System.out.print("factorial : " + fact(number));
        }
        static int fact(int n)
            {
                if(n == 1 || n ==0)
                 return 1;
                 else
                 return n * fact(n-1);
            }

         public static void palindrome()
        {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter the string:");
           String name  = input.next();
           for(int i = 0;i<name.length()/2;i++)
           {
             if(name.charAt(i)==name.charAt(name.length()-1-i))
             {
                System.out.println("Palindrome");
                break;
             }
             else
             {
                 System.out.println("Not Palindrome");
                 break;
             }
           }
         
        }
        //  public static void swap()
        //  {
        //     int a,b,temp;
        //     temp = a;
        //     a = b;
        //     b = temp;
        //  } 
         public static void bubblesort()
         {
            int array[] = {2,1,7,3,8,4,5};
            for (int i = 0; i <array.length;i++ )
            {
                for(int j = 0;j<array.length-1;j++ ){
                  if(array[j]>array[j+1]) 
                  {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    //swap(array[j],array[j+1]);
                  }
                }
                System.out.print( array[i] + " ");

            }
             System.out.print(" second max="+ array[array.length-2]);

         }

public static void removewhite()
{
   String word = "hello world";
    String newword = "";
    for(int i=0;i<word.length();i++)
    {  
      if(word.charAt(i) == ' ')
      {
         continue;
      }
      newword += word.charAt(i);
    }
        char array[] = new char[newword.length()];
        for(int i=newword.length()-1;i>=0;i--)
        {
            array[newword.length()-i-1] = newword.charAt(i);
        }
        System.out.print(Arrays.toString(array));
    }

    public static boolean vowels()
    {
       String word = "shakdhget".toLowerCase();
       String vowels = "aeiou";
        for(int i = 0; i<word.length(); i++)
        {
            for(int j = 0;j<vowels.length();j++)
            {
                     if(word.charAt(i)==vowels.charAt(j))
                     {
                         return true;
                     }

            }          
        }  
        return false;         
    }

    // public static void duplicatecharacter()
    // {
    //     String word = "This is my first code".toLowerCase();
    //     List<Character> duplicates = new ArrayList<>();

    //     for (int i = 0; i < word.length(); i++) {
    //         for (int j = i + 1; j < word.length(); j++) {
    //             if (word.charAt(i) == word.charAt(j) && !duplicates.contains(word.charAt(i))) {
    //                 duplicates.add(word.charAt(i));
    //                 break; // Break the inner loop once a duplicate is found
    //             }
    //         }
    //     }

    //     System.out.print("Duplicate characters: ");
    //     for (char ch : duplicates) {
    //         System.out.print(ch + " ");
    //     }
    // }

        public static void duplicatecharacter()
        {
            String word = "This is my first code".toLowerCase();
            char ch[] = word.toCharArray();
            int count = 0;
            for(int i = 0;i< ch.length;i++)
            {
                for(int j = i+1; j<ch.length;j++)
                {
                    if(ch[i] == ' ')
                    {
                        continue;
                    }
                    else if(ch[i]==ch[j])
                    {
                        System.out.print(ch[j] + " ");
                        count++;
                    }
                }
            }
             System.out.println("count:"+count);
        }

    // public static void star()
    // {
       
    //     System.out.println("enter row");
    //     Scanner input = new Scanner(System.in);
    //     int row = input.nextInt();
    //     for(int i = row;i >0;i--)
    //     {
    //        for(int j = 0; j<i;j++)
    //        {
    //         System.out.print("*");
    //        }
    //         System.out.println();
    //     }

    // }
        public static void star()
    {
       
        System.out.println("enter row");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        for(int i = 0;i <=row;i++)
        {
           for(int j = 0; j<=i;j++)
           {
            System.out.print(" ");
           }
           for(int j =i;j<=row;j++)
           {
            System.out.print("*");
           }
            System.out.println();
        }

    }
        


    public static void main(String args[])
    {
       // reverse();
       // reverseNumber();
       // sum();
       //addDigits();
       //arraysum();
       //sumofN();
       // prime();
      // fibonnacci();
      //factorial();
       //factorial1();
       //palindrome();
       bubblesort();
      //removewhite();

    //   if(vowels())
    //   {
    //     System.out.println("vowels");
    //   }
    //   else
    //   {
    //     System.out.println("Not vowels");
    //   }
    //duplicatecharacter();

   // star();

    }
}