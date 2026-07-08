//To check maximum of two numbers

import java.util.*;

class Assignment17_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first value: ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second value: ");
        int iNo2 = sobj.nextInt();

        if(iNo1 > iNo2)
        {
            System.out.println(iNo1+ " is greater");
        }
        else
        {
            System.out.println(iNo2+" is greater");
        }
    }
}