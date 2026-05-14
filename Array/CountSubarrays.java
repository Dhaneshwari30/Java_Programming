import java.util.*;

class Solution
{
    public int Sub(int arr[])
    {
        int iSum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                for(int k = i; k <= j; k++)
                {
                    iSum = iSum + arr[k];
                }
            }
        }

        return iSum;
    }
}

class CountSubarrays
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int no = sobj.nextInt();

        int arr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }

        Solution obj = new Solution();

        int Result  = obj.Sub(arr);

        System.out.println(Result);
    }
}