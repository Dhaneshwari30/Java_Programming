//Print the multiplication table of a number

import java.util.*;

class Assignment17_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(iNo+" x "+i+" = "+iNo*i);
        }
    }
}