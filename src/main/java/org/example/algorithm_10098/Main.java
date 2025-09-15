package org.example.algorithm_10098;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String temp;

        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextLine();
        String[] arr = temp.split(" ");
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);

        System.out.println(A*B);
    }
}

// import 까지 제출해야 함.