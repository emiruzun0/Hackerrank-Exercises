import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int posCount = 0, negCount = 0, zeroCount = 0;
        for(int number : arr){
            if(number > 0) posCount++;
            else if(number < 0) negCount++;
            else zeroCount++;
        }

        double posRatio = (double) posCount/n;
        double negRatio = (double) negCount/n;
        double zeroRatio = (double) zeroCount/n;

        System.out.println(String.format("%.6f", posRatio));
        System.out.println(String.format("%.6f", negRatio));
        System.out.println(String.format("%.6f", zeroRatio));

    }

}

