package com.javadwarf.matrix.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _54_SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				  {1, 2, 3, 4},
				  {5, 6, 7, 8},
				  {9,10,11,12}
				};
		int[][] matrix1 = {
				  {1, 2}
				};
		
		int[][] matrix2 = {
				  {1},{2}
				};
		
		int[][] matrix3 = {{2,5,8},{4,0,-1}};
		System.out.println(new _54_SpiralMatrix().spiralOrder(matrix2));
	}


	//time and space o(n*m)  
	public List<Integer> spiralOrder(int[][] matrix) {
		
		List<Integer> res = new ArrayList<>();
		
		if(matrix == null || matrix.length == 0) return res;

		int startRow = 0;
		int endRow = matrix.length-1;
		int startCol = 0;
		int endCol = matrix[0].length-1;

		while(startRow<=endRow && startCol<=endCol) {

			for(int i=startCol; i<=endCol; i++) {
				res.add(matrix[startRow][i]);
			}

			for(int i=startRow+1; i<=endRow; i++) {
				res.add(matrix[i][endCol]);
			}

			for(int i=endCol-1; i>=startCol && endRow>startRow; i--) {
				res.add(matrix[endRow][i]);
			}

			for(int i=endRow-1; i>=startRow+1 && endCol>startCol; i--) {
				res.add(matrix[i][startCol]);
			}

			startRow++;
			endRow--;
			startCol++;
			endCol--;
		}

		return res;

	}

}
