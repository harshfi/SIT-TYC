package Lec_3;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {4,6,9,11,3,1};
       System.out.println(Peak(a));
	}
	static int  Peak(int a[]) {
		int s=0;
		int e=a.length-1;
		
		while(s<=e) {
			int mid=(s+e)/2;
			
			if(a[mid]<a[mid+1]) s=mid+1;
			else e=mid-1;
		}
		return s;
	}

}
