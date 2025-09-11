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

   public class Area {
       public static final Map<String, String> units = Map.of(
               "inch", "in^2",
               "feet", "ft^2",
               "yard", "yd^2",
               "mile", "mi^2",
               "centimeter", "cm^2",
               "meter", "m^2",
               "kilometer", "km^2",
               "acre", "acre"
       );

       public static double inch(double x) {
           return x * 0.00064516;
       }

       public static double feet(double x) {
           return x * 0.092903;
       }

       public static double yard(double x) {
           return x * 0.836127;
       }

       public static double mile(double x) {
           return x * 2590000;
       }

       public static double acre(double x) {
           return x * 4046.8750015178;
       }

       public static double meter(double x) {
           return x;
       }

       public static double cm(double x) {
           return x * 0.0001;
       }

       public static double km(double x) {
           return x * 1000000;
       }

       public static double to_inch(double x) {
           return x / 0.00064516;
       }

       public static double to_feet(double x) {
           return x / 0.092903;
       }

       public static double to_yard(double x) {
           return x / 0.836127;
       }

       public static double to_mile(double x) {
           return x / 2590000;
       }

       public static double to_acre(double x) {
           return x / 4046.8750015178;
       }

       public static double to_meter(double x) {
           return x;
       }

       public static double to_cm(double x) {
           return x / 0.0001;
       }

       public static double to_km(double x) {
           return x / 1000000;
       }
   }

   public class Volume {}
   public class Mass {}
}
