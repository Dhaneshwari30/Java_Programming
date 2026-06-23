//Accept number and display its difference of odd factorial and even factorial

import java.util.*;

class Assignment9_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        int i = iNo;
        int OddMUL = 1;
        int EvenMUL = 1;

        while(i > 0)
        {
            if((i%2) != 0)
            {
                OddMUL = i * OddMUL;
            }
            else
            {
                EvenMUL = i * EvenMUL;
            }
            i--;
        }

        System.out.println("Difference between odd and even factorial are:  "+Math.abs(EvenMUL - OddMUL));
    }
}