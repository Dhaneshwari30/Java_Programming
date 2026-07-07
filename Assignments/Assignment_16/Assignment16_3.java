//Find factorial of a number using a for loop

import java.util.*;

class Assignment16_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        int iFac = 1;

        for(int i = 1; i <= iNo; i++)
        {
            iFac = iFac * i;
        }
        System.out.println("Factorial is: "+ iFac);
    }
}