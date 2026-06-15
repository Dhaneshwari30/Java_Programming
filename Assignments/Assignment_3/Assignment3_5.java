import java.util.*;

class Assignment3_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sobj.next().charAt(0);

        if((ch == 'a') || (ch == 'A') || (ch == 'e') || (ch == 'E') ||  (ch == 'i') ||
         (ch == 'I') || (ch == 'o') || (ch == 'O') || (ch == 'u') || (ch == 'U'))
        {
            System.out.println(ch+ " is a vowel");
        }
        else
        {
            System.out.println(ch+ " is not a vowel");
        }
    }
}