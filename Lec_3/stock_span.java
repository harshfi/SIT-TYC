package Lec_3;

public class stock_span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {7,1,5,3,6,4};
      System.out.println(maxProfit(arr));
	}
	public static int maxProfit(int[] p) {
		int profit=0;
		int max=p[p.length-1];
		
		for(int i=p.length-2;i>=0;i--) {
			if(max-p[i]>profit)profit=max-p[i];
			
			
			if(max<p[i])max=p[i];
		}
		return profit;
	}

}
