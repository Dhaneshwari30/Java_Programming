//5. Write a program to calculate the power of a number using loops

class Logic
{
    void calculatePower(int base, int exp)
    {
        int iCnt = 0, iPower = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iPower = iPower * base;
        }
        System.out.println(iPower);
    }
}

class program19_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);
    }
}