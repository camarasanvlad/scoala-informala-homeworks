package ro.sci.tema3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by camarasanvlad on 8/1/17.
 */
class SalesDepartment {

    String deparmentName;
    List<SalesRepresentative> salesRepresentatives;

    public SalesDepartment(String deparmentName) {
        this.deparmentName = deparmentName;
        salesRepresentatives = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nSalesDepartment{" +
                "deparmentName='" + deparmentName + '\'' +
                ", \nsalesRepresentatives=" + salesRepresentatives +
                '}';
    }

    public long computeTotalSales() {
        int sum = 0;
        for (SalesRepresentative salesRepresentative : salesRepresentatives) {
            sum += salesRepresentative.getWorthOfSales();
        }
        return sum;
    }

    public SalesRepresentative bestSalesPerson() {
        int max = 0;
        SalesRepresentative bestSalesPerson = null;
        for (SalesRepresentative salesRepresentative : salesRepresentatives) {
            if (max < salesRepresentative.getWorthOfSales()) {
                max = salesRepresentative.getWorthOfSales();
                bestSalesPerson = salesRepresentative;
            }
        }
        return bestSalesPerson;
    }

    public void add(SalesRepresentative salesRepresentative) {
        salesRepresentatives.add(salesRepresentative);
    }
}
