//Accept number and display its multilication

import java.util.*;

class Assignment4_1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        int iMul = 1;

        for(int i = 1; i <= iNo/2; i++)
        {
            if((iNo%i) == 0)
            {
                iMul = iMul * i;
            }
        }

        System.out.println("Factor Multiplication is: "+iMul);
        sobj.close();
    }
}
