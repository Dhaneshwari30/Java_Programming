//Accept a number and check weather it contains 0 in it or not

import java.util.*;

class Assignment14_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();
        int iDigit = 0;

        boolean bFlag = false;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 0)
            {
                bFlag = true;
            }
            iNo = iNo / 10;
        }

        if(bFlag == false)
        {
            System.out.println("No zero");
        }
        else
        {
            System.out.println("Zero existist");
        }
    }
}