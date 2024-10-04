package Lec_2;

public class Pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(isPal(123));
	}
	public static boolean isPal(int n) {
		int temp=n;
		int rev=0;
		while(temp>0) {
			int d=temp%10;
		    rev=(rev*10)+d;
		    temp=temp/10;
		}
		if(n==rev) return true;
		else return false;
				
	}

}
