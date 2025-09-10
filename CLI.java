import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        CLI cli = new CLI();
        UnitConverter converter = new UnitConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to RAAScanner");
        wait(2);
        cli.printUnits();
        System.out.println("");
        System.out.println("Input number: ");
        int inputNumber = scanner.nextInt();
        System.out.println("Input initial unit: ");
        String initialValue = scanner.next();
        System.out.println("Input final unit: ");
        String finalValue = scanner.next();

    }

    public static void wait(int x) {
        try {
            Thread.sleep(x * 1000);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void printUnits(){
        String[] units = {"inch", "feet", "yard", "meter", "kilometer", "micrometer", "millimeter", "centimeter", "mile"};
        for (int i = 0; i < units.length; i++){
            System.out.println(units[i] + "\t");
        }
    }
}
