package com.company;

public class Math {
    public static boolean isPrimaryNumber(int number) {
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                System.out.println("i:" + i);
                if (number % i == 0) {
                    return false;
                }
            }
            return true;

        } else {
            return false;
        }
    }

    public static int exp(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
            System.out.println("=====================");
            System.out.println("i:" + i);
            System.out.println("num:" + number);
            System.out.println("exp:" + result);
        }
        return result;
    }

    public static boolean changeTemperature(int temp) {
        return temp > 15 && temp < 33;
    }

    public static boolean login(String username, String password) {
        return username.equalsIgnoreCase("Ducdt@123") && password.equalsIgnoreCase("123456");
    }
}
