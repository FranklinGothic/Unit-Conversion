import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        CLI cli = new CLI();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to RAAScanner");
        wait(2);
        cli.printUnits();
        System.out.println("Input number");
        int inputNumber = scanner.nextInt();
        wait(1);
        System.out.println("Input number");
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
            System.out.println(units[i] + "\t" + UnitConverter.Length.units.get(units[i]));
        }
    }
}
