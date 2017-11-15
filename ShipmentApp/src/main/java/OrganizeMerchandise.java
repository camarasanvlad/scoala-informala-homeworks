import java.util.List;

/**
 * Created by camarasanvlad on 11/15/17.
 */
public class OrganizeMerchandise {

    public void OrganizeMerchandises(List<MyPackage> packageList, String deliveryLocation, String deliveryDate ) {
        for (MyPackage p : packageList) {
            if (deliveryLocation.equals(p.getTargetLocation())
                    && (deliveryDate.equals(p.getDeliveryDate()))) {
                System.out.println("[Delivering for <"+ deliveryLocation
                        + "> and date: <" + deliveryDate + "> in <"
                        +p.getTargetDistance()+"> seconds]");

            }

        }
    }


}
