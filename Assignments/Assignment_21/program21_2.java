//2. write a program to count how mauy even anf odd numbers are present between 1 and N

class Logic
{
    void countEvenOddRange(int n)
    {
        int iCnt = 0, iCountEven = 0, iCountOdd = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
        }

        System.out.println("Count of even number: " + iCountEven);
        System.out.println("Count of odd number: " + iCountOdd);
    }
}

class program21_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}