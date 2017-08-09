package ro.sci.tema3;

import java.util.Scanner;

/**
 * Created by camarasanvlad on 7/22/17.
 */

public class App {

    public static void main(String[] args) {

        SalesCompany company = inputData();
        System.out.println("\nCompany: " + company + "\n");
        System.out.println("\nThe company achieved total worth of sales of " + company.computeTotalSales() + "$.");
        System.out.println("\nMost successful department is " + company.mostSuccessfulDep().departmentName + ".");
        System.out.println("\nBest sales person from entire company is " + company.bestSalesRep().name +
                " with " +company.bestSalesRep().sales + " sales, and total worth of sales of " +
                company.bestSalesRep().getWorthOfSales() + "$.");
    }

    private static SalesCompany inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of the company: ");
        String companyName = input.next();
        SalesCompany company = new SalesCompany(companyName);
        System.out.println("Enter number of departments: ");
        int numberOfDep = input.nextInt();
        for (int i = 0; i < numberOfDep; i++) {
            SalesDepartment salesDepartment = inputSalesDepartment(input);
            company.add(salesDepartment);
        }
        return company;
    }

    private static SalesDepartment inputSalesDepartment(Scanner input) {
        System.out.println("Enter name of department: ");
        String departmentName = input.next();
        SalesDepartment department = new SalesDepartment(departmentName);
        System.out.println("Enter number of sales representatives: ");
        int numberOfRepresentatives = input.nextInt();
        for (int i = 0; i < numberOfRepresentatives; i++) {
            SalesRepresentative salesRepresentative = inputSalesRepresentatives(input);
            department.add(salesRepresentative);
        }
        return department;
    }

    private static SalesRepresentative inputSalesRepresentatives(Scanner input) {
        System.out.println("Enter name for sales representative: ");
        String name = input.next();
        System.out.println("Enter how many sales had " + name + ": ");
        int sales = input.nextInt();
        System.out.println("Enter quota for " + name + ": ");
        int quota = input.nextInt();
        SalesRepresentative guy = new SalesRepresentative(name, sales, quota);
        return guy;
    }
}


