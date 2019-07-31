package com.hackerrank.problemsolving;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        Integer nextDivisivel = 0;
        List<Integer> notasAtualizadas = new ArrayList<>();

        for(Integer nota : grades){
            if(nota < 38){
                notasAtualizadas.add(nota);
                continue;
            }
            int i = nota;
            do {
                i++;
                if(i % 5 == 0){
                    nextDivisivel = i;
                }

            }while (i % 5 != 0);

            if(nextDivisivel - nota < 3){
                notasAtualizadas.add(nextDivisivel);
            }else {
                notasAtualizadas.add(nota);
            }
        }

        return notasAtualizadas;

    }

}

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}