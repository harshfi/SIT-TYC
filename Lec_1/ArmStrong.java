package Lec_1;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=153;
      int cnt=digits(n);
      int temp=n;
      int sum=0;
      while(n>0) {
    	  int d=n%10;
    	  sum=sum+(int)(Math.pow(d, cnt));
    	n=n/10;
      }
      if(sum==temp)System.out.println("ArmStrong");
      else System.out.println("nahi hain pagal");
	}
	public static int digits(int n) {
		int cnt=0;
		while(n>0) {
			n=n/10;
			cnt++;
		}
		return cnt;
	}

}
