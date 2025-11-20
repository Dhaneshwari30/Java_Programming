//4. Write a program to print each digit of a number separately

class Logic
{
    void printDigit(int num)
    {
        int iDigit = 0, iRev = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            iRev = iRev * 10 + iDigit;
            num = num / 10;
        }

        while(iRev != 0)
        {
            iDigit = iRev % 10;
            System.out.println(iDigit);
            iRev = iRev / 10;
        }
    }
}

class program19_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printDigit(9876);
    }
}