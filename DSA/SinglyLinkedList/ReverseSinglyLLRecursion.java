import java.util.*;

class ReverseSinglyLLIteration
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

        sobj.first = sobj.ReverseLinkedList(sobj.first);
        System.out.println("Reverse linked list");
        sobj.Display();

    }
}

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

    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            node temp = this.first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }

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

    public void DeleteFirst()
    {
        if(this.first == null)
        {
            return;
        }
        else if(this.first.next == null)
        {
            this.first = null;
        }
        else
        {
            this.first = this.first.next;
        }

        System.gc();
        iCount--;
    }

    public void DeleteLast()
    {
        if(this.first == null)
        {
            return;
        }
        else if(this.first.next == null)
        {
            this.first = null;
        }
        else
        {
            node temp = this.first;

            while(temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next = null;

            System.gc();
            iCount--;
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// 
///     Function Name : DeleteAtPos()
///     Discription :   To delete the value from the linked list with the help of postion
///     Parameter type: Integer
///     Parameter:      Postion of value need to be deleted      
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void DeleteAtPos(int iPos)
    {
        if(iPos < 1 || iPos > iCount)
        {
            System.out.println("Invalid Position");
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iCount)
        {
            DeleteLast();
        }
        else 
        {
            node temp = this.first;

            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            System.gc();
            iCount--;
        }
    }

    public node ReverseLinkedList(node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        node newhead = ReverseLinkedList(head.next);

        head.next.next = head;

        head.next = null;

        return newhead;
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