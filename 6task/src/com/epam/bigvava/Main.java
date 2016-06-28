package com.epam.bigvava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = new Integer[3];
        for (int i=0; i<3; i++){
            numbers[i]=null;
            while (numbers[i]==null) {
                System.out.println("Enter an int");
                numbers[i] = parse(scanner.nextLine());
            }
        }
        System.out.println("Sum of the min and max is  "+sum(numbers));
    }

    public static Integer parse(String str){
        if (Pattern.matches("-?[0-9]+", str)){
            return Integer.parseInt(str);
        }
        return null;
    }

    public static int sum(Integer[] numbers){
        int min = numbers[0], max = numbers[0];
        for (int i=1; i<3; i++){
            if (numbers[i] < min){
                min = numbers[i];
            } else if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return min+max;
    }
}
