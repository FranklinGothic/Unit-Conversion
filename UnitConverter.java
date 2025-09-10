import java.util.Map;

public class UnitConverter {
   public class Length {
       public static final Map<String, String> units = Map.of(
               "inch", "in",
               "feet", "ft",
               "yard", "yd",
               "mile", "mi",
               "nanometer", "nm",
               "micrometer", "um",
               "millimeter", "mm",
               "centimeter", "cm",
               "meter", "m",
               "kilometer", "km"
       );

       public static double inch(double x) {
           return x * 0.0254;
       }

       public static double feet(double x) {
           return x * 0.3048;
       }

       public static double yard(double x) {
           return x * 0.9144;
       }

       public static double mile(double x) {
           return x * 1609.34;
       }

       public static double nanometer(double x) {
           return x / 1000000000;
       }

       public static double micrometer(double x) {
           return x / 1000000;
       }

       public static double millimeter(double x) {
           return x / 1000;
       }

       public static double centimeter(double x) {
           return x / 100;
       }

       public static double meter(double x) {
           return x;
       }

       public static double kilometer(double x) {
           return x * 100000;
       }

       // TO

       public static double to_inch(double x) {
           return x / 0.0254;
       }

       public static double to_feet(double x) {
           return x / 0.3048;
       }

       public static double to_yard(double x) {
           return x / 0.9144;
       }

       public static double to_mile(double x) {
           return x / 1609.34;
       }

       public static double to_nanometer(double x) {
           return x * 1000000000;
       }

       public static double to_micrometer(double x) {
           return x * 1000000;
       }

       public static double to_millimeter(double x) {
           return x * 1000;
       }

       public static double to_centimeter(double x) {
           return x * 100;
       }

       public static double to_meter(double x) {
           return x;
       }

       public static double to_kilometer(double x) {
           return x / 100000;
       }
   }
}
