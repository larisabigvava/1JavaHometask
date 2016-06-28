package com.epam.bigvava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int");

        char[] number = null;
        String str;
        boolean flag = false;

        while (!flag) {
            flag = checkInput(str = scanner.nextLine());
            if (flag){
                number = str.toCharArray();
            } else {
                System.out.println("It is not a four-digit int");
            }
        }
        System.out.print(compare(number));

    }

    public static boolean compare(char[] number){
        Integer[] numbers = new Integer[4];
        for (int i=0;i < 4;i++){
            numbers[i] = Integer.parseInt(String.valueOf(number[i]));
        }
        if (numbers[0]+numbers[1] == numbers[2]+numbers[3]){
            return true;
        }
        return false;
    }

    public static boolean checkInput(String str){
        boolean flag = false;
        if (!str.startsWith("0")) {
            flag = Pattern.matches("[0-9]{4}", str);
        }
        return flag;
    }
}
