//Accept a number and check weather even or odd

import java.util.*;

class Assignment2_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        if((iNo%2) == 0)
        {
            System.out.println(iNo+" is a even number");
        }
        else
        {
            System.out.println(iNo+" is a odd number");
        }
    }
}