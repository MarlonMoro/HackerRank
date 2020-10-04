package com.hackerrank.java;

import java.util.Scanner;

public class StringPalindrome {

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    /* Enter your code here. Print output to STDOUT. */
    char[] chars = A.toCharArray();

    String reverseName = "";
    for(int i = A.length() - 1; i >= 0; i--){
      reverseName = reverseName.concat(Character.toString(chars[i]));
    }
    System.out.println(A.equals(reverseName) ? "Yes" : "No");

  }

}
