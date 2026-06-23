//Accept single digit from user and print it into word

import java.util.*;

class Assignment8_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter single digit value: ");
        int iNo = sobj.nextInt();

        String word[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        System.out.println(word[iNo]);
    }
}