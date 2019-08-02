package com.hackerrank.java;

import java.util.Scanner;

class JavaLoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int result = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            result = a + b;
            System.out.print(result + " ");
            for(int j = 1; j < n; j++){
                result = (int) (result + Math.pow(2,j) * b);
                System.out.print(result + " ");

            }
            System.out.print("\n");
        }
        in.close();
    }
}