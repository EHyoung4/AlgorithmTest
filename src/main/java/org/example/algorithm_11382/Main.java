package org.example.algorithm_11382;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        String[] arr = temp.split(" ");
        long A = Long.parseLong(arr[0]);
        long B = Long.parseLong(arr[1]);
        long C = Long.parseLong(arr[2]);

        System.out.println(A+B+C);
    }
}
