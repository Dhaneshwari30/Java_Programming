//accept number and count the frequency of 4 in it

import java.util.*;

class Assignment14_4
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
            if(iDigit == 4)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }

        System.out.println("Total count of 4's is: "+iCount);
    }
}
