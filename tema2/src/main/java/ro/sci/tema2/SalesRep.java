package ro.sci.tema2;

import java.util.Scanner;

/**
 * Created by camarasanvlad on 7/22/17.
 */

public class SalesRep {

    public static void main(String[] args) {

        /**
         This method creates the list of objects based on created objects of Sales Representative with the following
         characteristics: name, number of sales, quota of sales and worth of sales which is the product
         between number of sales and quota of sales.).
         */
        SalesRepresentative[] salesRepresentatives = inputData();
        System.out.println("\nThis is the list of sales representatives:");

        /**
         This method prints the list of Sales Representative in the order as they were introduced from the keyboard
         (Sales Representative - name, number of sales, quota of sales and worth of sales which is the product
         between number of sales and quota of sales.
         */
        printCollection(salesRepresentatives);

        /**
         This method is sorting the list of Sales Representative in descending order based on the amount of revenue
         generated via sales. After the sorting, the first Sales Representative should be the one with the most
         revenue generated. The last Sales Representative in the list should be the one with the least revenue generated.
         */
        sort(salesRepresentatives);
        System.out.println("\nThis is the list of sales representatives in descending order based on the amount " +
                "of revenue generated via sales:");
        printCollection(salesRepresentatives);
    }

    private static void sort(SalesRepresentative[] salesRepresentatives) {
        for (int k = 1; k < salesRepresentatives.length; k++) {
            for (int i = 0; i < salesRepresentatives.length - k; i++) {
                if (salesRepresentatives[i].getWorthOfSales() < salesRepresentatives[i + 1].getWorthOfSales()) {
                    SalesRepresentative aux = salesRepresentatives[i];
                    salesRepresentatives[i] = salesRepresentatives[i + 1];
                    salesRepresentatives[i + 1] = aux;
                }
            }
        }
    }

    private static void printCollection(SalesRepresentative[] salesRepresentatives) {
        for (SalesRepresentative guy : salesRepresentatives) {
            System.out.println("Sales guy " + guy.name + ", has " + guy.sales + " sales with a quota of "
                    + guy.quota + "$. " + guy.name + " achieved " + guy.getWorthOfSales() + "$ worth of sales.");
        }
    }

    private static SalesRepresentative[] inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many sales guys: ");
        int guys = input.nextInt();
        SalesRepresentative[] lista = new SalesRepresentative[guys];
        for (int i = 1; i <= guys; i++) {
            System.out.println("Enter name for sales representative number " + i + ": ");
            String name = input.next();
            System.out.println("Enter how many sales had " + name + ": ");
            int sales = input.nextInt();
            System.out.println("Enter quota for " + name + ": ");
            int quota = input.nextInt();
            SalesRepresentative guy = new SalesRepresentative(name, sales, quota);
            lista[i - 1] = guy;
        }
        return lista;
    }
}


