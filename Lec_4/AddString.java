package Lec_4;

public class AddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addStrings("56","44"));

	}
	public static String addStrings(String num1, String num2) {
		int i= num1.length()-1;
		int j= num2.length()-1;
		int c=0;
		String ans="";
		while(i>=0 && j>= 0) {
			int d=(num1.charAt(i)-'0')
					+(num2.charAt(j)-'0')+c;
			
			ans=(d%10)+ans;
			c=d/10;
			i--;
			j--;
		}
		while(i>=0) {
			int d=(num1.charAt(i)-'0')
					+c;
			
			ans=(d%10)+ans;
			c=d/10;
			i--;
		}
		while(j>=0) {
			int d=(num2.charAt(j)-'0')
					+c;
			
			ans=(d%10)+ans;
			c=d/10;
			j--;
		}
		if(c>0) ans=c+ans;
		return ans;
	}

}
