//Accept a number and display its table 

import java.util.*;

class Assignment8_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(iNo+" x "+i+" = "+(iNo*i));
        }
    }
}