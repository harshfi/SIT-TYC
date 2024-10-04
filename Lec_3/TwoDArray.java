package Lec_3;
import java.util.*;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[][]=new int[3][4];
       Scanner h = new Scanner(System.in);
       
       for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[0].length; j++) {
			arr[i][j]=h.nextInt();
		}
	}
       print(arr);
       
	}
	
	public static void print(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
