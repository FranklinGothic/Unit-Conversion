import java.util.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class cli {
    //delay
    public static void wait(int x) {
        try {
            Thread.sleep(x * 1000);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to RAAScanner");
        wait(2);

    }
    public void printUnits(){
        String[] units = {"inch", "feet", "yard", "meter", "kilometer", "micrometer", "millimeter", "centimeter", "mile"};
        for (int i = 0; i < units.length; i++){
            System.out.println(units[i] + "\t");
        }
    }
}
