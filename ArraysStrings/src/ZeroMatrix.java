import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ZeroMatrix {
	
	public int[][] findZeroes(int[][] M){
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		for(int i = 0; i < M.length; i ++){
			int[] row = M[i];
			for(int j = 0; j < row.length; j++){
				if(M[i][j] == 0){
					x.add(i);
					y.add(j);
				}
			}
		}
		System.out.println(x);
		System.out.println(y);
		
		for(int r = 0; r < x.size(); r++){
			for(int j = 0; j < M[r].length; j++){
				M[r][j] = 0;
			}
		}
		for(int s = 0; s < y.size(); s++){
			for(int i = 0; i < M.length; i++){
				M[i][s] = 0;
			}
		}
		
		for(int i = 0; i < M.length; i ++){
		
			for(int j = 0; j < M[i].length; j++){
				System.out.print(M[i][j]);
			}
			System.out.println();
			
		}
		return M;
	}
	
	public static void main(String[] args){
		ZeroMatrix test = new ZeroMatrix();
		int[][] M = {{1,2,3,0,3},{5,3,7,8,9},{2,6,9,1,0}};
		System.out.println(test.findZeroes(M));
		
	}
}
