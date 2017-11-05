import java.util.*;

interface stack
{
	void push(int item);
	void pop();
	void display();
}

class fixed implements stack
{
	int stk[],top;

	fixed(int size)
	{
		stk=new int[size];
		top=-1;
	}

	public void push(int item)
	{
		if(top==stk.length-1)
			System.out.println("Stack Overflow,.,.");
		else
			stk[++top]=item;
	}

	public void pop()
	{
		if(top<0)
			System.out.println("Stack Underflow,.,.");
		else
			System.out.println(stk[top--]+" is removed from Stack");
	}

	public void display()
	{
		if(top<0)
			System.out.println("Stack is Empty,.,.,.");
		else
		{
			System.out.println("\nElements of Fixed Satck:");
			for(int i=0;i<=top;i++)
				System.out.println("\t"+stk[i]);
		}
	}	
}


class dynamic implements stack
{
	List<Integer>dyn_stk = new ArrayList<Integer>();
	int dsize;
	public void push(int item)
	{
		dyn_stk.add(item);
		dsize=dyn_stk.size();
		System.out.println("\ndsize: "+dsize);
	}

	public void pop()
	{
		if(dsize<=0)
			System.out.println("Stack Underflow");
		else{
			dsize--;
			System.out.println(dyn_stk.remove(dsize)+" is removed from Stack");			  }
}

	public void display()
	{
		if(dsize<=0)
			System.out.println("Stack is Empty");
		else
		{
			System.out.println("\nElements of Fixed Satck:");
			//for(inti=0;i<dsize;i++)
				System.out.println(dyn_stk);
		}
	}	
}

class StackOP
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int ch=0,opt1,opt2,item,size;
		while(ch!=3)
		{
		ch=opt1=opt2=0; 
		System.out.println("\n\t-----Statck Implementation-----");
		System.out.println("\n1.Fixed Stack\n2.Dynamic Stack\n3.Exit");
		System.out.println("\nEnter your choice: "); 
		ch=in.nextInt();
		
		switch(ch)
		{
			case 1:System.out.println("\n---Fixed Size Stack---");
				System.out.println("\nEnter size of the Stack:");
				size=in.nextInt();
				fixed fix=new fixed(size);
				while(opt1!=4)
			            {
				
			System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Back to Main Menu");
				System.out.println("\nEnter your choice: "); 
				opt1=in.nextInt();
				switch(opt1)
				{
				case 1:      System.out.println("\nEnter a number to insert");
					item=in.nextInt();
					fix.push(item);
					break;
				case 2:	fix.pop();
					break;

				case 3:	fix.display();
					break;

				case 4:	break;
				}
			           }
				break;

			case 2: System.out.println("\n\t\tDynamic Stack");
				dynamic dyn=new dynamic();
				while(opt2!=4)
			             {
				
			System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Back to Main Menu");
				System.out.println("\nEnter your choice: "); 
				opt2=in.nextInt();
				switch(opt2)
				{
				case 1:System.out.println("\nEnter a number to insert");
					item=in.nextInt();
					dyn.push(item);
					break;


				case 2:	dyn.pop();
					break;

				case 3:	dyn.display();
					break;

				case 4:	break;
				}
			           }
				break;
				case 3:break;
			}
		}
	}
}
