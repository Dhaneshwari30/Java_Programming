//Accept 2 number and display 1 number second number of times

import java.util.*;

class Assignment2_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the second number: ");
        int iNo2 = sobj.nextInt();

        for(int i = 0; i < iNo2; i++)
        {
            System.out.println(iNo1);
        }
    }
}