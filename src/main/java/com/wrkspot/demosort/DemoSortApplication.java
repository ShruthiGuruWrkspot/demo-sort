package com.wrkspot.demosort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class DemoSortApplication {
    static String str = "Can I block your calendar from 5:30 to 6pm today to review/discuss on test case scenarios for HK dashboard cards ";
    public static void main(String[] args) {
        SpringApplication.run(DemoSortApplication.class, args);
        String[] strArr = str.split(" ");
        int arrLength = strArr.length;
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arrLength; j++) {
                if (strArr[i].length() > strArr[j].length()) {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;

                }
            }
        }
        for (int i = 0; i < arrLength; i++) {
            System.out.println(strArr[i]+ " ");
        }
    }
}



