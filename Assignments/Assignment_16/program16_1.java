//1.Write a program to calculate the sum of first N natural numbers.

class Logic
{ 
    void calculateSum(int n)
    {
        int iSum = 0,iCnt = 0;;
        iCnt = 1;
        while(iCnt <= n+1)
        {
            iSum = iSum + iCnt;
            iCnt++;
        }
        
        System.out.println("Sum of first natural number is: "+ iSum);
    }
}

class program16_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}
