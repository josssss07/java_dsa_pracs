import java .util.*;
class LLNode
{
    private int data;
    private LLNodeTwo next;
    public int getData()
    {
        return data;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public LLNodeTwo getNext()
    {
        return next;
    }
    public void setNext(LLNodeTwo next)
    {
        this.next = next;
    }

    public LLNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedListDynamicdemo
{
    static LLNodeTwo createLL(LLNodeTwo head, int data)
    {
        LLNodeTwo h = head;
        LLNodeTwo p = h;
        LLNodeTwo q = h;
        LLNodeTwo newNode = null;
        if(h == null)
        {
            h = new LLNodeTwo(data);
        }
        else
        {
            while(p != null)
            {
                q = p; //q points to one node previous than p
                p = p.getNext(); // p points to the next node
            }

            newNode = new LLNodeTwo(data);
            q.setNext(newNode);
        }

        return h;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of nodes: ");
        int n = sc.nextInt();
        LLNodeTwo head = null; //start node is the head node.
        LLNodeTwo p = null;
        LLNodeTwo q = null;

        for(int i=0; i<n; i++)
        {
            System.out.println("enter the data: ");
            int data = sc.nextInt();
            LLNodeTwo a = createLL(head, data);
            if(i==0)
            {
                head = a;
                p=a;
                q=a;
            }
        }
        while(p!=null)
        {
            q=p;
            System.out.print("-->"+q.getData());
            p=p.getNext();
        }
    }
}
