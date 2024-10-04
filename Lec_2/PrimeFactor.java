package Lec_2;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=100;
       int fact=2;
       while(n>1) {
    	   if(n%fact==0) {
    		   System.out.print(fact+" ");
    		   n=n/fact;
    	   }
    	   else fact++;
       }
	}

}
