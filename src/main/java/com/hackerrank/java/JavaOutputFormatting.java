package com.hackerrank.java;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i<3 ;i++)
        {
            String s1=sc.next();
            sc.nextLine();
            int x=sc.nextInt();

            System.out.print(s1);
            for(int j = s1.length(); j < 15; j++){
                System.out.print(" ");
            }
            System.out.printf("%03d\n", x);

        }
        System.out.println("================================");

    }
}


