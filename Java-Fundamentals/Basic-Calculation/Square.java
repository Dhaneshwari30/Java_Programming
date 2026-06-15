import java.util.Scanner;

/*
 Program: Square of Number
 Author: Dhaneshwari Ghewari
 Description: Accepts number from the user and displays its square.
*/

class Square
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int iNo = sobj.nextInt();

        int iResult = iNo * iNo;

        System.out.println("Square is: " + iResult);

        sobj.close();
    }
}