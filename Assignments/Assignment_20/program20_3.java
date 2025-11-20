//3. Write aprogram to check whether a number is a perfect number or not

class Logic
{
    void checkPerfect(int num)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= num/2; iCnt++)
        {
            if((num % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        
        if(iSum == num)
        {
            System.out.println(num + " is a Perfect number");
        }
        else
        {
            System.out.println(num + " is not a Perfect number");
        }
    }
}

class program20_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}