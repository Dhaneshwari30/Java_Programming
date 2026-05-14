import java.util.*;

class Solution
{
    public int First(int arr[])
    {
        HashSet <Integer> set = new HashSet<>();

        int repeat = 0;

        for(int num : arr)
        {
            if(set.contains(num))
            {
                repeat = num;
                break;
            }

            set.add(num);
        }

        return repeat;
    }
}

class FirstHashMap
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

        int Result = obj.First(arr);

        System.out.println(Result);

    }
}