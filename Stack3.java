// JavaProgram to convert prefix to postfix 
import java.util.*; 

class Stack3
{ 

// funtion to check if character 
// is operator or not 
static boolean isOperator(char x) 
{ 
	switch (x) 
	{ 
		case '+': 
		case '-': 
		case '/': 
		case '*': 
		return true; 
	} 
	return false; 
} 

// Convert prefix to Postfix expression 
static String preToPost(String exp) 
{ 
    String result=new String("");
	Stack<String> s= new Stack<String>(); 

	// length of expression 
	

	// reading from right to left 
	for (int i = exp.length() - 1; i >= 0; i--) 
	{ 
          char c=exp.charAt(i);
		// check if symbol is operator 
		if (isOperator(c)) 
		{ 

			// pop two operands from stack 
			String op1 = s.pop(); 
			String op2 = s.pop(); 

			// concat the operands and operator 
			String temp = op1 + op2 + c; 

			// Push String temp back to stack 
			s.push(temp); 
		} 

		// if symbol is an operand 
		else
		{ 
			// push the operand to the stack 
			s.push(c+""); 
		} 
	} 
           result=s.pop();
	// stack contains only the Postfix expression 
	return result; 
} 

// Driver Code 
public static void main(String args[]) 
{ 
	String pre_exp = "*-A/BC-/AKL"; 
	System.out.println("Postfix : " + preToPost(pre_exp)); 
} 
} 

