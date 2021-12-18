package activities;


public class Activity2 {
    public static void main(String[] args) {
    
    int num[]= {10, 77, 10, 54, -11, 10};
    int search =10;
    int sum =30;
    System.out.println("Array is :"+ result(num,search,sum));
    
    }  
    static boolean result(int num[],int search, int sum)
    {
    	int our_sum =0;
    	for(int number:num) 
    	{
    		if(number==search)
    		{
    			our_sum= our_sum+number;
    		}
    		if(our_sum>sum)
    		{
    			break;
    		}
    		
    	}
    	System.out.println("Value is :"+our_sum);
		
    	
    	return our_sum==sum;
    	
    }   
}
    
   