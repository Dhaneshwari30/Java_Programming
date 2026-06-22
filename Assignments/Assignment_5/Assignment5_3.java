//Check leap year

import java.util.*;

class Assignment5_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        if(((iNo%4 == 0) && (iNo%100 != 0)) || (iNo%400 == 0))
        {
            System.out.println(iNo+" is a leap year");
        }
        else
        {
            System.out.println(iNo+" is not a leap year");
        }
    }
}