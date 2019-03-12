package com.company;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        System.out.println("Welcome to Multiplication Tables");
        System.out.println("How large would you like to see them? ");
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        for (int i = 0; i <= size; i++) {
            for (int x = 0; x <= size; x++) {
                System.out.println(+ i + "*" + x + "=" + (i*x));
                }
            }


        }

    }







