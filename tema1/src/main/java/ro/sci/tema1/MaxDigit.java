package ro.sci.tema1;

import java.util.Scanner;

/**
 * Created by camarasanvlad on 7/13/17.
 */
public class MaxDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one number to check it's highest digit: ");

        int x = input.nextInt();
        int MaxDigit = max(x);

        System.out.println("Max digit is " + MaxDigit);
    }

    /**
     * @return the highest digit from an integer number.
     * @param x represents the number that is verified;
     */

    public static int max(int x) {
        int max = 0;
        int temp;
        while (x != 0) {
            temp = x % 10;
            x = x / 10;
            if (max < temp) {
                max = temp;
            }

        }
        return max;
    }
}
