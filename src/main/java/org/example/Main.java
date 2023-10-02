package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForWalk(22, 0));
        System.out.println(checkForWalk(20, 10));
        System.out.println(checkForWalk(18, 17));
        System.out.println(checkForWalk(51, -3));
        System.out.println(checkForWalk(12, -1));


        System.out.println(checkForWalk(generateRandomAge(), 10));
        // при значении temp = 10 всегда будет положительный ответ
    }

    public static String checkForWalk(int age, int temp) {
        String youCanGo = "Можно идти гулять";
        String youCantGo = "Оставайтесь дома";

        if ((age >= 20 && age <= 45) && (temp >= -20 && temp <= 30)) {
            return youCanGo;
        } else if (age < 20 && (temp >= 0 && temp <= 28)) {
            return youCanGo;
        } else if (age > 45 && (temp >= -10 && temp <= 25)) {
            return youCanGo;
        } else {
            return youCantGo;
        }
    }

    public static int generateRandomAge() {
        Random rand = new Random();
        return rand.nextInt(100); // age from 0 to 100
    }
}