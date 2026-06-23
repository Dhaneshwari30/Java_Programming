//Write a program which accpet a number and displsy a pattern

import java.util.*;

class Assignment9_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int iNo = sobj.nextInt();

        for(int i = 0; i < iNo; i++)
        {
            System.out.print("*\t");
        }
        for(int i = 0; i < iNo; i++)
        {
            System.out.print("#\t");
        }
    }
}
