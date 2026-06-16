//Accept number and print non factors

import java.util.*;

class Assignment4_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sobj.nextInt();

        for(int i = 1; i <= iNo; i++)
        {
            if((iNo%i) != 0)
            {
                System.out.println(i);
            }
        }

        sobj.close();
    }
}