import java.util.*;

public class CLI {
    public double initialAmount(){
        Scanner input = new Scanner(System.in);

        System.out.println("Input number: ");
        double inputNumber = input.nextDouble();

        return inputNumber;
    }

    public String initialUnit(Class unit) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<String> units = new ArrayList<>(((Map<String, String>) unit.getField("units").get(null)).keySet());
        System.out.println("Please select a unit to convert from!\t");
        printUnits(units);
        System.out.print("\nUnit to convert from: ");
        return getUnit();
    }

    public String convertUnit(Class unit) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<String> units = new ArrayList<>(((Map<String, String>) unit.getField("units").get(null)).keySet());
        System.out.println("Please select a unit to convert too!\t");
        printUnits(units);
        System.out.print("\nUnit to convert too: ");
        return getUnit();
    }

    private void printUnits(ArrayList<String> units){
        for (int i = 0; i < units.size(); i++){
            System.out.print(units.get(i));
            spacing(units.get(i));
            if (i % 2 == 1 || i == units.size() - 1) {
                System.out.println();
            }
        }
    }
    private void spacing(String unit){
        int wordLength = unit.length();
        int spacing = 12 - wordLength;
        for (int i = 0; i < spacing; i++){
            System.out.print(" ");
        }
    }
    private String getUnit(){
        Scanner input = new Scanner(System.in);
        String unit = input.nextLine();
        return unit;
    }
}
