// Find Intersection Point of both the Linked Lists

public class Q5
{
	public static void main(String[] args) {
		
		Node head1=new Node(10);
		Node q=new Node(20);    // List 1: 10->20->30->40->50->60->NULL
		Node r=new Node(30);
		Node s=new Node(40);
		Node t=new Node(50);
		Node u=new Node(60);
		
		head1.next=q;
	    q.next=r;
	    r.next=s;
	    s.next=t;
	    t.next=u;
		
		Node head2=new Node(25);
		head2.next=s;    // List 2: 25->40->50->60->NULL
		
		Node res=null;
	    
	    // merge 2 LLs into 1 List
	    res=findintersection(head1, head2);
	
	    System.out.print(res.data+" ");
		 
		
}
        
        static Node findintersection(Node n1, Node n2)
        {
            Node temp1=n1;
            Node temp2=n2;
            int count1=0;
            int count2=0;
            
            // finding length of List 1
            while(temp1!=null)
            {
              ++count1;
              temp1=temp1.next;
            }
            
            // finding length of List 2
            while(temp2!=null)
            {
              ++count2;
              temp2=temp2.next;
            }
            
            temp1=n1;
            temp2=n2;
            
            // traversing list 1 till list 1 size - list 2 size, so from there, both lists have same no of nodes
            if(count1>count2)
            {
                for(int q=0;q<count1-count2;q++)
                {
                    temp1=temp1.next;
                }
            }
            
            // traversing list 2 till list 2 size - list 1 size, so from there, both lists have same no of nodes
            else if(count2>count1)
            {
               for(int q=0;q<count2-count1;q++)
                {
                    temp2=temp2.next;
                } 
            }
            
            // now incrementing both 1 by 1 till they meet
            while(temp1!=temp2)
            {
                temp1=temp1.next;
                temp2=temp2.next;
            }
            
            return temp1;
        }
}

// Linked list Node class
class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    
}
