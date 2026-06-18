//Check Even odd using if else

import java.util.*;

class Assignment5_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
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
