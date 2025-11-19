//5. Write a program to print the multiplication table of a number

class Logic
{
    void printTable(int num)
    {
        int iCnt = 0, iMul = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            iMul = num * iCnt;
            System.out.println(iMul);
        }
    }
}

class program17_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}