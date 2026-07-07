//accept number and count the frequency of 2 in it

import java.util.*;

class Assignment14_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();
        int iDigit = 0;

        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 2)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }

        System.out.println("Total count of 2's is: "+iCount);
    }
}