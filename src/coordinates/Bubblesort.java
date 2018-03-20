package coordinates;

public class Bubblesort {
	public static void main(String[] args)
	{
		int arr[]={3,60,54,75,156,23,86};
		System.out.println("array before sort");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		bubbleSort(arr); 
        
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

	}
		
		private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		
	}

		Bubblesort(int[] arr)
		{
			int  temp=0;
			for(int i = 0;i<arr.length;i++)
			{
				for(int j=1;j<((arr.length)-i);j++)
				{
					if(arr[j-1] > arr[j]){
						
					
					temp=arr[j-1];
					arr[j-1]= arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		
		
	}
}


