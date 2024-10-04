package Lec_4;

public class TechManQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="HARSH";
       int diff='a'-'A';
       for (int i = 0; i < s.length(); i++) {
		System.out.print((char)(s.charAt(i)+diff));
	}
	}

}
