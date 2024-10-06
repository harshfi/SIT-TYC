package Lec_5;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(fact(5));
	}
	public static int fact(int n) {
		if(n==1) return 1;
		
		int smallFact= fact(n-1);
		return n*smallFact;
	}

}
