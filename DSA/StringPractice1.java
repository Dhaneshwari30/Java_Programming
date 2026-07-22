import java.util.*;

public class StringPractice1
{
    public static void main(String[] args)
    {
        String str = "Java Programming";

        //Check length
        System.out.println(str.length());

        //Display character with help if index
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(str.length()-1));

        //Display Substring
        System.out.println(str.substring(0, 4));
        System.out.println(str.substring(5,16));

        String str2 = "Java Programming";

        //Check if two string are same
        System.out.println("Check both string are same:"+str.equals(str2));

        //Conver to upperCase
        System.out.println(str.toUpperCase());

        //Convert to lowercase
        System.out.println(str2.toLowerCase());

        //Convert the string in charater array
        for(char ch : str.toCharArray())
        {
            System.out.println(ch);
        }

        String sentence = "I Love Java";

        //Spliting the sentence 
        String[] words = sentence.split(" ");

        for(String word : words)
        {
            System.out.println(word);
        }
    }
}