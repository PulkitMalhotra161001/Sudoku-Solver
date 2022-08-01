public class sudoku_solver {
	public static void main(String[] args) {
		
		int a[][]= {{9, 0, 2, 0, 7, 8, 0, 0, 0}, 
	                {1, 8, 0, 0, 0, 0, 7, 6, 0}, 
	                {0, 7, 0, 5, 0, 0, 0, 0, 0}, 
	                {7, 5, 0, 0, 0, 6, 0, 8, 4}, 
	                {4, 0, 6, 0, 5, 0, 1, 5, 7}, 
	                {0, 1, 0, 0, 4, 5, 3, 9, 6}, 
	                {0, 2, 0, 0, 0, 0, 5, 0, 9}, 
	                {6, 0, 9, 0, 0, 7, 8, 3, 0}, 
	                {0, 0, 0, 9, 8, 4, 0, 7, 0}};
		
		print(a);
		System.out.println();

    boolean iv=true;
		for(int i=0;i<9 && iv;i++) {
			for(int j=0;j<9 && iv;j++) {
				if(a[i][j]==0)	continue;
				iv=validator(a, i, j, a[i][j]);
			}
		}
		System.out.println("Valid: "+iv);
    
	}
	
	
	public static boolean validator(int a[][], int x, int y,  int val) {
		for(int j=0;j<9;j++) {
			if(j==y)	continue;
			if(a[x][j]==val)
				return false;
		}
		for(int i=0;i<9;i++) {
			if(i==x)	continue;
			if(a[i][y]==val)
				return false;
		}
		
		int start_i=x/3*3;
		int start_j=y/3*3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(start_i+i==x && start_j+j==y)continue;
				if(a[start_i+i][start_j+j]==val)
					return false;
			}
		}
		return true;
	}
	
	public static void print(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
