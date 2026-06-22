//Accept a character and convert case of that character

import java.util.*;

class Assignment3_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sobj.next().charAt(0);

        if(ch >= 'a' && ch <= 'z')
        {
            ch = Character.toUpperCase(ch);
        }
        else if(ch >= 'A' && ch <= 'Z')
        {
            ch = Character.toLowerCase(ch);
        }

        System.out.println(ch);

    }
}