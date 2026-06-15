import java.util.*;

class Assignment1_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of *: ");
        int iNo = sobj.nextInt();

        for(int i = 0; i < iNo; i++)
        {
            System.out.println("*");
        }
    }
}