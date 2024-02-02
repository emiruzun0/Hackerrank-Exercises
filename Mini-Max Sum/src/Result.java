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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;
        long totalSum = 0;

        for (int num : arr) {
            totalSum += num;
            if (num < minSum) {
                minSum = num;
            }
            if (num > maxSum) {
                maxSum = num;
            }
        }

        long minPossibleSum = totalSum - maxSum;
        long maxPossibleSum = totalSum - minSum;

        System.out.println(minPossibleSum + " " + maxPossibleSum);

    }

}

