import java.util.*;

class Solution
{
    public int BestTime(int[] prices)
    {
        int buyprice = prices[0];
        int profit = 0;
        int max = 0;

        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i] < buyprice)
            {
                buyprice = prices[i];
            }

            profit = prices[i] - buyprice;

            max = Math.max(profit,max);
        }

        return max;
    }
}
class BestTimeToBuySellStock
{
    public static void main(String A[])
    {
        Scanner sobj =  new Scanner(System.in);

        System.out.println("Enter the number of rates:");
        int no =  sobj.nextInt();

        int rate[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            rate[i] = sobj.nextInt();
        }

        Solution obj = new Solution();

        int Result = obj.BestTime(rate);

        System.out.println(Result);
    }
}