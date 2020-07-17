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
		import java.util.*;

class Stack4 
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
		Scanner s = new Scanner(System.in);

	      System.out.println("Enter numbers you want to store in Array");
	      String numbers = s.nextLine();//reading numbers and storing them as String datatype so to separate them afterwards and store it in array

	      String ar[] = numbers.split(" "); //splitting string by space and storing it in string array
          int n=ar.length;//finding length of "ar" array and storing it in "n" variable
	      int a[] = new int[n]; //creating integer array 
	      for (int i = 0; i < a.length; ++i) {
	          a[i] = Integer.parseInt(ar[i]); //numbers stored in "ar" are being parsed into integer and then storing it in an integer array
	      }
		System.out.println(check(a));
	}

}

	
