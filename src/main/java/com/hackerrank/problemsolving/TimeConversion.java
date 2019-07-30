package com.hackerrank.problemsolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */

        String parsePattern = "hh:mm:ssa";
        DateTimeFormatter parseFormatter = DateTimeFormatter.ofPattern(parsePattern);
        LocalTime horario = LocalTime.parse(s, parseFormatter);

        String timeShow = "HH:mm:ss";
        DateTimeFormatter timeFormatShow = DateTimeFormatter.ofPattern(timeShow);


        return timeFormatShow.format(horario);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();
        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
