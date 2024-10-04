package Lec_4;

public class Neg_NumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{4,3,2,-1},
				    {3,2,1,-1},
				    {1,1,-1,-2},
				    {-1,-1,-2,-3}};
		int count=0;
		for (int row = 0; row < a.length; row++) {
			int idxNeg= find(a[row]);
			count=count+(a[row].length-idxNeg);
		}
		System.out.println(count);
	}
	public static int find(int []arr) {
		if(arr[0]<0) return 0;
		int ans=arr.length;
		int s=0;
		int e= arr.length-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(arr[mid]<0) {
				ans=mid;
				e=mid-1;
			}
			else s=mid+1;
		}
		return ans;
	}

}
