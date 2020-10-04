package com.hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubStringComparisions {


  public static String getSmallestAndLargest(String s, int k) {

    int limite = s.length()-k;

    String[] stringVector = new String[limite+1];

    for(int i = 0; i <= limite; i++){
      stringVector[i] = s.substring(i, k+i);
    }

    String smallest = stringVector[0];
    String largest = stringVector[0];
    for(String str : stringVector){
      if(smallest.compareTo(str) > 0){
        smallest = str;
      }
      if(largest.compareTo(str) < 0){
        largest = str;
      }
    }


    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'

    return smallest + "\n" + largest;
  }

  public static String streamSolution(String s, int k) {
    // This challenge do not accept Stream
    int limite = s.length()-k;
    List<String> subsString = new ArrayList<>();
    for(int i = 0; i <= limite; i++){
      subsString.add(s.substring(i, k+i));
    }
    String largest = subsString.stream().max(String::compareTo).orElse("max");
    String smallest = subsString.stream().min(String::compareTo).orElse("min");

    return smallest + "\n" + largest;
  }


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();

    System.out.println(getSmallestAndLargest(s, k));
  }

}
