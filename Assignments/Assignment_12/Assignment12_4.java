//Check if number is divisible by 5 

import java.util.*;

class Assignment12_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        if(iNo%5 == 0)
        {
            System.out.println(iNo+" is divisible by 5");
        }
    }
}