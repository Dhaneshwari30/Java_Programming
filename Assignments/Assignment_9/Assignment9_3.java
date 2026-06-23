//Accept number and display its multiplication of even factorial

import java.util.*;

class Assignment9_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        int i = iNo;
        int EvenMUL = 1;
        while(i > 0)
        {
            if((i%2) == 0)
            {
                EvenMUL = i * EvenMUL;
            }
            i--;
        }

        System.out.println("Even factorialmultiplication is: "+EvenMUL);
    }
}