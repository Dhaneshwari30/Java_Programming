import java.util.Scanner;

/*
 Program: Addition of Two Numbers
 Author: Dhaneshwari Ghewari
 Description: Accepts two numbers from the user and displays their sum.
*/

class Addition
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int iNo1 = sobj.nextInt();

        System.out.print("Enter Second Number: ");
        int iNo2 = sobj.nextInt();

        int iResult = iNo1 + iNo2;

        System.out.println("Addition is: " + iResult);

        sobj.close();
    }
}
