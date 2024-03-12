public class reverse
{

   
    // TIME COMPLEXITY = O(n^2)
    static boolean containVowel(String word, String vowel)
    {
        for(int i=0;i<word.length();i++)
        {
            for(int j=0;j<vowel.length();j++)
            {
                if(word.charAt(i)==vowel.charAt(j))
                {
                    return true;
                }
            }
        }
        return false;
    }

    // TIME COMPLEXITY = O(n)
    static boolean containVowel(String word)
    {
        int count = 0;
        for(int i=0;i<word.length();i++)
        {
            switch(word.charAt(i))
            {
                case 'a':return true;//count++;break;
                case 'e':return true;//count++;break;
                case 'i':return true;//count++;break;
                case 'o':return true;//count++;break;
                case 'u':return true;//count++;break;
            }
        }
        return false;
    }
 

    public static void main(String args[])
    {

        String word = "jashmina";
        String reverse = "";
        for(int i = word.length()-1;i>=0;i--)
        {
            reverse+=word.charAt(i);
        }
        System.out.println("reverse:"+reverse);


         String word1 = "Hello".toLowerCase();
        String word2 = "TV".toLowerCase();
        String vowel = "AeiOU".toLowerCase();


        // TIME COMPLEXITY = O(n^2)
        System.out.println(word1 + " : Contains vowel :"+containVowel(word1,vowel));

        // TIME COMPLEXITY = O(n)
        System.out.println(word2 + " : Contains vowel :"+containVowel(word2)); // this is the best way because time complexity is small
    }

}
