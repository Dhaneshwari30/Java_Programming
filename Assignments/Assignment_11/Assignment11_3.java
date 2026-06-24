//Accept a range from user and display sum of values between that range

import java.util.*;

class Assignment11_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter starting value: ");
        int iStart = sobj.nextInt();

        System.out.println("Enter ending value: ");
        int iEnd = sobj.nextInt();

        int iSum = 0;
        for(int i = iStart; i <= iEnd; i++)
        {
            iSum += i;
        }

        System.out.println("Sum of values: "+iSum);
    }
}