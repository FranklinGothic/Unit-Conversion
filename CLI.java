import java.util.Scanner;

public class CLI {
    private final String[] units = {"inch", "feet", "yard", "mile", "nanometer", "micrometer", "millimeter", "centimeter", "meter", "kilometer"};

    public double initialAmount(){
        Scanner input = new Scanner(System.in);

        System.out.println("Input number: ");
        double inputNumber = input.nextDouble();

        return inputNumber;
    }

    public String initialUnit(){
        System.out.println("Please select a unit to convert from!\t");
        printUnits();
        System.out.print("\nUnit to convert from: ");
        return getUnit();
    }

    public String convertUnit(){
        System.out.println("Please select a unit to convert too!\t");
        printUnits();
        System.out.print("\nUnit to convert too: ");
        return getUnit();
    }

    private void printUnits(){
        for (int i = 0; i < units.length; i++){
            System.out.print(units[i]);
            spacing(i);
            if (i % 2 == 1 || i == units.length - 1) {
                System.out.println();
            }
        }
    }
    private void spacing(int index){
        int wordLength = units[index].length();
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
