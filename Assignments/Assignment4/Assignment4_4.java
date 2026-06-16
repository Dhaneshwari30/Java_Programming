//Accept number and sum of non factors

import java.util.*;

class Assignment4_4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        int iSum = 0;

        for(int i = 1; i <= iNo; i++)
        {
            if((iNo/i) != 0)
            {
                iSum = iSum + i;
            }
        }

        System.out.println("Sum of non factors is: "+iSum);

        sobj.close();
    }
}