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
			
		
			  
            if (ar1[i - 1] > ar1[i])    //to check if previous element of an array is greater than current element
                return false; //if it is so, then the array isn't sorted in an ascending order
		// and hence it is not stack sortable
  
        
        return true; //else it is a stack sortable
		
		
		    
		
		
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
              //use this method to get single line user input array in a Java
	      System.out.println("Please enter numbers to store it in an array:");
	      String numbers = s.nextLine(); //giving input of multiple numbers and storing them as a whole string

	      String ar[] = numbers.split(" "); //splitting whole string and storing them into string array
          int n=ar.length;//finding length of string array
	      int a[] = new int[n];//defining integer array where the numbers will be stored in integer datatype
	      for (int i = 0; i < a.length; ++i) {
	          a[i] = Integer.parseInt(ar[i]);//parsing string into integer and storing numbers in integer datatype
	      }
		System.out.println(check(a)); //calling function
	}

}
