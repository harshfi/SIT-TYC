package Lec_5;

public class Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subseq("abc",0,"");

	}
	public static void subseq(String str, int i, String ans) {
		//base
		if(str.length()==i) {
			System.out.println(ans);
			return ;
		}
		//pick
		subseq(str,i+1,ans+str.charAt(i));
		//not pick
		subseq(str,i+1,ans);
	}

}
