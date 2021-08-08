// BFS and DFS Traversal of BST

/*
 * @author rajatrawat
 */
 
public class Q8 {
    
    static int front=-1,rear=-1;
    
    public static void main(String[]args)
    {
        
        BSTUsingLL root=new BSTUsingLL(50, null, null);
        
        // creation of BST
        root=create(root);
        
         // print BST DFS
        System.out.println("DFS Traversing");
        dfs(root);
        System.out.println();
        
       // print BST BFS
        System.out.println("BFS Traversing");
        bfs(root);
        System.out.println();
        
       
        
        
    }
    
    static BSTUsingLL create (BSTUsingLL root)
    {
        BSTUsingLL left1=new BSTUsingLL(40, null, null);
        BSTUsingLL right1=new BSTUsingLL(60, null, null);
        BSTUsingLL left2=new BSTUsingLL(30, null, null);
        BSTUsingLL right2=new BSTUsingLL(56, null, null);
        BSTUsingLL left3=new BSTUsingLL(35, null, null);
        BSTUsingLL right3=new BSTUsingLL(58, null, null);
        
        root.left=left1;
        root.right=right1;
        left1.left=left2;   //           50
        left1.right=null;   //         /     \
        left2.left=null;    //       40       60
        left2.right=left3;  //      /  \      / \
        right1.left=right2; //    30  null   56  null
        right1.right=null;  //    / \     /   \
        right2.left=null;   //   null 35 null  58    
        right2.right=right3; //       /\      /  \
        left3.left=null;     //    null null null  null
        left3.right=null;
        right3.left=null;
        right3.right=null;
        
        return root;
        
    }
        
    // DFS print function
    static void dfs(BSTUsingLL root)
    {
        if(root==null)
        return;
        
        System.out.print(root.value+" ");
        dfs(root.left);
        dfs(root.right);
        
    }
    
    // BFS print function
    static void bfs(BSTUsingLL root)
    {
         QueueUsingArray qu=new QueueUsingArray();
         enqueue(root, qu);
         
         while(rear>-1)
         {
            BSTUsingLL bst=dequeue(qu);
            System.out.print(bst.value+" ");
            
            enqueue(bst.left, qu);
            enqueue(bst.right, qu);
         }
        
    }
    
    // enqueue function
    static void enqueue(BSTUsingLL value, QueueUsingArray qu)
    {
        if(value==null)
        return;
        
        if(front==-1)
        front++;
        
        // enqueuing only when rear is within the bound of array index
        // check ki that if we increment rear will it cause overflow?
        if(rear+1==qu.arr.length)
        {
         System.out.println("Overflow");
         return;
        }
        
       rear++;
       qu.arr[rear]=value;
       
    }  
    
    // dequeue function
    static BSTUsingLL dequeue(QueueUsingArray qu)
    {
        
       // whenever front & rear at at same index, means we have 0 elements in queue   
       if(rear==-1)
       {
         System.out.println("Underflow");
         return null;
       }
       
       // wherever front is pointing from the next index onwards we have elements in queue
       
       BSTUsingLL node= qu.arr[front];
      
       ++front;
       
       if(front>rear)
       front=rear=-1;
       
       return node;
    
   }
   
    // print function
    static void print(QueueUsingArray qu)
    {
        
        if(rear==-1)
        {
            System.out.println("Queue is Empty");
        }
        
        else
        {
        
          System.out.print("Contents of Queue: ");
        
          // elements present in queue from front till rear
          for(int q=front+1; q<=rear; q++)
           {
             System.out.print(qu.arr[q]+" ");
           }
        
          System.out.println();
        }
        
    }
    
}

//BSTUsingLL class with 3 properties: value, left child & right child
class BSTUsingLL
{
  int value;
  BSTUsingLL left;
  BSTUsingLL right;
  
  BSTUsingLL(int value, BSTUsingLL left,BSTUsingLL right)
  {
      this.value=value;
      this.left=left;
      this.right=right;
  }
}
    
//QueueUsingArray class with 1 property: integer array
class QueueUsingArray
{
  BSTUsingLL[]arr=new BSTUsingLL[6];
}
