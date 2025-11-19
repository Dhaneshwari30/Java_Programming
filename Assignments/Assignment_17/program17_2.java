//2. Write a program to check whether a number is a palindrome or not

class Logic
{
    void checkPalindrome(int num)
    {
        int iDigit = 0, iRev = 0, iNo = num;

        while(num != 0)
        {
            iDigit = num % 10;
            iRev = iRev * 10 + iDigit;
            num = num / 10;
        }

        if(iRev == iNo)
        {
            System.out.println(iNo + " is a palindrome");
        }
        else
        {
            System.out.println(iNo + " is not a palindrome");
        }
    }
}

class program17_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}