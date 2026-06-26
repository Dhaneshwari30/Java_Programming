//Sum of all positive number

import java.util.*;

class Assignment12_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        int iSum = 0;
        for(int i = 1; i <= iNo/2; i++)
        {
            if((iNo%i == 0) && (i%2 == 0))
            {
               iSum += i; 
            }
        }

        System.out.println("Sum of positive factors numbers: "+iSum);
    }
}
