package Lec_3;

public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int ans[][]= trans(arr);
		print(ans);
		
	}
	public static int[][] trans(int arr[][]){
		int ans[][] = new int [arr[0].length][arr.length];
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				ans[i][j]=arr[j][i];
			}
		}
		return ans;
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
