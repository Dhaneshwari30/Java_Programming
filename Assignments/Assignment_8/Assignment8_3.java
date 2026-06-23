//Find the factorial of given number

import java.util.*;

class Assignment8_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        int i = iNo;
        int iFact = 1;

        while(i > 0)
        {
            iFact = iFact * i;
            i--;
        }

        System.out.println(iFact);
    }
}