package exercises.chapter2;
import java.util.Scanner;

public class NumericTypes2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles");
        float miles = input.nextFloat();
        System.out.println("Enter gas gallons");
        float gas = input.nextFloat();
        float mpg = miles / gas;
        System.out.println("Miles per Gallon equal to " + mpg);
    }
}
