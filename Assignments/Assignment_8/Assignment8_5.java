//Accept a number and display its table in reverse order

import java.util.*;

class Assignment8_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        int i = 10;
        while(i > 0)
        {
            System.out.println(iNo+" x "+i+" = "+(iNo*i));
            i--;
        }
    }
}