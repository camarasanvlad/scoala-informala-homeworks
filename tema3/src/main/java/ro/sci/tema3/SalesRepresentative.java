package ro.sci.tema3;

/**
 * Created by camarasanvlad on 7/25/17.
 */
class SalesRepresentative {
    String name;
    int sales;
    int quota;

    /**
     * @param name  holds the name of the sales representative;
     * @param sales is the number of total sales of the sales representative;
     * @param quota is the amount of money that a sales representative receives from a sale;
     */
    public SalesRepresentative(String name, int sales, int quota) {
        this.name = name;
        this.sales = sales;
        this.quota = quota;
    }

    @Override
    public String toString() {
        return "\nSalesRepresentative{" +
                "name=" + name +
                ", sales=" + sales +
                ", quota=" + quota +
                '}';
    }

    int getWorthOfSales() {
        return sales * quota;
    }

}
