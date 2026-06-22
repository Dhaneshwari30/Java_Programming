import java.util.*;

class Assignment2_2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of *: ");
        int iNo = sobj.nextInt();

        int i = iNo;
        while(i > 0)
        {
            System.out.println("*");
            i--;
        }
    }
}