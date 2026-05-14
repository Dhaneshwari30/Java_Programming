import java.util.*;

class Solution
{
    public boolean Present(int arr[], int target)
    {
        HashMap <Integer,Integer> map = new HashMap<>();

        boolean bFlag = false;

        for(int i = 0; i <arr.length; i++)
        {
            int value = target - arr[i];

            if(map.containsKey(value))
            {
                bFlag = true;

                break;
            }

            map.put(arr[i],i);
        }

        return bFlag;
    }
}
class TargetSumSubarray
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

        boolean Result  = obj.Present(arr, target);

        System.out.println(Result);

    }
}