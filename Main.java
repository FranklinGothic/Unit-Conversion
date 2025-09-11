import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        CLI cli = new CLI();
        UnitConverter converter = new UnitConverter();

        System.out.println("Welcome to RAAScanner\n");
        double toConvertNum = cli.initialAmount();
        String initialUnit = cli.initialUnit();
        String convertUnit = cli.convertUnit();

        Method conversionMethod = UnitConverter.Length.class.getDeclaredMethod(initialUnit, double.class);
        Method toMethod = UnitConverter.Length.class.getDeclaredMethod("to_" + convertUnit, double.class);

        System.out.println(toConvertNum + " " + UnitConverter.Length.units.get(initialUnit) + " -> " + UnitConverter.Length.units.get(convertUnit));
        System.out.println(toMethod.invoke(null, conversionMethod.invoke(null, toConvertNum)) + " " + UnitConverter.Length.units.get(convertUnit));
        //Im done for now so we finish reflection tomrw
    }
}
