import java.util.*;

class TwoSum
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of integers: ");
        int no = sobj.nextInt();

        int nums[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            int value = sobj.nextInt();
            nums[i] = value;
        }

        System.out.println("Enter the target value:");
        int target = sobj.nextInt();

        int brr[] = new int[2];

        for(int i = 0; i < no; i++)
        {
            for(int j = i+1; j < no ;j++)
            {
                if((nums[i] + nums[j]) ==  target)
                {
                    brr[0] = i;
                    brr[1] = j;
                }
            }
        }

        for(int i = 0; i < 2; i++)
        {
            System.out.println(brr[i]);
        }

        System.gc();

    }
}