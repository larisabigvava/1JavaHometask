package com.epam.bigvava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float a = null;
        Float b = null;
        while (a==null){
            System.out.println("Enter positive value for A");
            a = parse(scanner.nextLine());
        }
        while (b==null){
            System.out.println("Enter positive value for B");
            b = parse(scanner.nextLine());
        }
        System.out.println("Square is " + a * b);

    }

    public static Float parse(String str){
        if (Pattern.matches("[0-9]+(\\.[0-9]+)?", str)){
            return Float.parseFloat(str);
        }
        return null;
    }
}
