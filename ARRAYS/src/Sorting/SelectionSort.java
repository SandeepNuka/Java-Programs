package Sorting;
/* after completion of iteration we will find the smallest element index 
*then we swap the smallest element with the element present at arr[i]
*/

public class SelectionSort {
	 
	 public static void sort(int arr[],int  n)
	   {  int k,i,j,temp=0;
		   for( i=0;i<n-1;i++)
		   { 
	        for(k=j=i;j<n;j++)
	           {  if(arr[j]<arr[k])
		            k=j;  
	            } 
	   temp=arr[i];
	   arr[i]=arr[k];
	   arr[k]=temp;
	   }
		   
	   }
	
	 public static void main(String a[]){    
	        int[] arr1 = {9,14,3,2,43,11,58,22};    
	      
	        sort(arr1,arr1.length);//sorting array using selection sort    
	              
	        for(int i=0;i<arr1.length;i++){    
	            System.out.print(arr1[i]+" ");    
	        }    
	        }
}
