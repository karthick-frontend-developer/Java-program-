import java.util.*;

public class StackExample

 {

    private int max;

    private int[] st;

    private int top;

    public StackExample (int size)

  {

        max = size;

        st = new int[max];

        top = -1;

    }

    // Method to push an element onto the stack

    public void push (int value)

  {

        if (top == max - 1) 

       {

            System.out.println("Stack overflow");

            return;

        }

        st [++top] = value;

        System.out.println(value + " pushed into the stack");

    }



    // Method to pop an element from the stack

    public int pop() 

      {

        if (top == -1) 

        {

            System.out.println("Stack underflow");

            return -1;

        }

        int popelement = st [top--];

        System.out.println(popelement + " popped from the stack");

        return popelement;

    }



    // Method to peek the top element of the stack

    public int top() 

     {

        if (top == -1) 

      {

            System.out.println("Stack is empty");

            return -1;

        }

        return st [top];

    }

    // Method to check if the stack is empty

    public boolean isEmpty() 

    {

        return (top == -1);

    }



    public static void main(String[] args)

       {

         Scanner sc = new Scanner(System.in);

       System.out.print("Enter an maximum limit of the Stack:");

        int n = sc.nextInt();

        StackExample stack = new StackExample(n);

       for(int i=0;i<n;i++)

       {

        System.out.print("Enter an element:");

        int e = sc.nextInt();

        stack.push(e);

       }



        // Peeking the top element

        System.out.println("Top element of the stack: " + stack.top());



        // Popping elements from the stack

         for(int i=0;i<n;i++)

       {

        

        stack.pop();



	}

    // Checking if the stack is empty

        System.out.println("Is stack empty? " + stack.isEmpty());

    }

}
