import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException {
        CLI cli = new CLI();
        System.out.println("[1] - Length, [2] - Area, [3] - Volume");
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        Map<Integer, String> classType = Map.of(
                1, "Length",
                2, "Area",
                3, "Volume"
        );
        Class converter = fromType(classType.get(selection));

        System.out.println("Welcome to RAAScanner\n");
        double toConvertNum = cli.initialAmount();
        String initialUnit = cli.initialUnit(converter);
        String convertUnit = cli.convertUnit(converter);

        Method conversionMethod = converter.getDeclaredMethod(initialUnit, double.class);
        Method toMethod = converter.getDeclaredMethod("to_" + convertUnit, double.class);

        Map<String, String> units = (Map<String, String>) converter.getField("units").get(null);

        System.out.println(toConvertNum + " " + units.get(initialUnit) + " -> " + units.get(convertUnit));
        System.out.println(toMethod.invoke(null, conversionMethod.invoke(null, toConvertNum)) + " " + units.get(convertUnit));
    }
    public static Class fromType(String unitType) throws ClassNotFoundException {
        return Class.forName(UnitConverter.class.getName() + "$" + unitType);
    }
}
