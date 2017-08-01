package ro.sci.tema1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by camarasanvlad on 7/13/17.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Return all prime numbers smaller than: ");
        int limit = input.nextInt();
        final int Number_Per_Lines = 10;
        List<Integer> primeNumbers = findPrimeNumbers(limit);
        printPrimeNumbers(Number_Per_Lines, primeNumbers);
    }

    /**
     * @param number_Per_Lines represents how many numbers are on a line;
     * @param primeNumbers represents the prime numbers from the list;
     */
    private static void printPrimeNumbers(int number_Per_Lines, List<Integer> primeNumbers) {
        int count = 0;
        for (int i : primeNumbers) {
            count++;
            if (count % number_Per_Lines == 0) {
                System.out.println(i);
            } else
                System.out.print(i + " ");
        }
    }

    private static List<Integer> findPrimeNumbers(int limit) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 1; i < limit; i++) {
            boolean prime = isPrime(i);
            if (prime) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    private static boolean isPrime(int i) {
        boolean prime = true;
        if (i == 1) {
            prime = false;
        } else if (i == 2) {
            prime = true;
        } else if (i % 2 == 0) {
            prime = false;
        } else {
            for (int j = 3; j <= Math.sqrt(i); j = j + 2) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

}
