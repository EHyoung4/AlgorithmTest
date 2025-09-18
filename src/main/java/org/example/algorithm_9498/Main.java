package org.example.algorithm_9498;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String temp;

        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextLine();
        int A = Integer.parseInt(temp);
        String res = "";
        switch(A/10){
            case 10:
            case 9:
                res = "A";
                break;
            case 8:
                res = "B";
                break;
            case 7:
                res = "C";
                break;
            case 6:
                res = "D";
                break;
            default:
                res = "F";
                break;
        }
        System.out.println(res);
    }
}
