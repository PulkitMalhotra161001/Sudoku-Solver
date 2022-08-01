public class sudoku_solver {
	static boolean solved=false;
	public static void main(String[] args) {
		
		int a[][]= {{9, 0, 2, 0, 7, 8, 0, 0, 0}, 
                {1, 8, 0, 0, 0, 0, 7, 6, 0}, 
                {0, 7, 0, 5, 0, 0, 0, 0, 0}, 
                {7, 5, 0, 0, 0, 6, 0, 8, 4}, 
                {4, 0, 6, 0, 0, 0, 1, 5, 7}, 
                {0, 1, 0, 0, 4, 5, 3, 9, 6}, 
                {0, 2, 0, 0, 0, 0, 5, 0, 9}, 
                {6, 0, 9, 0, 0, 7, 8, 3, 0}, 
                {0, 0, 0, 9, 8, 4, 0, 7, 0}};
		
		print(a);
		System.out.println();
		solve_sudoku(a);

	}
	
	public static void solve_sudoku(int a[][]) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(a[i][j]<0 || a[i][j]>9) {
					System.out.println("Row: "+i+" Column: "+j+" Value is Invalid");
					System.out.print("Value's must be between 0 and 9");
					return;
				}
			}
		}
		solve(a,0,0);
	}
	
	
	public static void solve(int a[][],  int i,  int j) {
		if(i==9) {
			print(a);
			solved=true;
			return;
		}
		int ni=0, nj=0;
		if(j==8) {
			ni=i+1;
			nj=0;
		}
		else {
			ni=i;
			nj=j+1;
		}
		
		if(a[i][j]!=0)
			solve(a, ni, nj);
		else {
			for(int temp=1;temp<=9;temp++) {
				if(valid(a, i, j, temp)) {
					a[i][j]=temp;
					if(!solved)
						solve(a, ni, nj);
					a[i][j]=0;
				}
			}
		}
	}
	
	public static boolean valid(int a[][], int x, int y,  int val) {
		for(int j=0;j<9;j++) {
			if(a[x][j]==val)
				return false;
		}
		for(int i=0;i<9;i++) {
			if(a[i][y]==val)
				return false;
		}
		
		int start_i=x/3*3;
		int start_j=y/3*3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
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
