//Accept number and display its multiplication of odd factorial

import java.util.*;

class Assignment9_4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        int i = iNo;
        int OddMUL = 1;
        while(i > 0)
        {
            if((i%2) != 0)
            {
                OddMUL = i * OddMUL;
            }
            i--;
        }

        System.out.println("Odd factorialmultiplication is: "+OddMUL);
    }
}