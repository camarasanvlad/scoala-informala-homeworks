import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by camarasanvlad on 11/15/17.
 */
public class MyPackage {

    public String targetLocation;
    public int targetDistance;
    public double merchandiseValue;
    public Date deliveryDate;

    public MyPackage(String targetLocation, int targetDistance, double merchandiseValue, Date deliveryDate) {
        this.targetLocation = targetLocation;
        this.targetDistance = targetDistance;
        this.merchandiseValue = merchandiseValue;
        this.deliveryDate = deliveryDate;
    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public int getTargetDistance() {
        return targetDistance;
    }

    public double getMerchandiseValue() {
        return merchandiseValue;
    }

    public String getDeliveryDate() {
        return (new SimpleDateFormat("yyyy-MM-dd").format(deliveryDate));
    }

    @Override
    public String toString() {
        return String.format("Package{" +
                "targetLocation=" + targetLocation  +
                ", targetDistance=" + targetDistance +
                ", packageValue=" + merchandiseValue +
                ", deliveryDate=" + (new SimpleDateFormat("yyyy-MM-dd").format(deliveryDate)) +
                "}\n");
    }
}
