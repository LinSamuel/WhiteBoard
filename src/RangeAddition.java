
public class RangeAddition {
	
	public static void printMatrix(int[][] matrix, int row, int col){
		for(int i = 0; i < row; i++){
			System.out.print("[ ");
			for(int j = 0; j < col; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("] ");
		}
	}
	
	public static int[][] increaseMatrixValues(int[][] currMatrix, int row, int col){
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				currMatrix[i][j]++;
			}
		}
		return currMatrix;
	}
	
	public static int maxCount(int m, int n, int[][] ops){
		for(int rowi = 0; rowi < ops.length; rowi++){		
			int[] theOperation = ops[rowi];
			
			int numRowsInc = theOperation[0];
			int numColsInc = theOperation[1];
			
			if (numRowsInc == 0 || numColsInc == 0){
				continue;
			}
			
			m = Math.min(numRowsInc, m);
			n = Math.min(numColsInc, n);
		}
		return m * n;
	}
	
	public static int maxCount2(int m, int n, int [][] ops){
		
		int[][] finalMatrix = new int[m][n];
		
		for(int rowi = 0; rowi < ops.length; rowi++){
			
			int[] theOperation = ops[rowi];
			
			int numRowsInc = theOperation[0];
			int numColsInc = theOperation[1];
			
			finalMatrix = increaseMatrixValues(finalMatrix, numRowsInc, numColsInc);
		}
		printMatrix(finalMatrix, m, n); //For debug visualization purposes
		int highestValue = finalMatrix[0][0]; //Highest value should be in the upper left corner of the matrix
		int counter = 0;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if (finalMatrix[i][j] == highestValue){
					counter++;
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		int rows = 3;
		int cols = 3;
		int[][] operations = {{2,2},{3,3},{1,1}, {1,1}};
		
		System.out.println(maxCount(rows, cols, operations));

	}

}
