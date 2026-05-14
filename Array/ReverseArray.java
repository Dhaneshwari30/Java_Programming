import java.util.*;

class Solution
{
    public int[] Reverse(int[] brr)
    {
        int rev[] =  new int[brr.length];
        
        for(int i = 0, j = brr.length-1; i < brr.length; i++,j--)
        {
            rev[i] = brr[j];
        }

        return rev;
    }

    public int[] ReverseAdv(int[] brr)
    {
        int i = 0;
        int j = brr.length-1;

        int temp = 0;

        while(i < j)
        {
            temp = brr[i];
            brr[i] = brr[j];
            brr[j] = temp;

            i++;
            j--;
        }

        return brr;
    }
}
class ReverseArray
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of value :");
        int no = sobj.nextInt();

        int arr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }

        Solution obj = new Solution();

        int Result[] = obj.ReverseAdv(arr);

        for(int i = 0; i < Result.length; i++)
        {
            System.out.print(Result[i]+" ");
        }

        sobj.close();
    }
}