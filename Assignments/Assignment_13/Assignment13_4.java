//Sum of first N numbers

import java.util.*;

class Assignment13_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        int iSum = 0;
        for(int i = 0; i <= iNo; i++)
        {
            iSum = iSum + i;
        }

        System.out.println("Sum is: "+iSum);
    }
}