//2. Write a program to print numbers from N down to 1 in reverse order

class Logic
{
    void printReverse(int n)
    {
        int iCnt = n;

        while(iCnt != 0)
        {
            System.out.println(iCnt);
            iCnt--;
        }
    }
}

class program20_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}