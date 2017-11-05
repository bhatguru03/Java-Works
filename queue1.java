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


public class queue1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

		System.out.println("\n--------QUEUE IMPLEMENTATION------------");
		System.out.println("Enter Size of first Integer Queue ");
		int n1 = scan.nextInt();
		System.out.println("Enter Size of second Integer Queue ");
		int n2 = scan.nextInt();

		arrayQueue q = new arrayQueue(n1);        
		arrayQueue q1 = new arrayQueue(n2);        

        int choice=0;
        int ch=0,i=0,j=0;
        try
			{
		while (ch!=3)
		{
			System.out.println("\nQueue Operations");
			System.out.println("1.Queue1");
			System.out.println("2.Queue2");
			System.out.println("3.exit");
			System.out.println("Enter your choice:");
			ch = scan.nextInt();
			while(choice!=7)
			{
			switch(ch)
			{
				case 1:System.out.println("\nQueue 1");
					System.out.print("1. insert\t\t\t");
					System.out.println("4. check empty\t\t\t");
					System.out.print("2. remove\t\t\t");
					System.out.println("5. check full\t\t\t");
					System.out.print("3. peek\t\t\t\t");
					System.out.println("6. size\t\t");
					System.out.println("7. back to main menu");
					System.out.println("Enter your choice:");
					choice = scan.nextInt();
						
					switch (choice)
					{
						case 1 :while(i<=n1)
									{
								System.out.println("Enter integer element to insert");
								try
								{
										q.insert( scan.nextInt() );
									
								}
								catch(Exception e)
								{
									System.out.println("Error : " +e.getMessage());
								} 
								i++;
									}								
								break;                         
						case 2 :try
								{
									System.out.println("Removed Element = "+q.remove());
								}
								catch(Exception e)
								{
									System.out.println("Error : " +e.getMessage());
								}
								break;                         
						case 3 :try
								{
									System.out.println("Peek Element = "+q.peek());
								}
								catch(Exception e)
								{
									System.out.println("Error : "+e.getMessage());
								}
								break;                            
						case 4 :System.out.println("Empty status = "+q.isEmpty());
								break;                
						case 5 :System.out.println("Full status = "+q.isFull());
								break;                          
						case 6 :System.out.println("Size = "+ q.getSize());
								break;
						case 7:System.out.println("How many Elements?");
						case 8:break;
						default :System.out.println("Wrong Entry \n ");
									break;
					}
								
						break;
						
			case 2:System.out.println("\nQueue 2");
							System.out.print("1. insert\t\t\t");
							System.out.println("4. check empty\t\t\t");
							System.out.print("2. remove\t\t\t");
							System.out.println("5. check full\t\t\t");
							System.out.print("3. peek\t\t\t\t");
							System.out.println("6. size\t\t");
							System.out.println("7. back to main menu");
							System.out.println("Enter your choice:");
							choice = scan.nextInt();
								
							switch (choice)
							{
								case 1 :while(j<=n2)
										{
											System.out.println("Enter integer element to insert");
										try
										{
											
												q.insert( scan.nextInt() );
												
										}
										catch(Exception e)
										{
											System.out.println("Error : " +e.getMessage());
										}  
										j++;
										}
										break;                         
								case 2 :try
										{
											System.out.println("Removed Element = "+q.remove());
										}
										catch(Exception e)
										{
											System.out.println("Error : " +e.getMessage());
										}
										break;                         
								case 3 :try
										{
											System.out.println("Peek Element = "+q.peek());
										}
										catch(Exception e)
										{
											System.out.println("Error : "+e.getMessage());
										}
										break;                            
								case 4 :System.out.println("Empty status = "+q.isEmpty());
										break;                
								case 5 :System.out.println("Full status = "+q.isFull());
										break;                          
								case 6 :System.out.println("Size = "+ q.getSize());
										break;
								case 7:System.out.println("How many Elements?");
								case 8:break;
								default :System.out.println("Wrong Entry \n ");
											break;
							}
							break;	      
							
								
			}
		}			
		}
			                                
		}catch(InputMismatchException e)
				{
					System.out.println("\nOnly Enter option numbers");
				}
		}

}
