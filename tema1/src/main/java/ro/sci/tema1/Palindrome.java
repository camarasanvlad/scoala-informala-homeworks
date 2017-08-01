package ro.sci.tema1;

import java.util.Scanner;

/**
 * Created by camarasanvlad on 6/22/16.
 */

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number or a word to check if is palindrome: ");
        String s = input.next();

        if(isPalindrome(s) )
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }

    /**
     * @param s represents the number / word that is entered;
     * @return if a number / word is palindrome
     */
    public static boolean isPalindrome (String s) {
        int low = 0;
        int high = s.length() - 1;
        boolean isPal = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPal = false;
                break;
            }
            low++;
            high--;
        }
        return isPal;
    }

    }
