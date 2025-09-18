package org.example.algorithm_2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nowtime = scanner.nextLine();
        String cooktime = scanner.nextLine();

        String[] nowtimeArr = nowtime.split(" ");
        int hh = Integer.parseInt(nowtimeArr[0]);
        int mm = Integer.parseInt(nowtimeArr[1]);
        int cooktimeInt = Integer.parseInt(cooktime);

        int res_mm = mm + cooktimeInt;
        int res_hh = hh + (res_mm/60);
        res_mm = res_mm % 60;

        if(res_hh >= 24){
            res_hh = res_hh - 24;
        }

        System.out.println(res_hh + " " + res_mm);
    }
}
