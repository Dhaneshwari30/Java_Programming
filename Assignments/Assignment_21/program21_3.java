//3. Write a program to display all factors of a given number

class Logic
{
    void displayFactors(int n)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= n/2; iCnt++)
        {
            if((n % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program21_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayFactors(20);
    }
}