//Accept width and height of rectangle and calculate area

import java.util.*;

class Assignment10_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the width: ");
        int iW = sobj.nextInt();

        System.out.println("Enter the height: ");
        int iH = sobj.nextInt();

        int iArea = iW * iH;

        System.out.println("Area is: "+iArea);
    }
}