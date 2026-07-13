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


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// 
///     Function Name : InsertFirst()
///     Discription :   To insert the value at the first of the linked list
///     Parameter type: Integer
///     Parameter:      Value
/// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// 
    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);

        newn.next = this.first;
        this.first = newn;


        iCount++;
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

class InsertFirstSinglyLL
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
    }
}

