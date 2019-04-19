package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int userNum;
        int num;
        boolean prime = true;

        System.out.println("Please input the last number in a range to see prime numbers.");
        System.out.print("Number: ");
        userNum = keyboard.nextInt();


        for ( num = 1; num <= userNum; num++){

            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    prime = false;
                    break;
                } else {
                    prime = true;
                }
            }
            if(num == 1) {
                System.out.println(num + " is not a prime number");
            } else if (prime == true) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }

    }


}
