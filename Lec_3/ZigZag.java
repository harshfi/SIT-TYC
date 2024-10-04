package Lec_3;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[][]= {{1,2,3},{4,5,6},{7,8,9},{4,3,1}};
       
       for (int row = 0; row < a.length; row++) {
		if(row%2==0) {
			for (int i = 0; i < a[row].length; i++) {
				System.out.print(a[row][i]+" ");
			}
		}
		else {
			for (int i = a[row].length-1; i >=0; i--){
				System.out.print(a[row][i]+" ");
			}
		}
//		System.out.println();
	}
	}

}
