package Lec_1;
import java.util.*;
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner h = new Scanner(System.in);
        int n=h.nextInt();
        //row
        for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
