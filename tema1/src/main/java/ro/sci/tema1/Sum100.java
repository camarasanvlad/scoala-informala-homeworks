package ro.sci.tema1;

import java.util.Scanner;

/**
 * Created by camarasanvlad on 7/13/17.
 */
public class Sum100 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first x numbers that you want to be summed: ");
        int sum = 0, x = input.nextInt();
        sum = getSum(sum, x);
        System.out.print("The sum of first " + x + " numbers is " + sum);
    }

    /**
     *
     * @param sum represents all the summed numbers up to a given number;
     * @param x represents the given number by which all the numbers are summed;
     * @return the sum of all the numbers up to a given number, starting from 0;
     */
    private static int getSum(int sum, int x) {
        for(int i = 1; i <= x; i++)
        {
           sum = sum + i;
        }
        return sum;
    }
}
