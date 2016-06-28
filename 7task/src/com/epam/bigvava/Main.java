package com.epam.bigvava;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Math.sin;
import static java.lang.Math.pow;
import static java.lang.Math.cos;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float a = null, b = null, h = null;
        while (a==null) {
            System.out.println("Enter a");
            a = parse(scanner.nextLine());
        }
        while (b==null || b<=a) {
            System.out.println("Enter b greater than a");
            b = parse(scanner.nextLine());
        }
        while (h==null) {
            System.out.println("Enter h");
            h = parse(scanner.nextLine());
        }
        double func;
        System.out.println("--------------");
        System.out.println("|  x  | f(x) |");
        System.out.println("--------------");

        while (a<b+0.5*h) {
            func = calculate(a);
            if (func < 0) {
                System.out.println("|" + String.format("%.3f", a) + "|" + String.format("%.3f", func) + "|");
            } else {
                System.out.println("|" + String.format("%.3f", a) + "|" + String.format(" %.3f", func) + "|");
            }
            System.out.println("--------------");
            a += h;
        }
    }

    public static Float parse(String str){
        if (Pattern.matches("-?[0-9]+(\\.[0-9]+)?", str)){
            return Float.parseFloat(str);
        }
        return null;
    }

    public static double calculate(Float x){
        return pow(sin(x), 2) - cos(2 * x);

    }
}
