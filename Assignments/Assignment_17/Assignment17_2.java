//Check weather a number is palindrome or not

import java.util.*;

class Assignment17_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        int iOriginal = iNo;
        int iReverse = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo%10;
            iReverse = (iReverse*10) + iDigit;
            iNo = iNo/10;
        }

        if(iOriginal == iReverse)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
}