package Lec_2;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {6,8,1,9};
		int ans[]= twoSum(arr,17);
		System.out.println(ans[0]+" "+ans[1]);
		
		
	}
	public static int [] twoSum(int arr[],
			int target) {
		
		int ans[]=new int [2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					ans[0]=i;
					ans[1]=j;
					return ans;
				}
			}
		}
		return ans;
	}

}
