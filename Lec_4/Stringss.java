package Lec_4;

public class Stringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Harsh";
        //charAt(index)
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(4));
        
        //length()
        System.out.println(str.length());
        
        //substring(idx,idx1)
        System.out.println(str.substring(2,4));
        System.out.println(str.substring(1));
        
        // trim()
        String s="      pagal hain kya      ";
        System.out.println(s);
        System.out.println(s.trim());
        
        char ch[]=str.toCharArray();
	}

}
