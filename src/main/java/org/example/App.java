/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;

import java.util.Scanner;


public class App {
    public String getMonth(int month){

        switch (month) {

            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "error";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        App numberToName = new App();
        
        System.out.print("Please enter the number of the month: ");
        int month = scanner.nextInt();

        String result = numberToName.getMonth(month);
        if(month > 0 && month < 12)
            System.out.print("The name of the month is " + result + ".");
        else
            System.out.print("Error! Please enter the correct number of the month.");

    }
}