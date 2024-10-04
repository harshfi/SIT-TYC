package Lec_2;

public class BostonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n = 378;
      int SOD=sumofDigit(n);
      int SOF=sumOfFactor(n);
      System.out.println(SOD+" "+SOF);
      if(SOD==SOF)System.out.println(true);
      else System.out.println("false");
	}
	public static int sumofDigit(int n) {
		int sum=0;
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}
	public static int sumOfFactor(int n) {
		int sum=0;
		int fact=2;
		while(n>1) {
			if(n%fact==0) {
			   sum=sum+sumofDigit(fact);
			   n=n/fact;
			}
			else fact++;
		}
		return sum;
	}

}
