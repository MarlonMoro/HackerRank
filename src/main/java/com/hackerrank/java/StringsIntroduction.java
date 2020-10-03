package com.hackerrank.java;

import java.util.Scanner;

public class StringsIntroduction {

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A= sc.next();
    String B= sc.next();

    char[] aChars = A.toCharArray();
    char[] bChars = B.toCharArray();

    String lexicographically = aChars[0] > bChars[0] ? "Yes" : "No";

    char aUpper = Character.toUpperCase(aChars[0]);
    char bUpper = Character.toUpperCase(bChars[0]);

    String capitalizeA = A.replace(aChars[0], aUpper);
    String capitalizeB = B.replace(bChars[0], bUpper);

    System.out.println(A.length() + B.length());
    System.out.println(lexicographically);
    System.out.println(capitalizeA + " " + capitalizeB);

  }

}
