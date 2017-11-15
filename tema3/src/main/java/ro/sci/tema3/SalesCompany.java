package ro.sci.tema3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by camarasanvlad on 8/1/17.
 */
class SalesCompany {

    String companyName;
    List<SalesDepartment> salesDepartments;

    public SalesCompany(String companyName) {
        this.companyName = companyName;
        salesDepartments = new ArrayList<>(4);
    }

    @Override
    public String toString() {
        return "SalesCompany{" +
                "companyName='" + companyName + '\'' +
                ", \nsalesDepartments=" + salesDepartments +
                '}';
    }

    public long computeTotalSales() {
        int sum = 0;
        for (SalesDepartment salesRep : salesDepartments) {
            sum += salesRep.computeTotalSales();
        }
        return sum;
    }

    public void add(SalesDepartment salesDepartment) {
        salesDepartments.add(salesDepartment);
    }

    public SalesDepartment mostSuccessfulDep() {
        long max = 0;
        SalesDepartment mostSuccessfulDepartment = null;
        for (SalesDepartment salesDepartment : salesDepartments) {
            long totalSales = salesDepartment.computeTotalSales();
            if (max < totalSales) {
                max = totalSales;
                mostSuccessfulDepartment = salesDepartment;
            }
        }
        return mostSuccessfulDepartment;
    }

    public SalesRepresentative bestSalesRep() {
        long max = 0;
        SalesRepresentative bestSalesRepresentative = null;
        for (SalesDepartment salesDep : salesDepartments) {
            SalesRepresentative bestSalesRepDep = salesDep.bestSalesPerson();
            if (max < bestSalesRepDep.getWorthOfSales()) {
                max = bestSalesRepDep.getWorthOfSales();
                bestSalesRepresentative = bestSalesRepDep;
            }
        }
        return bestSalesRepresentative;
    }

}
