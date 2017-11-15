import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by camarasanvlad on 11/15/17.
 */
public class ShipmentApp {
    public ShipmentApp() throws FileNotFoundException {

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {



        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
        File packagesDeliveryData = new File("/Users/camarasanvlad/Documents/java/scoala-informala-java-samples-master" +
                "/java-g8/ShipmentApp/merchandiseDB.csv");
        Scanner scanner = new Scanner(packagesDeliveryData);
        List<MyPackage> merchandiseList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data[] = scanner.nextLine().split(",");
            merchandiseList.add(new MyPackage((data[0]), Integer.parseInt(data[1]), Double.parseDouble(data[2]),
                    parser.parse(data[3])));
        }
        scanner.close();

/*
Sort list by delivery location and delivery date.
*/

        merchandiseList.sort(Comparator.comparing(MyPackage::getTargetLocation).thenComparing(MyPackage::getDeliveryDate));
        System.out.println("Display merchandise list: ");
        System.out.println(merchandiseList);

        System.out.println("\nDisplay merchandise value for each package:");

        int DejValue1 = 0;
        int DejValue2 = 0;
        int DejValue3 = 0;
        for (MyPackage element:merchandiseList) {
            if (element.getTargetLocation().equals("Dej") && element.getDeliveryDate().equals("2017-11-01")) {
                DejValue1 += element.getMerchandiseValue();
            }
        }
        System.out.println("\nMerchandise value for Dej 2017-11-01 is "+DejValue1);

        for (MyPackage element:merchandiseList) {
            if (element.getTargetLocation().equals("Dej") && element.getDeliveryDate().equals("2017-11-02")) {
                DejValue2 += element.getMerchandiseValue();
            }
        }
        System.out.println("Merchandise value for Dej 2017-11-02 is "+DejValue2);

        for (MyPackage element:merchandiseList) {
            if (element.getTargetLocation().equals("Dej") && element.getDeliveryDate().equals("2017-11-03")) {
                DejValue3 += element.getMerchandiseValue();
            }
        }
        System.out.println("Merchandise value for Dej 2017-11-03 is "+DejValue3);


        int GherlaValue1 = 0;
        int GherlaValue2 = 0;
        int GherlaValue3 = 0;
        for (MyPackage element:merchandiseList) {
            if (element.getTargetLocation().equals("Gherla") && element.getDeliveryDate().equals("2017-11-01")) {
                GherlaValue1 += element.getMerchandiseValue();
            }
        }
        System.out.println("\nMerchandise value for Gherla 2017-11-01 is "+GherlaValue1);

        for (MyPackage element:merchandiseList) {
            if (element.getTargetLocation().equals("Gherla") && element.getDeliveryDate().equals("2017-11-02")) {
                GherlaValue2 += element.getMerchandiseValue();
            }
        }
        System.out.println("Merchandise value for Gherla 2017-11-02 is "+GherlaValue2);

        for (MyPackage element:merchandiseList) {
            if (element.getTargetLocation().equals("Gherla") && element.getDeliveryDate().equals("2017-11-03")) {
                GherlaValue3 += element.getMerchandiseValue();
            }
        }
        System.out.println("Merchandise value for Gherla 2017-11-03 is "+GherlaValue3);

        int ClujValue1 = 0;
        int ClujValue2 = 0;
        int ClujValue3 = 0;
        for (MyPackage element:merchandiseList) {
            if (element.getTargetLocation().equals("Cluj") && element.getDeliveryDate().equals("2017-11-01")) {
                ClujValue1 += element.getMerchandiseValue();
            }
        }
        System.out.println("\nMerchandise value for Cluj 2017-11-01 is "+ClujValue1);

        for (MyPackage element:merchandiseList) {
            if (element.getTargetLocation().equals("Cluj") && element.getDeliveryDate().equals("2017-11-02")) {
                ClujValue2 += element.getMerchandiseValue();
            }
        }
        System.out.println("Merchandise value for Cluj 2017-11-02 is "+ClujValue2);

        for (MyPackage element:merchandiseList) {
            if (element.getTargetLocation().equals("Cluj") && element.getDeliveryDate().equals("2017-11-03")) {
                ClujValue3 += element.getMerchandiseValue();
            }
        }
        System.out.println("Merchandise value for Cluj 2017-11-03 is "+ClujValue3);


        int totalDeliveredMerchandiseValue = 0;
        for (MyPackage element:merchandiseList) {
            totalDeliveredMerchandiseValue += element.getMerchandiseValue();
        }
        System.out.println("\nTotal value of delivered merchandise is: "+totalDeliveredMerchandiseValue);

        System.out.println("\nRequired delivery time for each Merchandise");

        OrganizeMerchandise m = new OrganizeMerchandise();

        m.OrganizeMerchandises(merchandiseList,"Dej","2017-11-01");
        m.OrganizeMerchandises(merchandiseList,"Dej","2017-11-02");
        m.OrganizeMerchandises(merchandiseList,"Dej","2017-11-03");
        m.OrganizeMerchandises(merchandiseList,"Gherla","2017-11-01");
        m.OrganizeMerchandises(merchandiseList,"Gherla","2017-11-02");
        m.OrganizeMerchandises(merchandiseList,"Gherla","2017-11-03");
        m.OrganizeMerchandises(merchandiseList,"Cluj","2017-11-01");
        m.OrganizeMerchandises(merchandiseList,"Cluj","2017-11-02");
        m.OrganizeMerchandises(merchandiseList,"Cluj","2017-11-03");

    }
}
