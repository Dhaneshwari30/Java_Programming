//1. Write a program to find the num of all numbers up to N.

class Logic
{
    void sumEvenNumbers(int n)
    {
        int iCnt = 0, iEvenSum = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iEvenSum = iEvenSum + iCnt;
            }
        }
        System.out.println(iEvenSum);
    }
}

class program20_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}
