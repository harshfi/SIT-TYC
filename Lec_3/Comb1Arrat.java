package Lec_3;

import java.util.Scanner;

public class Comb1Arrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[][]= new int[3][];
      arr[0]= new int [2];
      arr[1]= new int [3];
      arr[2]= new int [1];
      Scanner h = new Scanner(System.in);
      
      for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j]=h.nextInt();
		}
	}
      print(arr);
	}
	public static void print(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
