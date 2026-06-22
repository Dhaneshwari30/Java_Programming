//Write a program which accept N and print first 5 multiples of N

import java.util.*;

class Assignment7_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        for(int i = 1; i <= 5; i++)
        {
            System.out.println(iNo*i);
        }
    }
}