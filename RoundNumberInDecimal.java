import java.math.BigDecimal;
import java.math.RoundingMode;
public class RoundNumberInDecimal {
    public static void main(String[] args) {
        double number = 3.141592653589793;
        int decimalPlaces = 3;

        BigDecimal rounded = new BigDecimal(number).setScale(decimalPlaces, RoundingMode.HALF_UP);
        double result = rounded.doubleValue();

        System.out.println("Original number: " + number);
        System.out.println("Rounded number: " + result);
    }


}
