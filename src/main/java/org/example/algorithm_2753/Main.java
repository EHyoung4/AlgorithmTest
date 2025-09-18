package org.example.algorithm_2753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String temp;

        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextLine();
        int tempInt = Integer.parseInt(temp);
        if(((tempInt%4) == 0 && ((tempInt%100) != 0)) || ((tempInt%400) == 0)){
            System.out.println("1");
        }else {
            System.out.println("0");

        }
    }
}
