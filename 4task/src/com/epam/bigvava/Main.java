package com.epam.bigvava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer x = null, y = null;
        while (x==null) {
            System.out.println("Enter x");
            x = parse(scanner.nextLine());
        }
        while (y==null) {
            System.out.println("Enter y");
            y = parse(scanner.nextLine());
        }

        System.out.println(isEnter(x,y));
    }

    public static Integer parse(String str){
        if (Pattern.matches("-?[0-9]+", str)){
            return Integer.parseInt(str);
        }
        return null;
    }

    public static boolean isEnter(Integer x, Integer y){
        boolean result = false;
        if (x<=4 && y<=4){
            if (y<=0 && y>=-3 && x>=-4 && x<=4){
                result = true;
            } else if (y>0 && x>=-2 && x<=2){
                result = true;
            }
        }
        return result;
    }
}
