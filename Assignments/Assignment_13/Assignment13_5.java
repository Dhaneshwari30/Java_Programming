//Sum of even N numbers

import java.util.*;

class Assignment13_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        int iSum = 0;
        for(int i = 0; i <= iNo; i++)
        {
            if(i%2 == 0)
            {
                iSum += i;
            }
        }

        System.out.println("Sum is: "+iSum);
    }
}