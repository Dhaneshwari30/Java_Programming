import java.util.*;

class Solution
{
    public int[] TwoSum(int[] nums, int target)
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int comp = 0;

        for(int i = 0; i < nums.length; i++)
        {
            comp = target - nums[i];

            if(mp.containsKey(comp))
            {
                return new int[]{mp.get(comp),i};
            }
            mp.put(nums[i],i);
        }

        return new int[]{};
    }
}
class TwoSumHM
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of vaules:");
        int no = sobj.nextInt();

        int nums[] = new int[no];

        System.out.println("Enter the values:");
        for(int i = 0; i < no; i++)
        {
            nums[i] = sobj.nextInt();
        }

        System.out.println("Enter the target value: ");
        int target = sobj.nextInt();

        Solution obj = new Solution();

        int result[] = obj.TwoSum(nums,target);

        for(int j = 0; j < result.length; j++)
        {
            System.out.print(result[j]);
        }
    }
}