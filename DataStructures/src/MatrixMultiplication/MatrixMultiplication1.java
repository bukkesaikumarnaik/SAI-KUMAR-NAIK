package MatrixMultiplication;

import java.io.*;
import java.util.*;
 

public class MatrixMultiplication1 {
	    static int R1 = 4; // number of rows in Matrix-1
	    static int C1 = 4; // number of columns in Matrix-1
	    static int R2 = 4; // number of rows in Matrix-2
	    static int C2 = 4; // number of columns in Matrix-2
	     
	    static void mulMat(int[][] mat1, int[][] mat2)
	    {
	        int[][] result = new int[R1][C2];
	        System.out.println("Multiplication of given two matrices is:");
	        int i, j, k;
	        for (i = 0; i < R1; i++) {
	            for (j = 0; j < C2; j++) {
	                result[i][j] = 0;
	                for (k = 0; k < R2; k++)
	                    result[i][j] += mat1[i][k] * mat2[k][j];
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println("");
	        }
	    }
	     
	    // Driver program
	    public static void main (String[] args) {
	        int[][] mat1 = { { 1, 1, 1, 1 },
	                         { 2, 2, 2, 2 },
	                         { 3, 3, 3, 3 },
	                         { 4, 4, 4, 4 } };
	  
	        int[][] mat2 = { { 1, 1, 1, 1 },
	                         { 2, 2, 2, 2 },
	                         { 3, 3, 3, 3 },
	                         { 4, 4, 4, 4 } };
	                          
	        /*
	        // Rectangular Matrices
	        // R1 = 3, C1 = 4 and R2 = 4, C2 = 3 (Update these values in the global variables)
	        int mat1[][] = {
	                        {1, 1, 1, 1},
	                        {2, 2, 2, 2},
	                        {3, 3, 3, 3} };
	      
	        int mat2[][] = {
	                        {1, 1, 1},
	                        {2, 2, 2},
	                        {3, 3, 3},
	                        {4, 4, 4} };
	        */
	  
	        if (C1 != R2) {
	            System.out.println("The number of columns in Matrix-1  must be equal to the number of rows in Matrix-2");
	            System.out.println("Please update the global variables according to your array dimension");
	        }
	        else {
	            mulMat(mat1, mat2);
	        }
	    }
	}