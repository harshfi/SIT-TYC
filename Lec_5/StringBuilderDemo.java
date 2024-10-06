package Lec_5;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder();
		String str= "";
		System.out.println("Start String");
		for (int i = 0; i < 500000; i++) {
			str=str+"a";
		}
		System.out.println("End String");
		
		
		System.out.println("Start Builder");
		for (int i = 0; i < 500000; i++) {
			sb.append("a");
		}
		System.out.println("End Builder");
		

	}

}
