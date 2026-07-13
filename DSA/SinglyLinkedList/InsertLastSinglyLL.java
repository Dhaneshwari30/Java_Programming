import java.util.*;

class node
{
    public int data;
    public node next;

    public node(int iNo)
    {
        this.data = iNo;
        this.next = null;
    }
}

class SinglyLL
{
    public node first;
    public int iCount;

    public SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);

        newn.next = this.first;
        this.first = newn;


        iCount++;
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// 
///     Function Name : InsertLast()
///     Discription :   To insert the value at the end of the linked list
///     Parameter type: Integer
///     Parameter:      Value
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// 
    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);

        node temp = this.first;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newn;

        iCount++;
    }

    public void InsertAtPos(int iNo, int iPos)
    {
        if(iPos < 1 || iPos > iCount+1)
        {
            System.out.println("Invalid Position");
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(iNo);
        }
        else if(iPos == iCount+1)
        {
            InsertLast(iNo);
        }
        else
        {
            node newn = new node(iNo);

            node temp = this.first;

            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next = newn;

            iCount++;
        }
    }

    public void Display()
    {
        node temp = this.first;

        while(temp != null)
        {
            System.out.print(" | "+temp.data+" | ->");
            temp = temp.next;
        }
        System.out.print(" NULL");
    }
}

class InsertLastSinglyLL
{
    public static void main(String[] A)
    {
        SinglyLL sobj = new SinglyLL();

        sobj.InsertFirst(21);
        sobj.Display();

        System.out.println();

        sobj.InsertFirst(11);
        sobj.Display();

        System.out.println();
        
        sobj.InsertLast(51);
        sobj.Display();

        System.out.println();

        sobj.InsertAtPos(41, 3);
        sobj.Display();

        System.out.println();
    }
}

