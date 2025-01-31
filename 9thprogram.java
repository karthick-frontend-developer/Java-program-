Program Coding

//Program to perform Infix to Postfix Conversion using Stack ADT

import java.util.Stack;

import java.io.*;

public class Infix ToPostFix

1 static int precedence(char c)

switch (c)

case

case: return 1;

case

case: return 2;

case "return 3;

1

return -1;

static String infixToPostFix(String expression)

1 String result = "";

Stack<Character> stack = new Stack();

for (int i=0; i <expression.length(); (H+)

char c= expression.charAt(i);

if(precedence(c)>0)

while(stack.isEmpty() false && precedence(stack.peek())> precedence(c))

result += stack.pop();

1

stack.push(c);

1

1

else if(c=s^{\prime})^{\prime}) 1

char x= stack.pop();

while x!=(^{\prime})

result +=X_{i}^{*}

x = stack.pop();

else if(c

stack.push(c);

else

1

result +=\mathcal{C}_{i}

for (int i=0; i-stack.size(); i++)

result + stack.pop();
return result:

public static void main(String args[]) throws IOException

DataInputStream in-new DataInputStream(System.in); System.out.println(" ran Infix Expression: ");

String expin.readLine();

// Example: "A+B"(C^D-E)"

System.out.println("Infix Expression: " + exp);

System.out.println("Postfix Expression: "+infixToPostFix(exp));

1

1

1
