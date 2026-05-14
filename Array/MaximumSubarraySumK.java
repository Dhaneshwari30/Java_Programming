import java.util.*;

class Solution
{
    public int Max(int arr[])
    {

        int iSum = 0;
        int iMax = Integer.MIN_VALUE;

        for(int i = 0; i <arr.length-2; i++)
        {
            iSum = 0;
            for(int j = i; j <= i+2; j++)
            {
                iSum = iSum + arr[j];
            }

            if(iSum > iMax)
            {
                iMax = iSum;
            }
        }

        return iMax;

    }
}

class MiximumSubarraySumK
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

        int Result  = obj.Max(arr);

        System.out.println(Result);
    }
}