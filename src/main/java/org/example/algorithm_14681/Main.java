package org.example.algorithm_14681;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp_x = scanner.nextLine();
        String temp_y = scanner.nextLine();
        int tempInt_x = Integer.parseInt(temp_x);
        int tempInt_y = Integer.parseInt(temp_y);
        int res;

        if(tempInt_x > 0){
            if(tempInt_y > 0){
                res = 1;
            }else{
                res = 4;
            }
        } else {
            if(tempInt_y > 0){
                res = 2;
            }else{
                res = 3;
            }
        }
        System.out.println(res);
    }
}
