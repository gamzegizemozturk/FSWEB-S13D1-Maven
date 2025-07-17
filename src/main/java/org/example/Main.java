package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println("****");

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println("****");

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println("****");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of rectangle:");
        double width = scanner.nextDouble();
        System.out.println("Enter height of rectangle:");
        double height = scanner.nextDouble();
        System.out.println("Area of rectangle:" + area(width,height));

        System.out.println("****");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        double radius = scanner1.nextDouble();
        System.out.println("Area of the circle:" + area(radius));

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23 || !isBarking) {
            return false;
        }
        return clock >= 20 || clock < 8;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if ((firstAge > 13 && firstAge <= 19) || (secondAge > 13 && secondAge <= 19) || (thirdAge > 13 && thirdAge <= 19)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
       /* if ((temp > 20 && temp <= 35 && !isSummer) || (temp > 20 && temp <= 45 && isSummer)) {
            return true;
        }
        else{
            return false;
        }*/

        int lowestTemp = 25;
        int highestTemp = isSummer ? 45 : 35;

        return temp<=highestTemp && temp>lowestTemp;
    }

    public static double area(double width, double height) {
        if( width < 0 || height < 0){
            return -1;
        }
        return width*height;
    }

    public static double area(double radius) {
        if( radius < 0){
            return -1;
        }
        return  Math.pow(radius,2)*Math.PI;
    }

}