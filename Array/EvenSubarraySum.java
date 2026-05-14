import java.util.*;

class Solution
{
    public int Even(int arr[])
    {
        int prefix[] = new int[arr.length];

        int iCount = 0;

        prefix[0] = arr[0];

        if(prefix[0]%2 == 0)
        {
            iCount++;
        }

        for(int i = 1; i < arr.length; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
            if((prefix[i]%2) == 0)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class EvenSubarraySum
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

        int Result = obj.Even(arr);

        System.out.println(Result);
    }
}