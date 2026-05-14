import java.util.*;

class Solution
{
    public boolean Final(int[] arr)
    {
        boolean bFlag = true;

        int i = 0;

        while(i < arr.length-1)
        {
            if(arr[i] < arr[i+1])
            {
                i++;
            }
            else
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
    }
}

class CheckSortedArray
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

        boolean Result = obj.Final(arr);

        if(Result == true)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }

        sobj.close();
    }
}
