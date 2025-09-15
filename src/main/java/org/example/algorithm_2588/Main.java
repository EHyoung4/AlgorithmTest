package org.example.algorithm_2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String temp1 = scanner.nextLine();
        String temp2 = scanner.nextLine();

        int res1 = Integer.parseInt(temp1);
        int res2 = Integer.parseInt(temp2);

        String[] arr1 = temp2.split("");
        int a1 = Integer.parseInt(arr1[0]);
        int a2 = Integer.parseInt(arr1[1]);
        int a3 = Integer.parseInt(arr1[2]);

        System.out.println(res1*a3);
        System.out.println(res1*a2);
        System.out.println(res1*a1);
        System.out.println(res1*res2);
    }
}
