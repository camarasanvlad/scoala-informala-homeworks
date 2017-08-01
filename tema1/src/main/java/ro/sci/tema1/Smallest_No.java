package ro.sci.tema1;

import java.util.Scanner;

/**
 * Created by camarasanvlad on 7/13/17.
 */
public class Smallest_No {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x for how many numbers you would like to enter: ");
        int x = input.nextInt();
        int[] myList = new int[x];
        System.out.print("Enter " + myList.length + " values: ");
        int min = getMin(input, myList);
        System.out.println("The smallest number is " + min);
    }

    /**
     * @param input represents how many numbers are entered in the list;
     * @param myList represents the list of numbers;
     * @return the smallest number from a list of numbers;
     */
    private static int getMin(Scanner input, int[] myList) {
        for (int i = 0; i < myList.length; i++){
            myList[i] = input.nextInt();
        }
        int min = myList[0];
        for(int i = 1; i < myList.length; i++){
            if (myList[i] < min) {
                min = myList[i];
            }
        }
        return min;
    }
}
