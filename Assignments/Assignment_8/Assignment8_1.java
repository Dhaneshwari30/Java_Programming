//Accept a number and check its small that is less than 50, medium that is greater then 50 and less than 100, greater that is greater than 100

import java.util.*;

class Assignment8_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        if(iNo < 50)
        {
            System.out.println("Smaller");
        }
        else if(iNo >= 50 && iNo < 100)
        {
            System.out.println("Medium");
        }
        else if(iNo >= 100)
        {
            System.out.println("Greater");
        }
    }
}
