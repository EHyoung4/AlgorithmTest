package org.example.algorithm_1008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String temp;

        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextLine();
        String[] arr = temp.split(" ");
        double A = Double.parseDouble(arr[0]);
        double B = Double.parseDouble(arr[1]);

        System.out.println(A/B);
    }
}

// import 까지 제출해야 함.