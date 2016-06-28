package com.epam.bigvava;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n=null, k=null;
        while (n == null || n<=0) {
            System.out.println("Enter N - count of natural numbers");
            n = parse(scanner.nextLine());
        }
        while (k == null) {
            System.out.println("Enter K");
            k = parse(scanner.nextLine());
        }
        int[] naturals = new int[n];
        int i;
        for (i=0;i<n;i++){
            naturals[i] = i+1;
        }
        System.out.println("Sum of natural numbers multiply K is "+sum(naturals, k));

    }

    public static Integer parse(String str){
        if (Pattern.matches("-?[0-9]+", str)){
            return Integer.parseInt(str);
        }
        return null;
    }

    public static int sum(int[] naturals, int k){
        ArrayList<Integer> divisibled = new ArrayList<>();
        int i;
        for (i=0; i<naturals.length; i++){
            if (naturals[i]%k == 0){
                divisibled.add(naturals[i]);
            }
        }
        int sum = 0;
        for (i=0; i<divisibled.size(); i++){
            sum += divisibled.get(i);
        }
        return sum;
    }
}