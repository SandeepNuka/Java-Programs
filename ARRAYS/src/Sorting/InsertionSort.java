package Sorting;

public class InsertionSort {
	
	    public static void sort(int array[],int n) { 
	        for (int i = 1; i < n; i++) {  
	            int key = array[i];  
	            int j = i-1;  
	            while ( (j > -1) && ( array [j] > key ) ) { // it will check the give eleme is less then arr[j] 
	                array [j+1] = array [j];  
	                j--;  
	            }  
	            array[j+1] = key;  
	        }   
	    }
	    public static void main(String a[]){    
	        int[] arr1 = {9,14,3,2,43,11,58,22};    
	      
	        sort(arr1,arr1.length);//sorting array using insertion sort    
	              
	        for(int i=0;i<arr1.length;i++){    
	            System.out.print(arr1[i]+" ");    
	        }    
	        }
            }
