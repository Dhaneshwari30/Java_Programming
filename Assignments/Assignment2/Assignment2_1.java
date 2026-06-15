import java.util.*;

class Assignment2_1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of *: ");
        int iNo = sobj.nextInt();

        int i = 0;
        while(i < iNo)
        {
            System.out.println("*");
            i++;
        }
    }
}
