import java.lang.reflect.Method;
public class Main {
    public static void main(String[] args) {
        CLI cli = new CLI();
        UnitConverter converter = new UnitConverter();

        System.out.println("Welcome to RAAScanner\n");

        double toConvertNum = cli.initialAmount();
        String initialUnit = cli.initialUnit();
        String convertUnit = cli.convertUnit();

        String toMethod = "to_" + initialUnit;
        Method conversionMethod = UnitConverter.Length.class.getMethod(toMethod, double.class);
        //Im done for now so we finish reflection tomrw
    }
}
