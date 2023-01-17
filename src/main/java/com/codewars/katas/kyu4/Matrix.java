package com.codewars.katas.kyu4;

public class Matrix {

	// https://www.codewars.com/kata/52a382ee44408cea2500074c/train/java
	
	// Math base:
	// https://www.matesfacil.com/matrices/resueltos-matrices-determinantes.html
	
    public static int determinant(int[][] matrix) {

    	if(matrix.length == 1) {
    		// 1x1 matrix
        	return matrix[0][0]; 
        } else if(matrix.length == 2) {
        	// 2x2 matrix
        	return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
    	
    	int result = 0;		
    	
    	for(Integer i = 0; i < matrix.length; i++) {
    		result += Math.pow(-1, i.doubleValue()) * matrix[0][i] * Matrix.determinant(Matrix.minorMatrix(matrix, i));
    	}
    	
        return result;
    }
    
    public static int[][] minorMatrix(int[][] matrix, int colIndex) {

    	int matrixSize = matrix.length;
    	int minorMatrixSize = matrixSize-1;
    	int[][] minorMatrix = new int[minorMatrixSize][minorMatrixSize];
    	
    	int minorRow = 0;
    	for(int row = 1; row < matrixSize; row++) {
    		int minorCol = 0;
    		 for(int col = 0; col < matrixSize; col++) {
    			 if(col != colIndex) {
    				 minorMatrix[minorRow][minorCol++] = matrix[row][col];
    			 }
    		 }
    		 minorRow++;
    	}
    	
    	return minorMatrix;
    	
    }
    
    public static void printMatrix(int[][] matrix) {
    	System.out.println();
    	System.out.println();
    	for(int i = 0; i < matrix.length; i++) {
    		for(int j = 0; j < matrix.length; j++) {
    			System.out.print(matrix[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
}
