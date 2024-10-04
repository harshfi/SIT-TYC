package Lec_3;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {4,7,8,11,44,66,88};
       System.out.println(BSearch(arr,66));
	}
	
	public static int BSearch(int a[],int target) {
		int s=0;
		int e=a.length-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(a[mid]==target) return mid;
			else if(a[mid]>target) e=mid-1;
			else s=mid+1;
		}
		return -1;
	}

}
