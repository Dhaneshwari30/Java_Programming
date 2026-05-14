import java.util.*;

class ArrayTraversal
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

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
            else if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);

        sobj.close();
    }
}
