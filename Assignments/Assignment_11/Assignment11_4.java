//Accept a range from user and display sum of even values between that range

import java.util.*;

class Assignment11_4
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
            if((i%2) == 0)
            {
                iSum += i;
            }
        }

        System.out.println("Sum of even values: "+iSum);
    }
}