//Return multiplication of all digit

import java.util.*;

class Assignment15_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();
        int iDigit = 0;

        int iMul = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iMul = iMul * iDigit;
            iNo = iNo / 10;
        }

        System.out.println("Digit Multiplication is: "+iMul);
    }
}