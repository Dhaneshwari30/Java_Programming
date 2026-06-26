//Print positive factors

import java.util.*;

class Assignment12_1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        for(int i = 1; i <= iNo/2; i++)
        {
            if((iNo%i == 0) && (i%2 == 0))
            {
                System.out.println(i);
            }
        }
    }
}
