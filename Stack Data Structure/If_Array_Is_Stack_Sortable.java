//Java Program to check whether array can be sorted using stack
import java.util.*;

class If_Array_Is_Stack_Sortable 
{
	static boolean check(int ar[])
	{
		Stack<Integer> stack=new Stack<>();
		int n=ar.length;
		for(int i=0;i<=n-1;i++)
		{
			int c=ar[i];
			stack.push(c);
		}	
		int[] ar1;
		ar1 = new int[n];// allocating memory for 5 integers. 
		for(int i=0;i<=n-1;i++)
		{	
		    	
		    		ar1[i]=stack.pop();
		    	
		    	
		    	
        }
		for(int i=1;i<=n-1;i++)
			
		
			  // Unsorted pair found 
            if (ar1[i - 1] > ar1[i]) 
                return false; 
  
        // No unsorted pair found 
        return true; 
		
		
		    
		
		
	}
	public static void main(String[] args)
	{
		int a[]= {3,2,1};
		
		System.out.println(check(a));
	}

}
