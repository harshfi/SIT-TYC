package Lec_5;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Toss("",2);
	}
	public static void Toss(String ans, int n) {
		//base 
		if(n==0) {
			System.out.println(ans);
			return ;
		}
		//head
		Toss(ans+"H",n-1);
		//tail
		Toss(ans+"T",n-1);
	}

}
