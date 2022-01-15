package DynamicProgramming;

public class noOfPosibleWaysForGivenSum {


	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int n=arr.length-1;
		int sum=4;
		
		System.out.println(onOfWaysForGivenSum(arr,sum,n));
		
	}
	public static int onOfWaysForGivenSum(int arr[],int sum,int n) {
	   
		if(sum==0)
		{   
		      return 1;
		}
		if(sum<0)
			return 0;
		if(n<0)
			return 0;
		int max=onOfWaysForGivenSum(arr,sum-arr[n],n)+onOfWaysForGivenSum(arr,sum,n-1);
		return max;
	}

}
