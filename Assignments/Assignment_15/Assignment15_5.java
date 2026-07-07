//return difference between summation of even digits and summation of odd digits

import java.util.*;

class Assignment15_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        int iMulEven = 1;
        int iMulOdd = 1;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit%2 == 0)
            {
                iMulEven = iMulEven * iDigit;
            }
            else
            {
                iMulOdd = iMulOdd * iDigit;
            }
            iNo = iNo / 10;
        }

        System.out.println("Difference between odd and even multiplication summation is: "+ Math.abs(iMulEven-iMulOdd));
    }
}