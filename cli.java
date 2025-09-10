import java.util.*;
public class cli {
    public void printUnits(){
        String[] units = {"inch", "feet", "yard", "meter", "kilometer", "micrometer", "millimeter", "centimeter", "mile"};
        for (int i = 0; i < units.length; i++){
            System.out.println(units[i] + "\t");
        }
    }
}