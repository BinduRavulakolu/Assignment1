
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,temp;
         int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
         System.out.println("The numbers are:");
         //for(int k=0;k<x-1;k++)
         //{
        //	 System.out.println(arr[k]);
        // }
         int x=arr.length;
         for(int k=0;k<x-1;k++)
         {
        	 System.out.println(arr[k]);
         }
         for(i=0;i<x-1;i++)
         {
        
        	 for(j=0;j<x-i-1;j++)
        	 {
        		 if(arr[j]>arr[j+1])
        		 {
        			 temp=arr[j];
        			 arr[j]=arr[j+1];
        			 arr[j+1]=temp;
        		 }
        	 }
         }
         System.out.println("the sorted numbers are:");
         for(int k=0;k<x-1;k++)
         {
        	 System.out.println(arr[k]);
         }
	}

}
