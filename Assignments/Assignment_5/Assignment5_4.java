//Check positive,negative or zero

import java.util.*;

class Assignment5_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int iNo = sobj.nextInt();

        if(iNo > 0)
        {
            System.out.println(iNo+ " is a positive number");
        }
        else if(iNo < 0)
        {
            System.out.println(iNo+" is a negative number");
        }
        else if(iNo == 0)
        {
            System.out.println("Its a zero");
        }
    }
}