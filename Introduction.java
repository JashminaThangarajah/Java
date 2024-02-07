import java.util.Scanner;
public class Introduction
{
  public static void fibonacci()
  {
    int fib1 = 0;
    int fib2 = 1;
    int fib3 ;
          System.out.print(fib1 + ","); 
          System.out.print(fib2 + ","); 
         
          for(int i = 0; i<10;i++)
         {
            fib3 = fib1+fib2;
            System.out.print(fib3 + "," ); 
             fib1 = fib2;
             fib2 = fib3; 
                   
          }
        System.out.print("\b " ); 
   }
  
  public static void palindrome()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the name:");
    String name = input.next();
    String reverse = "";    
     for(int i = name.length()-1; i>=0; i--)
     {
         reverse += name.charAt(i);       
     }
     if(reverse.equals(name))
     {
         System.out.print("Palindrome"); 
     }
     else
     {
         System.out.print("Not Palindrome");
     }
  }
   //sum 10 numbers 
   public static void sum(){
   int sum =0;
     for(int i=0; i<=10;i++)
     { 
        sum  += i;
     }
      System.out.println("sum="+sum);
   }
     
     //count string without space
     public static void count1()
  {
         String name = "kasth urja";
    int count = 0;
    for(int i = 0;i<name.length();i++)
    {
      char namewithoutspace = name.charAt(i);
      if(namewithoutspace != ' ')
      {
        count++;
      } 
    }
     System.out.println("count ="+ count); 
  }
   
   // count with space
   public static void count2()
   {
        int count = 0;
     String name = "kasth rhajs";
       for(int i = 0;i<name.length();i++)
      {
        if(name.charAt(i) == ' ')
        {
          continue;
        }
         count++;
      }
      System.out.println("count ="+ count); 

   }

  //Take inputs and operator from the user and get the output 
     public static void userinput()
  {   
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number 1 :");
    int num1 = input.nextInt();
    System.out.println("Enter the operator :");
    String ope = input.next();
    System.out.println("Enter the number 2 :");
    int num2 = input.nextInt(); 
     System.out.print(num1+ope+num2 + "=");
     switch(ope)
     {

        case "+" : System.out.print(num1 + num2); break;
        case "-" : System.out.print(num1 - num2); break;
        case "*" : System.out.print(num1 * num2); break;
        case "/" : System.out.print(num1 / num2); break;
        case "%" : System.out.print(num1 % num2); break;
        default : System.out.print("Invalid operator"); break;

     } 
  }

    //print odd number
     public static void odd()
     {
             for (int i = 0 ;i<10; i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
     }
     
     public static void days()
     {
       // print monday to wednesday using switch case
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number:");
       int days = input.nextInt(); 
         if((days!=0) && (days<=31) )
        {
         days %=7;
        switch(days)
        {
         case 0: System.out.print("sunday"); break;   
        case 1: System.out.print("monday"); break;
        case 2: System.out.print("tuesday"); break;
        case 3: System.out.print("wednesday"); break;
        case 4: System.out.print("thursday"); break;
        case 5: System.out.print("friday"); break;
        case 6: System.out.print("saturday"); break;
        case 7: System.out.print("sunday"); break;
        default: System.out.print("invalid"); 
        }
       
        }
        else
        {
          System.out.print("invalid"); 
        }

        /*  // print monday to wednesday using switch case method 2
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number:");
       int days = input.nextInt();
        days = (days-1)%7+1;
         if((days!=0) && (days<=31) )
        {
        switch(days)
        {
           
        case 1: System.out.print("monday"); break;
        case 2: System.out.print("tuesday"); break;
        case 3: System.out.print("wednesday"); break;
        case 4: System.out.print("thursday"); break;
        case 5: System.out.print("friday"); break;
        case 6: System.out.print("saturday"); break;
        case 7: System.out.print("sunday"); break;
        default: System.out.print("invalid"); 
        }
       }
      */
       
     }
//Write a do-while loop that asks the user to enter two numbers. 
//The numbers should be added and the sum displayed. The loop should ask the user whether he or
// she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate. 
     public static void dowhilecheck()
     {
        do{
           Scanner input = new Scanner(System.in);
           System.out.print("Enter the nummber1:");
           int num1 = input.nextInt();
           System.out.print("Enter the nummber2:");
           int num2 = input.nextInt();
           int sum = num1+num2;
           System.out.println("sum = " + sum);

           System.out.println("Do you want to continue?\nyes press'y\'");
           String answer = input.next();
           if(!answer.equals("y"))
           {
              break;
           }

        }while(true);
     }
     
     //Write a program to read 10 numbers from the user and display the largest and smallest ones.
     public static void maxmin()
     {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter the nummbers:");
           int count =0;
           int number[] = new int[10];
           while(count<10)
           { 
            int num = input.nextInt();
            number[count] = num;
            count++;
           }
           
           int max = number[0];
           int min = number[0];
           for (int i = 1; i<number.length;i++)
           {
                if( number[i]>max)
                {
                  max = number[i];
                }
                if( number[i]<min)
                {
                   min = number[i];

                }
                 
           }
           
                  System.out.println("largest = "+ max);
                  System.out.println("smallest = "+ min);
     }

     //Testing codes
     public static void test()
     {
             //count the letters of string
            // String name = "kasth urja";
            // System.out.println("count ="+ name.length());

        // System.out.println("\t299");
        // System.out.println("+\t800");
        // System.out.println("-------------");
        // System.out.println("\t1099");
        // System.out.println("=============");
        // System.out.print(args[0]);
        // System.out.println("jasmina\rkasthuri\'"); //carriage return 

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter your name:");
        // String name = input.nextLine(); //when we give nextLine then only print after space
        // System.out.println("Name: " + name); 
        //  int  a = 1;
        // System.out.println(a++); // a = 1 then a = 2
        // System.out.println(a);
        // System.out.println(++a); // a = 2 then a = 2
        //     System.out.println(a);
     }
      
      
     public static void sign()
     {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the sign");
         String sign = input.nextLine();
         if()
        
     }

    //There are 8 integers stored in an array. They are:  25, 78, 43, 58, 90, 87, 5, 98. 
    //Write a java program to separate those integers into odd and even numbers in two separate arrays.
      public static void Array1()
      {
        int numbers[] = {25, 78, 43, 58, 90, 87, 5, 98};
        int even[] = new int[numbers.length];
        int odd[] = new int[numbers.length];
        int evenCount =0;
        int oddCount = 0;
        for(int i=0 ;i < numbers.length ; i++)
        {
          if(numbers[i]%2==0)
          {
            even[evenCount] = numbers[i];
            evenCount++;
          }
          else{
           odd[oddCount] = numbers[i];
           oddCount++;
          }
        }
        System.out.print("even numbers:");
         for (int i = 0; i < evenCount; i++) {
         System.out.print(even[i] + ",");
       
         }
         System.out.print("\b ");
         System.out.println();

         System.out.print("odd numbers:");
         for (int i = 0; i < oddCount; i++) {
         System.out.print(odd[i] + ",");
         }
         System.out.print("\b ");
         System.out.println();
      }

//Assume that two arrays are given. Write a Java program to check whether they are equal or not.
      public static void equalarray(int[] A,int[] B)
      {
        for(int i = 0;i<A.length;i++)
        {
           if(A[i]!=B[i])
           {
            System.out.println(" Not Equal array");
             return;
           }
        }
             System.out.println(" Equal array");
        
      }


    public static void main(String args[])
    {
      //fibonacci();
      //palindrome();
      //sum();  
      //count1();
       //count2();
       //userinput();
       //odd();
       //days();
       //dowhilecheck();
       //maxmin();
       //test;
       sign();
       //Array1();

       /*int[] A={1,5,3,24};
       int[] B={1,2,3,24};
       equalarray(A,B);*/

  
    }
}
