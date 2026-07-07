//Count even digit in the given number

import java.util.*;

class Assignment15_1
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
            if(iDigit%2 == 0)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }

        System.out.println("Total count of even number is: "+iCount);
    }
}
