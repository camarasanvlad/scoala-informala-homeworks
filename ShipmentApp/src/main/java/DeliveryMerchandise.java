import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by camarasanvlad on 11/15/17.
 */

public class DeliveryMerchandise implements Runnable {
    public DeliveryMerchandise(MyPackage lista) {
            this.lista = lista;
    }



    private MyPackage lista;

    public DeliveryMerchandise(List<MyPackage> merchandiseList, String deliveryLocation, String date) {
    }

    @Override
    public void run() {


        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
        File f1 = new File("/Users/camarasanvlad/Documents/java/scoala-informala-java-samples-master" +
                "/java-g8/ShipmentApp/merchandiseDB.csv");
        Scanner scanner = null;
        try {
                scanner = new Scanner(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<MyPackage> packagesList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String data[] = scanner.nextLine().split(",");
            try {
                packagesList.add(new MyPackage((data[0]), Integer.parseInt(data[1]), Double.parseDouble(data[2]),
                        parser.parse(data[3])));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        scanner.close();

        OrganizeMerchandise grupPrinter = new OrganizeMerchandise();
        grupPrinter.OrganizeMerchandises(packagesList,"Gherla","2017-11-01");
        grupPrinter.OrganizeMerchandises(packagesList,"Dej","2017-11-01");
        grupPrinter.OrganizeMerchandises(packagesList,"Cluj","2017-11-01");

    }
}

