// Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s. 
// Input matrix : 0 1 1 1
//                         0 0 1 1
//                         1 1 1 1  // this row has maximum 1s
//                         0 0 0 0
// Output: 2


import java.io.*;

class RowWithMaximum1s {
	static int R = 4, C = 4;

	static int rowWithMax1s(int mat[][])	{
		int j,max_row_index = 0;
			j = C - 1;

		for (int i = 0; i < R; i++) {
			while (j >= 0 && mat[i][j] == 1) {
				j = j - 1;
				max_row_index = i;
			}
		}
		if(max_row_index==0&&mat[0][C-1]==0)
			return -1;
		return max_row_index;
	}
	public static void main(String[] args) {
		int mat[][] = { { 0, 0, 0, 1 },
						{ 0, 1, 1, 1 },
						{ 1, 1, 1, 1 },
						{ 0, 0, 0, 0 } };
		System.out.println("Index of row with maximum 1s is "+ rowWithMax1s(mat));
	}
}
