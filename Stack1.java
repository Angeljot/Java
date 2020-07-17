//Program to convert infix expression  into postfix expression
import java.util.Stack;
import java.util.Scanner;
class Stack1
{
	static int Prec(char ch)
	{
		switch(ch)
		{
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
			
		}
		return -1;
		
	}
	static String infixTopostfix(String exp)
	{
		String result=new String("");
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<exp.length();i++)
		{
			char c=exp.charAt(i);
			
			//if scanned character is operand
			if(Character.isLetterOrDigit(c))
			{
				result+=c;
				
			}
			else if(c=='(')
				stack.push(c);
			else if(c==')')
			{
				while(!stack.isEmpty() && stack.peek()!='(')
				
					result+=stack.pop();
					if(!stack.isEmpty() && stack.peek()!='(')
						return "Invalid Expression";
					else
						stack.pop();
					
				
				
			}
			else//if scanned character is operator
			{
				while(!stack.isEmpty() && Prec(c)<=Prec(stack.peek()))
				{
					result+=stack.pop();
				}
				stack.push(c);
				
			}
		}
			while(!stack.isEmpty())
				result+=stack.pop();
			
		
		return result;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String exp=s.nextLine();
		System.out.println(infixTopostfix(exp));
		
	}
}
