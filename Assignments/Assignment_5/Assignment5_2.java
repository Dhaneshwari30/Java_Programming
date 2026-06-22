//find maximum two number

import java.util.*;

class Assignment5_2
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
            System.out.println("Maximum value is: "+iNo1);
        }
        else
        {
            System.out.println("Maximum value is: "+iNo2);
        }
    }
}