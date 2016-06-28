package com.epam.bigvava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer k=null;
        int[] array1 = null;
        int[] array2 = null;
        while (array1 == null) {
            System.out.println("Enter size of 1 array");
            Integer size = parse(scanner.nextLine());
            if (size != null && size > 0) {
                array1 = new int[size];
            }
        }
        while (array2 == null) {
            System.out.println("Enter size of 2 array");
            Integer size = parse(scanner.nextLine());
            if (size!= null && size > 0) {
                array2 = new int[size];
            }
        }
        while (k == null){
            System.out.println("Enter k");
            k = parse(scanner.nextLine());
            if (k > array1.length && k <= 0){
                k = null;
            }
        }
        int i,j;

        for(i=0;i<array1.length;i++){
            array1[i]=i;
        }
        for (i=0;i<array2.length;i++){
            array2[i]=i;
        }

        int[] finalArray = concate(array1,array2,k);

        System.out.println("Array 1:");
        for (i=0;i<array1.length;i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        System.out.println("Array 2:");
        for (i=0;i<array2.length;i++) {
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        System.out.println("Final array:");
        for (i=0;i<finalArray.length;i++) {
            System.out.print(finalArray[i]+" ");
        }
    }

    public static Integer parse(String str){
        if (Pattern.matches("[0-9]+", str)){
            return Integer.parseInt(str);
        }
        return null;
    }

    public static int[] concate(int[] array1, int[] array2, int k){
        int size = array1.length+array2.length;
        int[] finalArray = new int[size];
        int i,j;
        for (i=0;i<k;i++){
            finalArray[i]=array1[i];
        }
        for (i=k;i<k+array2.length;i++){
            finalArray[i]=array2[i-k];
        }
        for (i=k+array2.length, j=0;i<size;i++,j++){
            finalArray[i]=array1[j+k];
        }
        return finalArray;
    }
}
