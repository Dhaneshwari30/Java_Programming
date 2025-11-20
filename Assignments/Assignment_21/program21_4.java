//4. Write a program to count total number of factors of a given number

class Logic
{
    void countFactors(int n)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 1; iCnt <= n/2; iCnt++)
        {
            if((n % iCnt) == 0)
            {
                iCount++;
            }
        }
        System.out.println(iCount);
    }
}

class program21_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}