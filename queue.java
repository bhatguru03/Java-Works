import java.util.*;

class arrayQueue
{
    protected int Queue[] ;
    protected int front, rear, size, len;

    public arrayQueue(int n) 
    {
        size = n;
		len = 0;
        Queue = new int[size];
        front = -1;
        rear = -1;
    }    

    public boolean isEmpty() 
    {
        return front == -1;
    }    

    public boolean isFull() 
    {
        return front==0 && rear == size -1 ;
    }    

    public int getSize()
    {
        return len ;
    }    

    public int peek() 
    {
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        return Queue[front];
    }    

    public void insert(int i) 
    {
        if (rear == -1) 
        {
            front = 0;
            rear = 0;
            Queue[rear] = i;
        }
        else if (rear + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        else if ( rear + 1 < size)
            Queue[++rear] = i;    
		len++ ;
    }    

    public int remove() 
    {
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        else 
        {
		len-- ;
		int ele = Queue[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else
                front++;                
            return ele;
        }        
    }

    public void display()
    {
		System.out.print("\nQueue = ");
				if (len == 0)
				{
		System.out.print("Empty\n");
		return ;
				}
				for (int i = front; i<= rear; i++)
		System.out.print(Queue[i]+" ");
		System.out.println();        
	}
}


public class queue
{
    public static void main(String[] args) throws InputMismatchException
    {
        Scanner scan = new Scanner(System.in);
		int qe=0;
		System.out.println("--------QUEUE IMPLEMENTATION--------");
		System.out.println("Enter Size of Integer Queue1 ");
		int n = scan.nextInt();
		int n1,ch1,ch2;
		arrayQueue q = new arrayQueue(n);        

				int choice=0;
        try
		{
			while(choice!=8)
			{

				System.out.println("\nQueue Operations");
				System.out.println("1. insert");
				System.out.println("2. remove");
				System.out.println("3. peek");
				System.out.println("4. check empty");
				System.out.println("5. check full");
				System.out.println("6. size");
				System.out.println("7.compare two array");
				System.out.println("8.Exit");
				choice = scan.nextInt();
				
				switch (choice)
				{
						case 1 :System.out.println("Enter integer element to insert");
								try
								{
									q.insert( scan.nextInt() );
								}
								catch(Exception e)
								{
									System.out.println("Error : " +e.getMessage());
								}                         
								break;                         
						case 2 :
									try
									{
										System.out.println("Removed Element = "+q.remove());
									}
										catch(Exception e)
									{
										System.out.println("Error : " +e.getMessage());
									}
									break;                         
						case 3 :
								try
								{
								System.out.println("Peek Element = "+q.peek());
												}
								catch(Exception e)
												{
								System.out.println("Error : "+e.getMessage());
												}
												break;                            
						case 4 :
								System.out.println("Empty status = "+q.isEmpty());
												break;                
						case 5 :
								System.out.println("Full status = "+q.isFull());
												break;                          
						case 6 :
								System.out.println("Size = "+ q.getSize());
												break;  
						case 7:System.out.println("How many no in queue2?");
									n1=scan.nextInt();
											int[] q1=new int[n1];
									        
										System.out.println("Enter integer element to insert");
										for(int i=0;i<n1;i++)
										q1[i]=scan.nextInt() ;
								
									ch1=q.peek();
									ch2=q1[0];
									if(ch1==ch2)
									{
										System.out.println("Peek element of Queue1 and queue2 are Equal.."); 
									}
									else
										System.out.println("Peek element of Queue1 and queue2 are not Equal.."); 
								
						case 8: break;
				default :System.out.println("Wrong Entry \n ");
								break;
							}
							/* display Queue */
				           
				
					
						}                                                      
				}catch(InputMismatchException e)
						{
							System.out.println("\nOnly Enter option numbers");
						}
}

}
