//Count total positive factors of a number

import java.util.*;

class Assignment12_2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        int iCount = 0;
        for(int i = 1; i <= iNo/2; i++)
        {
            if((iNo%i == 0) && (i%2 == 0))
            {
               iCount++; 
            }
        }

        System.out.println("Total positive factors numbers: "+iCount);
    }
}