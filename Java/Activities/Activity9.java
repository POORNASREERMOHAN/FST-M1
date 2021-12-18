package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) 
	{
		ArrayList<String>  myList = new ArrayList<String>();
		{
		
         myList.add("meghna");
         myList.add("poorna");
         myList.add("shreya");
         myList.add("ganga");
         myList.add("lakshmi");
         for(String num:myList)
         {
        	 System.out.println(num);
         }
         System.out.println("3rd element is :"+myList.get(3));
         System.out.println("Element is present :"+myList.contains("ganga"));
         System.out.println("Size of array is :"+myList.size());
         myList.remove(2);
         System.out.println("Size of array is :"+myList.size());
	     }
	
	
	}
	
	
}