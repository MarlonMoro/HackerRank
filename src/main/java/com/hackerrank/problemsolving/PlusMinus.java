package com.hackerrank.problemsolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus{

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        float negative = 0F;
        float positive = 0F;
        float zero = 0F;
        for(int i : arr){
            if(i < 0){
                negative++;
            }else if (i == 0){
                zero++;
            }else {
                positive++;
            }
        }

        float arraySize = (float) arr.length;

        NumberFormat ds = DecimalFormat.getNumberInstance();
        ds.setMinimumFractionDigits(6);
        ds.setMaximumFractionDigits(6);
        System.out.println(ds.format(positive/arraySize));
        System.out.println(ds.format(negative/arraySize));
        System.out.println(ds.format(zero/arraySize));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[6];


        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}