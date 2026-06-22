//Acceot 3 numbers and multiply them we need to handle 0 so multiply indiviually in one variable and a zero counter

import java.util.Scanner;

class Assignment6_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        int iNo2 = sobj.nextInt();

        System.out.println("Enter third number: ");
        int iNo3 = sobj.nextInt();

        int iMul = 1;
        int iCount = 0;

        if(iNo1 != 0)
        {
            iMul *= iNo1;
        }
        else
        {
            iCount++;
        }

        if(iNo2 != 0)
        {
            iMul *= iNo2;
        }
        else
        {
            iCount++;
        }

        if(iNo3 != 0)
        {
            iMul *= iNo3;
        }
        else
        {
            iCount++;
        }

        System.out.println("Multiplication is : "+ iMul);
        System.out.println("Total number of zero is: "+iCount);
    }
}