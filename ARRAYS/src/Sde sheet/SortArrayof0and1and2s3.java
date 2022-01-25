package StriversSdeSheet;

/*
 we are assuming that low contains 0 and mid contains 1s and high contains 2
 */

public class SortArrayof0and1and2s3 {
	
	public static void main(String args[]) {
		int arr[]= {1,2,0,2,1,2,0,1,2,0};
		sort(arr);
		System.out.print("The sorted array is: ");
		for(int a:arr)
			System.out.print(a);
	}
public static void sort(int arr[]) {
	int mid=0;
	int low=0;
	int temp;
	int  high=arr.length-1;
	while(mid<=high) {
		switch(arr[mid]) {
		case 0:{
			temp=arr[low];
			arr[low]=arr[mid];
			arr[mid]=temp;
			low++;
			mid++;
			break;
		}
		case 1:
			mid++;
			break;
		case 2:{
			temp=arr[high];
			arr[high]=arr[mid];
			arr[mid]=temp;
			high--;
			break;
		}
			
		}
	}
}
}


/*
 output
 The sorted array is: 0001112222
 */
