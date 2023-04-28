package com.denisfesenko;

/**
 * In a 2D matrix, every row ins increasingly sorted from left to right. Last number in each row is not
 * greater than first number in next row. Write java function to check if there is a number in the matrix
 * <p>
 * We first find the number of rows and columns in the matrix.
 * We initialize two pointers, left and right, to the first and last indices of the matrix, respectively.
 * We enter a while loop that continues until left and right meet or cross each other. Inside the loop, we find the middle index mid between left and right.
 * We calculate the row and column indices of the middle element using integer division and modulo operations.
 * We compare the middle element with the target value. If they are equal, we return true to indicate that the target was found.
 * If the middle element is less than the target, we update left to mid + 1 to search the right half of the remaining matrix.
 * If the middle element is greater than the target, we update right to mid - 1 to search the left half of the remaining matrix.
 * If we reach the end of the while loop without finding the target, we return false to indicate that the target was not found in the matrix.
 * Note that this function assumes that the matrix is non-empty and that each row has at least one element.
 * If these assumptions do not hold, you may need to add additional checks at the beginning of the function to handle edge cases.
 */
public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        int target1 = 3;
        int target2 = 13;

        if (searchMatrix(matrix, target1)) {
            System.out.println("Found " + target1 + " in the matrix!");
        } else {
            System.out.println("Could not find " + target1 + " in the matrix.");
        }

        if (searchMatrix(matrix, target2)) {
            System.out.println("Found " + target2 + " in the matrix!");
        } else {
            System.out.println("Could not find " + target2 + " in the matrix.");
        }
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int left = 0, right = numRows * numCols - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int row = mid / numCols;
            int col = mid % numCols;
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
