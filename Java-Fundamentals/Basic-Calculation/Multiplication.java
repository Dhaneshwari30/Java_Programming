import java.util.Scanner;

/*
 Program: Multiplication of Two Numbers
 Author: Dhaneshwari Ghewari
 Description: Accepts two numbers from the user and displays their multiplication.
*/

class Multiplication
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int iNo1 = sobj.nextInt();

        System.out.print("Enter Second Number: ");
        int iNo2 = sobj.nextInt();

        int iResult = iNo1 * iNo2;

        System.out.println("Multiplication is: " + iResult);

        sobj.close();
    }
}