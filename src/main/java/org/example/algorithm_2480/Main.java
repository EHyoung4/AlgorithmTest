package org.example.algorithm_2480;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();

        String[] tempArr = temp.split(" ");
        int tempArr1 = Integer.parseInt(tempArr[0]);
        int tempArr2 = Integer.parseInt(tempArr[1]);
        int tempArr3 = Integer.parseInt(tempArr[2]);

        int res = 0;
        if(tempArr1 == tempArr2 && tempArr1 == tempArr3){
            res = 10000 + (tempArr1 * 1000);
        }else if(tempArr1 == tempArr2 && tempArr1 != tempArr3){
            res = 1000 + (tempArr1 * 100);
        }else if(tempArr1 != tempArr2 && tempArr1 == tempArr3){
            res = 1000 + (tempArr1 * 100);
        }else if(tempArr1 != tempArr2 && tempArr2 == tempArr3){
            res = 1000 + (tempArr2 * 100);
        }else {
            int max = tempArr1;
            if(max < tempArr2){
                max = tempArr2;
            }
            if(max < tempArr3){
                max = tempArr3;
            }
            res = max * 100;
        }
        System.out.println(res);
    }
}
