package Lec_2;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner h = new Scanner (System.in);
        int arr[] = new int[5];
         for (int i = 0; i < arr.length; i++) {
			arr[i]= h.nextInt();
		}
         int sum=0;
         for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
         System.out.println(sum);
	}

}
