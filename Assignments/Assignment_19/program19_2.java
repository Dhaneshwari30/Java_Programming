//2. Write a program to display the grade of a student based on marks.

class Logic
{
    void displayGrade(int marks)
    {
        if(marks > 90)
        {
            System.out.println("A Grade");
        }
        else if(marks > 80)
        {
            System.out.println("B Grade");
        }
        else if(marks > 60)
        {
            System.out.println("C Grade");
        }
        else 
        {
            System.out.println("Fail");
        }
    }
}

class program19_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}