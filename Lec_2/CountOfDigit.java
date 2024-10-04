package Lec_2;

public class CountOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int n=255565;
		int find=5;
		int cnt=0;
		while(n>0) {
			int d= n%10;
			if(d==find)cnt++;
			n=n/10;
		}
		System.out.println(cnt);

}
}
