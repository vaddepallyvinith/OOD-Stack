
class Stack 
{
    private int top=-1;
    private char stack[];

    Stack(int n)
    {
        stack=new char[n];
    }
    void push(char ele)
    {
        if(isFull()==0)
        {
            return;
        }
        else
        {            
            stack[++this.top]=ele;
            System.out.println("PUSHED :"+stack[this.top]);
        }
    
    }
    char pop()
    {
        if(isEmpty()==0)
        {
            return '\0';
        }
        else
        {
            System.out.println("POPED :"+stack[this.top]);
            return stack[this.top--];
        }
    }
    void displayStack()
    {
        if (isEmpty()==0) 
        {
            return;
        }
        else
        {
            System.out.println("Stack elements");
            for(int i=0;i<=this.top;i++)
            {
                System.out.print(" "+stack[i]);
            }
            System.out.println(" ");
        }
    }
    int isFull()
    {
        if(this.top+1==stack.length) 
        {
            System.out.println("STACK is FULL");
            return 0;
        }
        else
        {
            return 1;
        }
    }
    int isEmpty()
    {
        if(this.top==-1)
        {
            System.out.println("Stack is EMPTY");
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
