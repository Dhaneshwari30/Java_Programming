//Calculate sum of first N natural number

import java.util.*;

class Assignment16_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        int iSum = 0;
        for(int i = 0; i <= iNo; i++)
        {
            iSum = iSum + i;
        }

        System.out.println("System of N natural number is: "+iSum);
    }
}
