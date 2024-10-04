package Lec_2;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 2546;
		int sum=0;
		while(n>0) {
			int d=(n%10);
			sum=sum+d;
			n=n/10;
			
		}
		System.out.println(sum);
		

	}

}
