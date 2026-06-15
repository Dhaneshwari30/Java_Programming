import java.util.Scanner;

/*
 Program: Cube of Number
 Author: Dhaneshwari Ghewari
 Description: Accepts number from the user and displays its Cube.
*/

class Cube
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int iNo = sobj.nextInt();

        int iResult = iNo * iNo * iNo;

        System.out.println("Cube is: " + iResult);

        sobj.close();
    }
}