// 2373. Largest Local Values in a Matrix.
/*
We're given an n * n integer matrix grid.
Generate an integer matrix maxLocal of size (n-2) * (n-2) such that:
  maxLocal[i][j] is equal to the largest value of the 3 * 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 * 3 matrix in grid.
Return the generated matrix.
*/

class LargestLocalValueMatrix {
    // Method to find the largest element in every 3x3 subgrid
    public int[][] largestLocal(int[][] grid) {
        // Determine the size of the grid
        int gridSize = grid.length;
      
        // Initialize the answer grid with a reduced size
        // because the border elements can't form a complete 3x3 subgrid
        int[][] maxLocalValues = new int[gridSize - 2][gridSize - 2];
      
        // Iterate through the grid, considering each 3x3 subgrid
        for (int i = 0; i <= gridSize - 3; ++i) {
            for (int j = 0; j <= gridSize - 3; ++j) {
                // Initialize max value for the current 3x3 subgrid
                int maxVal = Integer.MIN_VALUE;
              
                // Nested loops to go through each element in the 3x3 subgrid
                for (int x = i; x <= i + 2; ++x) {
                    for (int y = j; y <= j + 2; ++y) {
                        // Update maxVal if a larger value is found
                        maxVal = Math.max(maxVal, grid[x][y]);
                    }
                }
              
                // Assign the largest value in the 3x3 subgrid to the answer grid
                maxLocalValues[i][j] = maxVal;
            }
        }
        // Return the answer grid containing the largest values of each subgrid
        return maxLocalValues;
    }
    
    public static void main(String[] args) {
        LargestLocalValueMatrix lgObj = new LargestLocalValueMatrix();
        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int lengthArr = grid.length;
        int[][] output = new int[lengthArr-2][lengthArr-2];
        output = lgObj.largestLocal(grid);
        for (int i = 0; i < lengthArr-2; i++) {
          for (int j = 0; j < lengthArr-2; j++) {
              System.out.print(" " + output[i][j]);
          }
          System.out.println();
        }
    }
}
