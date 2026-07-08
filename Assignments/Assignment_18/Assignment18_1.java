// Accept number from user and display below pattern 
/* Input: 5
    Output: A B C D E
 */

import java.util.*;

class Assignment18_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int iNo = sobj.nextInt();

        char ch = 'A';

        for(int i = 1; i <= iNo; i++,ch++)
        {
            System.out.print(ch+"\t");
        }
    }
}
