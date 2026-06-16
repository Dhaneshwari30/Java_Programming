//Accept number from user and return difference between summation of all its factors and non factors

import java.util.*;

class Assignment4_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        int iSumNonFac = 0;
        int iSumFac = 0;

        for(int i = 1; i <= iNo; i++)
        {
            if((iNo/i) != 0)
            {
                iSumNonFac = iSumNonFac + i;
            }
            else
            {
                iSumFac = iSumFac + i;
            }
        }

        System.out.println("Difference between factors and non factors is: "+(iSumNonFac-iSumFac));

        sobj.close();
    }
}