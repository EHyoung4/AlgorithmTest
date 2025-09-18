package org.example.algorithm_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        String[] arr = temp.split(" ");
        int hh = Integer.parseInt(arr[0]);
        int mm = Integer.parseInt(arr[1]);

        if(mm < 45){

            if(hh == 0){
                hh = 24;
            }
            hh = hh - 1;
            mm = mm + 15;
        } else {
            mm = mm - 45;
        }
        System.out.println(hh + " " + mm);
    }
}
