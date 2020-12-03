package practice.algorithms.problems;

import java.util.Arrays;
import java.util.Scanner;
public class SymmetricMatrixSolution {

    public static String SymmetricMatrix(String[] strArr) {
        String symmetricStr = "symmetric";
        String notSymmetricStr = "not symmetric";

        int numRows = 1;
        int numCols = 0;
        int maxCols = 0;
        for (String s: strArr) {
            numCols++;
            if (s.equals("<>")) {
                numRows++;
                numCols--;
                maxCols = numCols;

//                if (maxCols != 0 && numCols != numCols) {
//                    return notSymmetricStr;
//                }
                numCols = 0;
            }
        }

        if (numRows != maxCols) {
            return notSymmetricStr;
        }

        numCols = maxCols;

        int matrix[][]= new int[numRows][numCols];
        int matrix2[][]= new int[numCols][numRows];
        int t = 0;

        for(int i =0; i<numRows; i++)
        {
            for(int j =0;  j < numCols; j++)
            {
                if (strArr[t].equals("<>")) {
                    t++;
                }
//                int t = i + i*j + j;
//                if (!Character.isDigit(strArr[t])) {
//                    return notSymmetricStr;
//                }
                matrix[i][j] = Integer.parseInt(strArr[t]);
                t++;
            }
        }

        for(int i =0; i<numRows; i++)
        {
            for(int j =0;  j < numCols; j++)
            {
                matrix2[i][j] = matrix[j][i];
            }
        }

        boolean isSymmetric = true;
        for(int i =0; i<numRows; i++)
        {
            for(int j =0;  j < numCols; j++)
            {
                if (matrix[i][j] != matrix2[i][j]) {
//                    return notSymmetricStr;
                    isSymmetric = false;
                }
            }
        }


        System.out.println("Input matrix is");
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Its transpose matrix is");
        System.out.println(Arrays.deepToString(matrix2));
        System.out.println("=======");

        return isSymmetric ? symmetricStr : notSymmetricStr;

//        boolean symmetric = true;
//
//        if(symmetric)
//        {
//            System.out.println("The given matrix is Symmetric");
//            for(int i=0; i<numRows;i++)
//            {
//                for(int j=0; j<numCols;j++)
//                {
//                    System.out.print(matrix[i][j] + "\t");
//
//                }
//                System.out.println();
//            }
//            return symmetricStr;
//        }
//        else
//        {
//            for(int i=0; i<numRows;i++)
//            {
//                for(int j=0; j<numCols; j++)
//                {
//                    if(matrix[i][j]!= matrix[j][i]);
//                    {
//                        symmetric = false;
//                        System.out.println("The given matrix is not Symmetric");
//                        break;
//
//                    }
//
//                }
//            }
//            return notSymmetricStr;
//        }
    }

    public static void main(String[] args) {
//        String[] input1 = {"5", "0", "<>", "0", "5"};
//        String[] input2 = {"1", "2", "4", "<>", "2", "1", "1", "<>", "-4", "1", "-1"};
        String[] input3 = {"1", "0", "<>", "c", "1"};
        System.out.println(SymmetricMatrix(input3));
//        System.out.println(SymmetricMatrix(input2));
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the number of rows : ");
//        int numRows = scn.nextInt();
//        System.out.println("Enter the number of columns : ");
//        int numCols = scn.nextInt();
//        int matrix[][]= new int[numRows][numCols];
//        System.out.println("Enter the elements : ");
//        for(int i =0; i<numRows; i++)
//        {
//            for(int j =0;  j < numCols; j++)
//            {
//                matrix[i][j] = scn.nextInt();
//            }
//        }

        //checking the input matrix is square matrix
//        if(numRows != numCols)
//        {
//            System.out.println("The given matrix is not a square matrix. so it can not be symmetric");
//        }
        //checking the matrix is symmectric

    }
}
