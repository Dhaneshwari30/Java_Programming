import java.util.*;

class Solution
{
    public int Present(int arr[], int target)
    {
        HashMap <Integer,Integer> map = new HashMap<>();

        int iCount = 0;;

        for(int i = 0; i <arr.length; i++)
        {
            int value = target - arr[i];

            if(map.containsKey(value))
            {
                iCount++;
            }

            map.put(arr[i],i);
        }

        return iCount;
    }
}
class CountSubarrayWithTargetSum
{
    public static void main(String A[])
    {
        Scanner sobj =  new Scanner(System.in);

        System.out.println("Enter the number of value: ");
        int no = sobj.nextInt();

        int arr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sobj.nextInt();

        Solution obj = new Solution();

        int Result  = obj.Present(arr, target);

        System.out.println(Result);

    }
}