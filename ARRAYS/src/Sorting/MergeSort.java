package Sorting;

public class MergeSort {
	
	public static void merge(int arr[],int l,int mid,int h)
	{ int i=l;
	 int j=mid+1;
	 int k=0;
	 int arr1[]=new int[100];
	 while(i<=mid && j<=h)
	 { if(arr[i]<arr[j])
			   arr1[k++]=arr[i++];
		   else
	        arr1[k++]=arr[j++];
	 }
	for(;i<=mid;i++)
		arr1[k++]=arr[i];
	for(;j<=h;j++)
		arr1[k++]=arr[j];
	for(i=l;i<h;i++)
		arr[l]=arr1[l];
	}
	
	
	
	public static void mergesort(int arr[],int l,int h)
	{ int mid;
	   if(l<h)
	   {mid=(l+h)/2;
	   mergesort(arr,l,mid);
	   mergesort(arr,mid+1,h);
	   merge(arr,l,mid,h);
	   
	   }
		
	}

	 public static void main(String a[]){    
	        int[] arr1 = {9,14,3,2,43,11,58,22};    
	      
	        mergesort(arr1,0,arr1.length);//sorting array using selection sort    
	              
	        for(int i=0;i<arr1.length;i++){    
	            System.out.print(arr1[i]+" ");    
	        }    
	        }
}
