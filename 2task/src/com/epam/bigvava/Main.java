package com.epam.bigvava;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float a = null;
        Float b = null;
        Float c = null;
        while (a==null){
            System.out.println("Enter number A");
            a = parse(scanner.nextLine());
        }
        while (b==null){
            System.out.println("Enter number B");
            b = parse(scanner.nextLine());
        }
        while (c==null){
            System.out.println("Enter number C");
            c = parse(scanner.nextLine());
        }

        System.out.println("Result is"+" "+func(a,b,c));
    }

    public static Float parse(String str){
        if (Pattern.matches("-?[0-9]+(\\.[0-9]+)?", str)){
            return Float.parseFloat(str);
        }
        return null;
    }

    public static double func(Float a, Float b, Float c){
        return ((b+sqrt(pow(b,2)+ 4*a*c))/2*a - pow(a,3)*c+pow(b,-2));
    }
}
