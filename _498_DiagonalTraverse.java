package com.javadwarf.matrix.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class _498_DiagonalTraverse {
	
//Logic : diagonal elements will have same sum of row and column index
//time : o(m*n) and space o(m+n)

public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0 ) return new int[0];
		
		LinkedList<Integer>[] arr = new LinkedList[matrix.length+matrix[0].length-1];
		for(int i=0; i<arr.length;i++) 
			arr[i] = new LinkedList<Integer>();

		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if( (i+j) %2 == 0)
					arr[i+j].addFirst(matrix[i][j]);
				else
					arr[i+j].addLast(matrix[i][j]);         
			}
		}

		int[] res = new int[matrix.length*matrix[0].length];
		for(int i=0,x=0; i<arr.length; i++){
			for(int curr : arr[i])
				res[x++] = curr; 
		}
		return res;
	}

}
