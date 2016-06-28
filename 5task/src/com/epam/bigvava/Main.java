package com.epam.bigvava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float[] numbers = new Float[3];
        int i;
        double number;
        for(i=0;i<3;i++){
            numbers[i]=null;
            while (numbers[i]==null) {
                System.out.println("Enter a float number");
                numbers[i] = parse(scanner.nextLine());
            }
        }

        for(i=0;i<3;i++){
            System.out.println(power(numbers[i]));
        }
    }

    public static Float parse(String str){
        if (Pattern.matches("-?[0-9]+(\\.[0-9]+)?", str)){
            return Float.parseFloat(str);
        }
        return null;
    }

    public static double power(Float number){
        if(number < 0) {
            return Math.pow(number,4);
        }
        else {
            return number*number;
        }
    }
}
