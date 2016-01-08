/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bill.consoleio;

import java.util.Scanner;

/**
 *
 * @author Bill
 */
public class ConsoleIO {

    public int promptForInt(String prompt) {

        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (!sc.hasNext("[0-9]+")) {
            System.out.println("Enter a number!");
            sc.next();
        }

        int result = sc.nextInt();
        return result;

    }

    public int promptForIntPosNeg(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (!sc.hasNext("-?[0-9]+")) {
            System.out.println("Enter a number!");
            sc.next();
        }

        int result = sc.nextInt();
        return result;
    }

    public int promptForInt(String prompt, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int result;
        do {
            System.out.println(prompt);
            while (!sc.hasNext("-?[0-9]+")) {
                System.out.println("Enter a number!");
                sc.next();
            }
            result = sc.nextInt();

            if (result < min || result > max) {
                System.out.println("Must be between " + min + " and " + max + ".");
            }

        } while (result > max || result < min);
        return result;
    }

    public float promptForFloat(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (!sc.hasNext("\\d+\\.\\d+||[0-9]+")) {
            System.out.println("Enter a number!");
            sc.next();
        }
        float result = sc.nextFloat();
        return result;
    }
    
    public float promptForFloatPosNeg(String prompt) {
                Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (!sc.hasNext("-?\\d+\\.\\d+||-?[0-9]+")) {
            System.out.println("Enter a number!");
            sc.next();
        }
        float result = sc.nextFloat();
        return result;
    }

    public float promptForFloat(String prompt, float min, float max) {
        Scanner sc = new Scanner(System.in);
        float result;
        do {
            System.out.println(prompt);
            while (!sc.hasNext("-?\\d+\\.\\d+||-?[0-9]+")) {
                System.out.println("Enter a number!");
                sc.next();
            }
            result = sc.nextFloat();

            if (result < min || result > max) {
                System.out.println("Must be between " + min + " and " + max + ".");
            }

        } while (result > max || result < min);
        return result;
    }

    public double promptForDouble(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (!sc.hasNext("\\d+\\.\\d+||[0-9]+")) {
            System.out.println("Enter a number!");
            sc.next();
        }
        double result = sc.nextDouble();
        return result;
    }
    
    public double promptForDoublePosNeg(String prompt) {
                Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (!sc.hasNext("-?\\d+\\.\\d+||-?[0-9]+")) {
            System.out.println("Enter a number!");
            sc.next();
        }
        double result = sc.nextDouble();
        return result;
    }

    public double promptForDouble(String prompt, double min, double max) {
        Scanner sc = new Scanner(System.in);
        double result;
        do {
            System.out.println(prompt);
            while (!sc.hasNext("-?\\d+\\.\\d+||-?[0-9]+")) {
                System.out.println("Enter a number!");
                sc.next();
            }
            result = sc.nextDouble();

            if (result < min || result > max) {
                System.out.println("Must be between " + min + " and " + max + ".");
            }

        } while (result > max || result < min);
        return result;
    }

    public String promptForString(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();

    }

    public void printOut(String prompt) {
        System.out.println(prompt);
    }

}
