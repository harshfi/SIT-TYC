package Lec_2;

public class LinerSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= { 1,5,6,8,-1,3};
       int flag=0;
       for (int i = 0; i < arr.length; i++) {
		if(arr[i]==10) {
			flag=1;
			System.out.println("mel gaya");
			break;
		}
	}
      if(flag==0)System.out.println("nahi mela"); 
	}

}
