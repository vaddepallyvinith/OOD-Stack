import java.util.*;

public class UseStack 
{
     public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Stack");
        int n =sc.nextInt();
        Stack  stack = new Stack(n);
        int s=0;
        while(true)
        {
            System.out.println("PRESS 1 to PUSH PRESS 2 to POP PRESS 3 to Display PRESS 4 to EXIT");
            s=sc.nextInt();
            switch (s)
            {
                case 1:
                    char k;
                    System.out.println("Enter value to push:");
                    k=sc.next().charAt(0);
                    stack.push(k);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.displayStack();
                    break;
                case 4:
                    return;
                default :
                    System.out.println("Enter Correct value");

            }

        }
    }    
    
}
