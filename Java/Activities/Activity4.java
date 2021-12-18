package activities;

public class Activity4 {
	
	public static void main(String[] args)
	{
		
		int arr1[]= {20,5,40,22,90,80,10};
		System.out.println("Elements before sorting is :");
		 for(int i=0;i<arr1.length;i++)
		 {
			 System.out.println(arr1[i]);
		 }
		 
     }
	
	static void insertionSort(int arr1[])
	{
		for(int i=1;i<arr1.length;i++)
		{
			int key =arr1[i];
			int j=i-1;
			while(j>=0 && key<arr1[j])
			{
				arr1[j]=arr1[j+1];
			}
			
		}
	}

}
