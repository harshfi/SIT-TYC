package Lec_2;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=123;
       int temp=n;
       int rev=0;
       while(temp>0) {
    	   int d=temp%10;
    	   rev=(rev*10)+d;
    	   temp=temp/10;
       }
       System.out.println(rev);
	}

}
