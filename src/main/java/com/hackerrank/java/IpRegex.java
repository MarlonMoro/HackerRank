package com.hackerrank.java;

public class IpRegex {

  public static void main(String[] args) {

    String[] ips = {"000.12.234.23.23", "000.12.12.034", "000.234.12.123"};

    for (String ip : ips) {
      System.out.println(ip.matches(new MyRegex().pattern));
    }

  }

}

class MyRegex {

  String pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}";
}
