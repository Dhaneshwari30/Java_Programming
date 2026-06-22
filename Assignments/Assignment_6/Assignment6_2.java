//Accept number and tell weather it is smaller or greater than 100

import java.util.*;

class Assignment6_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();

        if(iNo >= 100)
        {
            System.out.println("Greater than 100");
        }
        else
        {
            System.out.println("Smaller than 100");
        }

        char ch = sobj.next().charAt(0);
        System.out.println(ch);
    }
}