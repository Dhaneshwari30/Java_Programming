import java.util.*;

class Solution
{
    public boolean Duplicates(int arr[])
    {
        HashSet <Integer> set = new HashSet<>();

        boolean bFlag = false;

        for(int num : arr)
        {
            if(set.contains(num))
            {
                bFlag = true;
                break;
            }

            set.add(num);
        }

        return bFlag;
    }
}

class ArrayDuplicates
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

        boolean Result = obj.Duplicates(arr);

        System.out.println(Result);

    }
}
