package com.epam.bigvava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = null, i;
        while (n == null) {
            System.out.println("Enter even N - size of matrix");
            n = parseForEven(scanner.nextLine());
        }
        int[][] matrix = new int[n][n];
        System.out.println("Matrix is");
        for (i=0;i<n;i++){
            if(i%2==0){
                for(int j = 0; j < n; j++){
                    matrix[i][j] = j+1;
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            } else {
                for(int j = 0; j<n; j++){
                    matrix[i][j] = n-j;
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static Integer parseForEven(String str){
        if (Pattern.matches("[0-9]+", str)){
            Integer n = Integer.parseInt(str);
            if (n % 2 == 0 && n != 0){
                return n;
            }
        }
        return null;
    }
}
