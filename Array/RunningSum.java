import java.util.*;

class Solution
{
    int[] Sum(int brr[])
    {
        int prefix[] = new int[brr.length];
        prefix[0] = brr[0];

        for(int i = 1; i < brr.length; i++)
        {
            brr[i] = brr[i-1]+brr[i];
        }

        return brr;
    }
}

class RunningSum
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of values: ");
        int no = sobj.nextInt();

        int arr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }

        Solution obj = new Solution();

        int Result[] = obj.Sum(arr);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(Result[i]+" ");
        }
    }
}