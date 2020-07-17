//Program to convert prefix to infix conversion
import java.util.Stack;
import java.util.Scanner;
class Prefix_to_Infix
{
	static String convert(String exp)
	{
		String result=new String("");
		String temp=new String("");
		Stack<String> stack=new Stack<>();
		for(int i=exp.length()-1;i>=0;i--) 
		{
			char c=exp.charAt(i);
			if(isOperator(c))
			{
				String s1=stack.pop();
				String s2=stack.pop();
				temp='('+s1+c+s2+')';
				stack.push(temp);
				
			}
			else
			{
				stack.push(c+"");
				
			}
		}
		result=stack.pop();
		return result;
				
	}
	static boolean isOperator(char ch)
	{
		switch(ch)
		{
		case '+':
		case '-':
		case '*':
		case '/':
		case '^':
			return true;
		}
		return false;
		
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String exp=s.nextLine();
		System.out.println(convert(exp));
		
	}
}
